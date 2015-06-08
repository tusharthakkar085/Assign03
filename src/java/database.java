
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c0653602
 */
public class database {

    private static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.err.println("JDBC Driver Not Found: " + ex.getMessage());
        }
        try {
            String jdbc = "jdbc:mysql://ipro.lambton.on.ca/inventory";
            conn = DriverManager.getConnection(jdbc, "products", "products");
        } catch (SQLException ex) {
            System.err.println("Failed to Connect: " + ex.getMessage());
        }
        return conn;
    }

    public static void getQuantityForId() {
        try {
            Connection conn = getConnection();
            String query = "SELECT * FROM products";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println(query);
            while (rs.next()) {
                System.out.printf("%s", rs.getString("quantity"));
            }
        } catch (SQLException ex) {
            System.err.println("Failed to Get Quantity for ID ");
        }
    }
}
