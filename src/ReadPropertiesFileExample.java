import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFileExample {

    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        InputStream Dis = new FileInputStream("dataConfig.properties");
        p.load(Dis);
//        System.out.println(p.getProperty("url"));
//        System.out.println(p.getProperty("username"));
//        System.out.println(p.getProperty("password"));
        p.list(System.out);
    }
}
