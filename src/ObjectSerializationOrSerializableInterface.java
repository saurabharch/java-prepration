import java.io.*;

public class ObjectSerializationOrSerializableInterface {

    public static void main(String[] args) throws Exception{
        Save s = new Save();
        s.i = 4;
        File f = new File("Obj.text");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream obs = new ObjectOutputStream(fos);
        obs.writeObject(s);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream dis = new ObjectInputStream(fis);

        Save s1 = (Save) dis.readObject();
        System.out.println(s1.i);
    }
}

class  Save implements Serializable {
    int i;
}