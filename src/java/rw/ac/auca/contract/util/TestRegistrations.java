package rw.ac.auca.contract.util;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rw.ac.auca.contract.entities.Registration;

/**
 *
 * @author hirwa
 */
public class TestRegistrations {
     
    public static void main(String[] args) {
        
        Registration registration1 = new Registration();    
        registration1.setRegNumber("22026");
        registration1.setFirstName("Hirwa");
        registration1.setLastName("Jean Eric");
        registration1.setFaculty("Software Engineering");
        registration1.setSemester(2);
        registration1.setAmountDue(350000.0);
        
        Registration registration2 = new Registration();    
        registration2.setRegNumber("22025");
        registration2.setFirstName("Ririmba");
        registration2.setLastName("Bientot");
        registration2.setFaculty("Networking");
        registration2.setSemester(2);
        registration2.setAmountDue(340000.0);
        
        Registration registration3 = new Registration();    
        registration3.setRegNumber("22022");
        registration3.setFirstName("Umubyeyi");
        registration3.setLastName("Anne Marie");
        registration3.setFaculty("Software Engineering");
        registration3.setSemester(2);
        registration3.setAmountDue(500000.0);
        
        Registration registration4 = new Registration();    
        registration4.setRegNumber("22020");
        registration4.setFirstName("Umutoni");
        registration4.setLastName("Joselyne");
        registration4.setFaculty("Information Management");
        registration4.setSemester(2);
        registration4.setAmountDue(240000.0);
        
        Registration registration5 = new Registration();    
        registration5.setRegNumber("21876");
        registration5.setFirstName("Mugisha");
        registration5.setLastName("Fabrice");
        registration5.setFaculty("Information Management");
        registration5.setSemester(2);
        registration5.setAmountDue(350000.0);
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(registration1);
        transaction.commit();
        session.close();
        
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(registration2);
        transaction.commit();
        session.close();
        
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(registration3);
        transaction.commit();
        session.close();
        
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(registration4);
        transaction.commit();
        session.close();
        
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(registration5);
        transaction.commit();
        session.close();
    }
}
