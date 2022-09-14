package fpt_udemy.academy;

import fpt_udemy.academy.Utils.Connection_;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery {
    public static void main(String[] args) throws SQLException {
        Connection connection = Connection_.openConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String sqlSelect = "SELECT * from user_";
        ResultSet resultSet = statement.executeQuery(sqlSelect);

        //Move forward
        System.out.println("Move forward : ");
        while (resultSet.next()) {
            showUserInfo(resultSet);
        }

        System.out.println("Move backward : ");
        //Move backward
        while (resultSet.previous()) {
            showUserInfo(resultSet);
        }

        System.out.println("Show info of last user : ");
        resultSet.last();
        showUserInfo(resultSet);

        System.out.println("Show info of first user : ");
        resultSet.first();
        showUserInfo(resultSet);
    }

    private static void showUserInfo(ResultSet resultSet) throws SQLException {
        System.out.println("Id : " + resultSet.getInt(1));
        System.out.println("UserName : " + resultSet.getString(2));
        System.out.println("Password : " + resultSet.getString(3));
        System.out.println("Created Date : " + resultSet.getDate(4));
        System.out.println("===================");
    }
}
