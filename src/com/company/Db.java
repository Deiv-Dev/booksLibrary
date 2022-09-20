package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

    Connection c;
    String URL = "jdbc:mysql://localhost/books";
    String user = "root";
    String password = "";

    public Db() {}

    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = (Connection) DriverManager.getConnection(URL, user, password);
            System.out.println("Connection success");

        } catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Connection failed");
        }
    }


}
