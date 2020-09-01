package internetShop.db;

import internetShop.entity.product.Product;

import java.sql.*;

public class DBConnectionHandler {
    private static final String URL = "jdbc:mysql://localhost:3306/store?serverTimezone=Europe/Moscow&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "123";

    public static void connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
                System.out.println("Connection to Store DB successfully!");
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}
