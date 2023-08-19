import java.io.IOException;

public class UserInputExample {

    public static void main(String[] args) throws IOException {

        // Reading the input here by System.in.read()

        /*
        Advance methods
         1. Scanner
         2. BufferReader

         */
        System.out.println("Enter your Input: ");
        int i = System.in.read();
        //System.out.println(i); // out is in ASCII code // printf=> java programming, cout=>c++ programming , console.WriteLine() => c# programming
        // System.in.read(); // scanf => c programming , cin => c++ programming, console.ReadLine() = c# programming takes only @Range(from = -1, to = 255)
        System.out.println((char)i); // print the only single output

        String str = "";
        while ((i=System.in.read())!= 48 || (i=System.in.read()) != 10){
            System.out.print((char) i);
        }
    }
}
