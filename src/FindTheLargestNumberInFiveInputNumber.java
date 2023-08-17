import java.util.Scanner;

public class FindTheLargestNumberInFiveInputNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[5];

        // Taking input from the user for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Finding the largest number among the input numbers
        double largest = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Printing the largest number
        System.out.println("The largest number is: " + largest);

        // Closing the scanner
        scanner.close();
    }
}