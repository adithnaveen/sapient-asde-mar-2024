package com.sapient.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

    public static Connection getMysqlConnection() {
        // as of now we have it hardcoded, convert to properties
        String userName ="root";
        String password = "kanchan@1";
        String url ="jdbc:mysql://localhost/sapientdb";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, userName, password);

            return connection;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
