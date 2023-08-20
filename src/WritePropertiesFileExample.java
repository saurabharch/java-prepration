import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class WritePropertiesFileExample {

    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        OutputStream Ops = new FileOutputStream("dataConfig.properties");

        p.setProperty("url","localhost:3306/mdDB");
        p.setProperty("username","root");
        p.setProperty("password","Password");

        p.store(Ops,null);

    }
}
