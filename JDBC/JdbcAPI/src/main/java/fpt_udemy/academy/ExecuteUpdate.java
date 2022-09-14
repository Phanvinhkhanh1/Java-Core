package fpt_udemy.academy;

import fpt_udemy.academy.Utils.Connection_;
import org.postgresql.core.Utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdate {
    public static void main(String[] args) throws SQLException {
        Connection connection = Connection_.openConnection();
        Statement statement = connection.createStatement();

//        Insert
        String sqlInsert = "INSERT INTO user_(username, password, createdDate) VALUES ('Phuong','1234567',now()),('Tung','123456',now())";
        int numAffectedRowsAfterInsert = statement.executeUpdate(sqlInsert);
        System.out.println("Number of affected rows after insert : " + numAffectedRowsAfterInsert);

        //Update
//        String sqlUpdate = "UPDATE user_ SET password = 'Khanh161297@' WHERE username = 'Khanh'";
//        int numAffectedRowsAfterUpdate = statement.executeUpdate(sqlUpdate);
//        System.out.println("Number of affected rows after update : " + numAffectedRowsAfterUpdate);

        //Delete
//        String sqlDelete = "DELETE FROM user_ WHERE username = 'Khanh'";
//        int numAffectedRowsAfterDelete = statement.executeUpdate(sqlDelete);
//        System.out.println("Number of affected rows after delete : " + numAffectedRowsAfterDelete);
    }
}
