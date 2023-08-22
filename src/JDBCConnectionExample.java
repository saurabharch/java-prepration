import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCConnectionExample {

    public static void main(String[] args) throws Exception{

//        Properties p = new Properties();
//        InputStream Ips = new FileInputStream("dataConfig.properties");
//        String ul1 = p.getProperty("url");
//        System.out.println("Result: "+ul1);
        String url = "jdbc:mysql://localhost:3306/mysqldb";
        String uname = "user";
        String pass ="password";
        String query = "select * from Student ";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        ResultSet rt = st.executeQuery(query);
        rt.next();
        String result = rt.getString("name");
        System.out.println(result);
        rt.close();
        con.close();

    }
}
