import java.util.Scanner;

public class FindTheLargestNumber {

    public static void main(String[] args){
        System.out.println("Enter How much your Array is: ");
        int Numb = new Scanner(System.in).nextInt();
        System.out.printf("Enter %d Uniques Number: ",Numb);
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[Numb];
        int largest = numbers[0];// 0

        for (int i = 0; i < Numb; i++) {
            numbers[i] = scanner.nextInt();
        }

            for(int i:numbers){
                if(i>largest)
                    largest = i;
            }

//        for (int i = 1; i < Numb; i++) {
//            if (numbers[i] > largest) {
//                largest = numbers[i];
//            }
//        }

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }

}
