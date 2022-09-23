package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Db {
    Connection c;
    String URL = "jdbc:mysql://localhost/books";
    String user = "root";
    String password = "";

    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = (Connection) DriverManager.getConnection(URL, user, password);
            String sql = "INSERT INTO admin (admin_id, username, password) VALUES (?, ?, ?)";
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1,  "1" );
            statement.setString(2, "Bill");
            statement.setString(3, "new");

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
