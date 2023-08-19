import java.util.Scanner;

public class StringOperationsExample {

/*
1. String concat
2. String length
3. convert string in to uppercase


 */
    public static void main(String[] args) {
        String s1 ,s2;
        System.out.println("Enter Two String Lines: ");
        s1 = new Scanner(System.in).nextLine().toString() + " ";
        s2 = new Scanner(System.in).nextLine().toString();
        // 1st Answer
        System.out.println("Length of string s1: "+s1.length());
        System.out.println("Length of string s2: "+s2.length());

        // 2nd Answer
        String s3 = s1.toString()+s2.toString(); // s1.concat(s2).toString();
        System.out.println("Result: "+s3);

        // 3rd Answer
        System.out.println("Result in Upper Case: "+s3.toUpperCase());
    }
}
