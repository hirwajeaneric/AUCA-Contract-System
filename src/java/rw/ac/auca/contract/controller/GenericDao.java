package rw.ac.auca.contract.controller;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import rw.ac.auca.contract.entities.StudentCredentials;
import rw.ac.auca.contract.util.HibernateUtil;

/**
 *
 * @author hirwa
 */
public class GenericDao {
    Session session = null;
    Transaction transaction = null;
    
    public void createAccount(StudentCredentials credentials){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(credentials);
        transaction.commit();
        session.close();
    }
    
//    public String findPassCode(String regNumber){
//        session = HibernateUtil.getSessionFactory().openSession();
//        transaction = session.beginTransaction();
//        
//        Criteria cr = session.createCriteria(StudentCredentials.class);
//        cr.add(Restrictions.eq("createPassword", regNumber));
//        String foundPassword = cr.toString();
//        
//        transaction.commit();
//        session.close();
//        
//        return foundPassword;
//    }
    
    public StudentCredentials findPassword(String regNumber){
        session = HibernateUtil.getSessionFactory().openSession();
        StudentCredentials foundCredentials = (StudentCredentials)session.get(StudentCredentials.class, regNumber);
        session.close();
        return foundCredentials;
    }

    public List<StudentCredentials> fetchAccounts(){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<StudentCredentials> listOfCustomers = session.createCriteria(StudentCredentials.class).list();
        transaction.commit();
        session.close();
        return listOfCustomers;
    }

//    public List<Account> fetchAccountData(){
//        session = HibernateUtil.getSessionFactory().openSession();
//        transaction = session.beginTransaction();
//        List<Account> listOfAccounts = session.createCriteria(Account.class).list();
//        transaction.commit();
//        session.close();
//        return listOfAccounts;
//    }
}
