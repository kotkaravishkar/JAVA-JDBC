import java.sql.*;

public class InsertValues {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/avishkar";
        String user = "root";
        String password = "*******";

        Connection conn = DriverManager.getConnection(url,user,password);

        Statement smt = conn.createStatement();

        String query = "Insert into Student (Roll_No, Name, marks, city, grade) value (?,?,?,?,?)";

        PreparedStatement pstm = conn.prepareStatement(query);

        pstm.setInt(1,3);
        pstm.setString(2,"XYZ");
        pstm.setFloat(3, 78.4F);
        pstm.setString(4,"Mumbai");
        pstm.setString(5,"C");


        pstm.executeUpdate();

        System.out.println("data inserted successfully");

        conn.close();

    }
}