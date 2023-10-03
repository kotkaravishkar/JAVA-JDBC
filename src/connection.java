import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/avishkar";
        String user = "root";
        String password = "*******";

        Connection conn = DriverManager.getConnection(url,user,password);

        System.out.println("Connection created Successfully");


    }
}
