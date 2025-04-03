import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private static final String TEST_FILE = "test_file.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Ensure test file exists and is empty before each test
        new FileWriter(TEST_FILE, false).close();
    }

    @AfterEach
    void tearDown() {
        // Delete test file after each test
        new File(TEST_FILE).delete();
    }

    @Test
    void testWriteToFile() {
        assertDoesNotThrow(() -> FileProcessor.writeToFile(TEST_FILE, "Hello, JUnit!"));

        // Verify content was written
        try (BufferedReader reader = new BufferedReader(new FileReader(TEST_FILE))) {
            assertEquals("Hello, JUnit!", reader.readLine());
        } catch (IOException e) {
            fail("IOException occurred while verifying file content.");
        }
    }

    @Test
    void testReadFromFile() {
        try {
            FileProcessor.writeToFile(TEST_FILE, "Line 1\nLine 2");

            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            // Read from file
            assertDoesNotThrow(() -> FileProcessor.readFromFile(TEST_FILE));

            // Restore system output
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

            // Verify printed output
            String expectedOutput = "Line 1\nLine 2\n";
            assertEquals(expectedOutput, outContent.toString());
        } catch (IOException e) {
            fail("IOException occurred during test.");
        }
    }
}
