package fpt_udemy.academy.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_ {
    public static final String username = "postgres";
    public static final String password = "postgres";
    public static final String database = "jdbcdemo";
    public static final String hostname = "localhost";

    public static final String connectionURL = "jdbc:postgresql://" + hostname + ":5432/" + database;

    public static Connection openConnection() throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());

        return DriverManager.getConnection(connectionURL, username, password);
    }
}
