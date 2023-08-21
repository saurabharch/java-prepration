import java.sql.*;
public class JDBCConnectionExample {

    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/database";
        String uname = "root";
        String pass ="password";
        String query = "select username from student where user_id=2";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        ResultSet rt = st.executeQuery(query);
        rt.next();
        String result = rt.getString("username");
        System.out.println(result);
        rt.close();
        con.close();

    }
}
