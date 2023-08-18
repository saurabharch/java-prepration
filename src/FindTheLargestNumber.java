import java.util.Scanner;

public class FindTheLargestNumber {

    public static void main(String[] args){
        System.out.println("Enter How much your Array is: ");
        int Numb = new Scanner(System.in).nextInt();
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[Numb];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < Numb; i++) {
            numbers[i] = scanner.nextInt();
        }

        int largest = numbers[0];// 0
        for (int i = 1; i < Numb; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }

}
