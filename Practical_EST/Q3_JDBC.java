import java.sql.*;

public class demo1{
    public static String url = "jdbc:mysql://localhost:3306/demo1";
    public static String name = "demo1";
    public static String password = "demo1";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, name, password);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String username = rs.getString("username");
                String email = rs.getString("email");
                System.out.println("Username: " + username + ", Email: " + email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } }
