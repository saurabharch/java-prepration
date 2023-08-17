import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number Check Whether it is palindrome or not");
        int n = sc.nextInt();
        int r = 0, s = 0;
        int t = 0;
        while (n > 0) {
            r = r % 10;
            n = n / 10;
            s = s * 10 + r;
        }
        if (t == s) {
            System.out.println("palindrome");
        } else {
            System.out.println("not");
        }

    }
}
