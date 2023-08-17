import java.io.*;

public class TextFileManipulation {

    public static void main(String[] args) {
        // Generate and write content to a text file
        String filePath = "textfile.txt";
        writeToFile(filePath, "Hello, this is some content!\n");

        // Read and print content from the text file
        String fileContent = readFromFile(filePath);
        System.out.println("Content of the file:");
        System.out.println(fileContent);

        // Append additional content to the text file
        appendToFile(filePath, "This is additional content.\n");

        // Read and print the updated content from the text file
        fileContent = readFromFile(filePath);
        System.out.println("Updated content of the file:");
        System.out.println(fileContent);
    }

    // Method to write content to a file
    private static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    // Method to read content from a file
    private static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return content.toString();
    }

    // Method to append content to a file
    private static void appendToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Error appending to the file: " + e.getMessage());
        }
    }
}
