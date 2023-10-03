import java.sql.*;

public class update {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/avishkar";
        String user = "root";
        String password = "*******";

        Connection conn = DriverManager.getConnection(url,user,password);

        Statement smt = conn.createStatement();

        String query = "Update Student Set grade = ? where Roll_No = ?";

        PreparedStatement psmt = conn.prepareStatement(query);

        psmt.setString(1, "X");
        psmt.setInt(2,5);

        psmt.executeUpdate();

        System.out.println("data updated successfully");

        conn.close();

    }
}
