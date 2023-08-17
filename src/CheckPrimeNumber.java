import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter Any Number Weather always greater than 0 or less than 100 : ");
        int n = new Scanner(System.in).nextInt();
        boolean isPrime = true;
        for(int i=2; i<Math.sqrt(n);i++) {
            if (n % i == 0)
            {
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println(n+ " Is an Prime Number");
        }
        else{
            System.out.println(n + " Is not an Prime Number");
        }
    }
}
