import java.util.Scanner;

public class ArmstrongNumber {


    // Armstrong Number -> 153
    // 1*1*1 + 5*5*5 + 3*3*3
    // 1 + 125 + 27 = 153
    // 370 -> 27 + 7*7*7 + 0*0*0 = 27 + 343 + 0 = 370
    public static void main(String[] args) {

        System.out.println("Enter any Number Weather check it is Armstrong Number (eg. 153 and 370) or not: ");
        int n = new Scanner(System.in).nextInt();
        //int n = 153;
        int temp = n;
        int r,sum=0;

       while (n>0){
           r = n%10;
           //System.out.println("Modulas of n%10 is: "+ r);
           n = n/10;
           //System.out.println("Divident of n/10 is: "+ r);
           sum = sum + r*r*r;
       }
       if (temp==sum)
           System.out.println("It's an Armstrong Number: "+temp);
       else
           System.out.println("It's not an Armstrong Number: "+temp);
    }
}
