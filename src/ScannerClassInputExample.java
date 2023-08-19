import java.util.Scanner;

public class ScannerClassInputExample {

    public static void main(String[] args) {
        String str="";
        int i =0;
        System.out.println("Enter your Input:");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            System.out.println("Result Int: "+sc.nextInt());
        }
        else{
            System.out.println("Result String: "+sc.next());
        }

    }
}
