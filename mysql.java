import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectExample {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String user = "Root";
        String password = "Bhavani2004";

        try {
            // Load MySQL JDBC Driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to MySQL database");

            // You can now use the connection object to create statements, etc.
            connection.close();
            System.out.println("🔒 Connection closed");

        } catch (ClassNotFoundException e) {
            System.out.println("❌ MySQL JDBC Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Failed to connect to MySQL");
            e.printStackTrace();
        }
    }
}
