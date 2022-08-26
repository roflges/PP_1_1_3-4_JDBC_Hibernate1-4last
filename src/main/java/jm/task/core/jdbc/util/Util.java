package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String userName = "root";
        String password = "admin";
        String connectionURL = "jdbc:mysql://localhost:3306/mybdtest";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(connectionURL, userName, password);
        return connection;
    }
}