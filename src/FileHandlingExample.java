import java.io.*;

public class FileHandlingExample {

    public static void main(String[] args) throws Exception {

        File f = new File("demo.text");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Saurabh Kashyap");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String rs = dis.readUTF(dis);
        System.out.println("Result: "+rs);
    }
}
