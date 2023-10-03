import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createTable {
    public static void main(String[] args) throws SQLException {


        String url = "jdbc:mysql://localhost:3306/avishkar";
        String user = "root";
        String password = "******";

        Connection conn = DriverManager.getConnection(url,user,password);

        System.out.println("Connection created Successfully");

        Statement smt = conn.createStatement();

        String query = "Create Table Student(Roll_No int(4) not null, Name varchar(100) not null, marks float not null, city varchar(50), grade varchar(2))";

        smt.executeUpdate(query);

        System.out.println("Table created successfully");

        conn.close();
    }
}
