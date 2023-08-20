import java.io.*;

public class FileHandlingExample {

    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("demo.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Saurabh Kashyap");

        FileInputStream fis = new FileInputStream("demo.txt");
        DataInputStream dis = new DataInputStream(fis);
        String rs = dis.readUTF(dis);
        System.out.println("Result: "+rs);
    }
}
