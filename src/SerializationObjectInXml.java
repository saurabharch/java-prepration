import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationObjectInXml {

    public static void main(String[] args) {

        Student st = new Student();
        st.setRollno(1);
        st.setSname("saurabh");

        Student st1 = new Student();
        st1.setRollno(2);
        st1.setSname("shubham");

        List<Student> s = new ArrayList<>();
        s.add(st);
        s.add(st1);

        College c = new College();
        c.setStudents(s);
        XMLEncoder x = null;
        try {
            x  = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
            x.writeObject(c);
            System.out.println("myCollege.xml is created");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {

            x.close();
        }

    }
}
