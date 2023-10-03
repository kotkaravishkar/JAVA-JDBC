import java.sql.*;

public class selection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/avishkar";
        String user = "root";
        String password = "********`";

        Connection conn = DriverManager.getConnection(url,user,password);

        String query = "select * from student";

        Statement smt = conn.createStatement();
        ResultSet set = smt.executeQuery(query);


        while(set.next()){


          int  Roll_No = set.getInt(1)  ;
          String Name =  set.getString(2);
          float marks = set.getFloat(3);
          String City = set.getString(4);
          String  grade =set.getString(5);

            System.out.println( "Roll_No: " + Roll_No  +" Name: " + Name +" marks: " + marks +" City : " +City   +" grade: " + grade  );

        }
        conn.close();
    }
}
