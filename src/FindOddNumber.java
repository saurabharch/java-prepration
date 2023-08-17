import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindOddNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> oddNumbers = new ArrayList<>();

        System.out.print("Enter the number of values: ");
        int numValues = scanner.nextInt();

        // Taking input from the user for the specified number of values
        for (int i = 0; i < numValues; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }

        // Printing the odd numbers
        if (oddNumbers.isEmpty()) {
            System.out.println("No odd numbers found.");
        } else {
            System.out.println("Odd numbers:");
            for (int oddNumber : oddNumbers) {
                System.out.println(oddNumber);
            }
        }

        // Closing the scanner
        scanner.close();
    }

}
