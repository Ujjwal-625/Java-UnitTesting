import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private static final String TEST_FILE = "test_file.txt";

    @BeforeEach
    void setUp() throws IOException {
        new FileWriter(TEST_FILE, false).close();
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete();
    }

    @Test
    void testWriteToFile() {
        assertDoesNotThrow(() -> FileProcessor.writeToFile(TEST_FILE, "Hello, JUnit!"));

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

            assertDoesNotThrow(() -> FileProcessor.readFromFile(TEST_FILE));

            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

            String expectedOutput = "Line 1\nLine 2\n";
//            assertEquals(expectedOutput.trim(), outContent.toString().trim());

//            Normalize Line Endings Before Comparison
            assertEquals(expectedOutput.replace("\r\n", "\n"), outContent.toString().replace("\r\n", "\n"));


        } catch (IOException e) {
            fail("IOException occurred during test.");
        }
    }
}
