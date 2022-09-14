package fpt_udemy.academy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJDBC {
    private static final String hostName = "localhost";
    private static final String dbName = "jdbcdemo";
    private static final String userName = "postgres";
    private static final String password = "postgres";
    // jdbc:postgresql://hostname:port/dbname
    private static final String connectionURL = "jdbc:postgresql://" + hostName + ":5432/" + dbName;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. Load Driver
        DriverManager.registerDriver(new org.postgresql.Driver());

        // 2. Open connection
        Connection connection = DriverManager.getConnection(connectionURL, userName, password);

        // 3. Create Statement
        Statement statement = connection.createStatement();

        // 4. Execute query
        String sqlInsert = "INSERT INTO users(username, password, createdDate) VALUES('Phuong', '12345678911', now());";
        int numberRowsAffected = statement.executeUpdate(sqlInsert);
        if (numberRowsAffected == 0) {
            System.out.println("insertion failed");
        } else {
            System.out.println("inserted successfully : " + numberRowsAffected);
        }

        //Close statement
        statement.close();

        // 5. Close connection
        connection.close();
    }
}
