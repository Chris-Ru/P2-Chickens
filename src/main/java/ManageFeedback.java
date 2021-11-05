import java.util.List;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageFeedback {
    private static SessionFactory factory;
    public static void main(String[] args) {

        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        ManageFeedback newEntry = new ManageFeedback();
        Integer feedback1 = newEntry.addFeedback("test title", 0, "test body", "test name");
    }


    public Integer addFeedback(String Title, int Positive, String Body, String Name) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer feedbackID = null;

        try {
            tx = session.beginTransaction();
            feedback Feedback = new feedback(Title, Positive, Body, Name);
            feedbackID = (Integer) session.save(Feedback);
            tx.commit();

        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return feedbackID;
    }
}