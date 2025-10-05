package Assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
public class MySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nazma";
        String user = "root";
        String password = "Nazma1234";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!");
            stmt = conn.createStatement();

            String query = "SELECT * FROM students";
            rs = stmt.executeQuery(query);

            System.out.println("ID\tName\tAge\tDepartment");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String dept = rs.getString("department");

                System.out.println(id + "\t" + name + "\t" + age + "\t" + dept);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection or query failed!");
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

