import java.util.Scanner;

public class FindPerfectNumber {

    // 6 -> 1 + 2 + 3 = 6
    // 28 -> 1 + 2 + 4 + 7 + 14 = 28
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any Number Check Whether it is perfect Number or not");
        int n = sc.nextInt();
       // int n = 28; // assume this number

        boolean b = isPerfectNumber(n);
        if(b)
            System.out.println("It's a perfect a number");
        else
            System.out.println("It's not a perfect number");
        sc.close();
    }

    public static boolean isPerfectNumber(int n){

        int sum =0;
        for (int i=1;i<n;i++){
            if(n%i==0)
                sum +=i;
        }
        if(n==sum)
            return true;

        return  false;
    }
}
