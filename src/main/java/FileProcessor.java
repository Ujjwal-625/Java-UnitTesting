import java.io.*;

public class FileProcessor {

    public static void writeToFile(String path, String content) throws IOException {
        try (FileWriter writer = new FileWriter(new File(path))) {
            writer.write(content);
        }
    }

    public static void readFromFile(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
