package fpt_udemy.academy;

import fpt_udemy.academy.Utils.Connection_;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {
    public static void main(String[] args) throws SQLException {
        Connection connection = Connection_.openConnection();
        Statement statement = connection.createStatement();

        //Disable individual transaction
        connection.setAutoCommit(false);

        try {
            String sqlInsert1 = "INSERT INTO user_(username,password,createdDate) VALUES ('BillGate','12345',now())";
            statement.executeUpdate(sqlInsert1);
            System.out.println("Inserted BillGate successfully.");

            String sqlInsert2 = "INSERT INTO user1_(username,password,createdDate) VALUES ('Phuc','12345',now())";
            statement.executeUpdate(sqlInsert2);
            System.out.println("Inserted Phuc Successfully.");

            connection.commit();
        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
            System.out.println("Roll-out back data.");
        }

    }
}
