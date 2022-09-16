import Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class HQLExample {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession();) {
            session.beginTransaction();
            //Insert data into database
            String sqlInsertToUser = "INSERT INTO User(fullName,userName,password,createdAt,modifiedAt) VALUES ('Phan Vinh Khanh','KhanhPhan','12345',sysdate(),sysdate()" ;
//                    "       ('Phan Vinh Tung','TungVinhPhan','123456',now(),now()," +
//                    "       ('Phan Thi Phuong','PhuongPhan','1234567',now(),now()";

            Query query = session.createQuery(sqlInsertToUser);
            int affectedRows = query.executeUpdate();
            System.out.println("You have just inserted " + affectedRows +" users");
            session.getTransaction().commit();
        }
    }
}
