import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInputExample {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter your Number: ");
//        InputStreamReader in = new InputStreamReader(System.in); // Must need to create this object before creating the buffer object
//        BufferedReader br = new BufferedReader(in); // Here input is read in string format that's we need to convert the string in Integer by Integer.parse(br.readLine());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // more Precise code
        int a = Integer.parseInt(br.readLine());
        System.out.println("Result: "+a);
    }
}
