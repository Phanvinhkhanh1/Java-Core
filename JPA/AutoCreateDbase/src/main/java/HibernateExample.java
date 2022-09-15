import Utils.HibernateUtil;
import org.hibernate.Session;

import java.util.UUID;

public class HibernateExample {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        // Begin a unit of work
        session.beginTransaction();

        // Insert user
        Category cat = new Category();
        cat.setName("cat " + System.currentTimeMillis());
        System.out.println("Cat id = " + (Long) session.save(cat));

        // Commit the current resource transaction, writing any unflushed changes to the database.
        session.getTransaction().commit();
    }
}
