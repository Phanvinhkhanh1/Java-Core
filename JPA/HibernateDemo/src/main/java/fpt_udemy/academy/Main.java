package fpt_udemy.academy;

import fpt_udemy.academy.Entity.User;
import fpt_udemy.academy.Utils.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        //Insert user
        Date currentDate = new Date();
        User user1 = new User();
        user1.setFullName("Hibernate Example");
        user1.setUserName("Phan Vinh Khanh");
        user1.setPassword("123456789"); // Should encode password
        user1.setCreatedAt(currentDate);
        user1.setModifiedAt(currentDate);
        Long userId = (Long) session.save(user1);
        System.out.println("User id = " + userId);

        //Count user from database
        Long numberOfUser = session.createQuery("SELECT COUNT(*) FROM User", Long.class).uniqueResult();
        System.out.println("Number of User in user Table is : " + numberOfUser);

        //Get user by id
        User savedUser = session.find(User.class, userId);
        System.out.println("Saved User : " + savedUser);

        // Update user
        savedUser.setFullName("Google Coder");
        session.update(savedUser);

        // Get users
        List<User> users = session.createQuery("FROM User", User.class).list();
        users.forEach(System.out::println);

        // Delete user
//        session.delete(savedUser);

        // Count user from database
        numberOfUser = session.createQuery("SELECT COUNT(id) FROM User", Long.class).uniqueResult();
        System.out.println("Number of user in database: " + numberOfUser);

        // Commit the current resource transaction, writing any unflushed changes to the database.
        session.getTransaction().commit();
    }
}
