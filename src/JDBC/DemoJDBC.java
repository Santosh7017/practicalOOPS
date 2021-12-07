package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoJDBC {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/santosh", "root", "");
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Student");
            while (rs.next())
                System.out.println(rs.getInt("UnivRollNo") + "  " + rs.getString("Name") );
            con.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
                    }
    }
}
