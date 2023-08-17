import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExtractAndSortNumbersInFile {
    public static void main(String[] args) {
        String inputFilePath = "textfile.txt";   // Replace with the path of your input file
        String outputFilePath = "output.txt"; // Replace with the desired output file path

        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                extractNumbers(line, numbers);
            }

            // Collections.sort(numbers); // acending order
            Collections.sort(numbers, Collections.reverseOrder());  // decending order

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
                for (int number : numbers) {
                    writer.write(Integer.toString(number));
                    writer.newLine();
                }
                System.out.println("Sorted numbers written to " + outputFilePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void extractNumbers(String text, List<Integer> numbers) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            numbers.add(number);
        }
    }
}
