import java.util.Scanner;

public class FindTheLargestNumber {

    public static void main(String[] args){
        int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
        int largest = 0;
        int secondLargest = 0;
        System.out.println("The given array is:");
//        for (int i = 0; i < arr.length; i++)
//        {
//            System.out.print(arr[i] + "\t");
//        }
        for (int i = 0; i < arr.length; i++)
        {
            //  100 > 0 || 14>1 || 46 > 2 || 47>3 || 94 > 4 || 94 > 5 || 52 > 6 || 86 > 7 || 36 > 8 || 94 > 9 || 89 > 10
            if (arr[i] > largest)
            {
                secondLargest = largest; // secondLargest = 0 , 10
                largest = arr[i]; // largest = 100 , 89
            }
            else if (arr[i] > secondLargest) // 100 > 0 ,
            {
                secondLargest = arr[i]; // secondLargest = 14
            }
        }
        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);

    }
}
