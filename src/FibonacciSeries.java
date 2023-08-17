import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int k,a=1,b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number for finding fibonacciSeries: ");
        int n = sc.nextInt();
        k =0;
        System.out.print("1 1 ");
        while (k<=n){
            k =a+b;
            if(k>=n)
                break;
            System.out.print(k+" ");
            a=b;
            b=k;

        }
    }
}
