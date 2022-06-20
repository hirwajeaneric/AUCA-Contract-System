package rw.ac.auca.contract.controller;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import rw.ac.auca.contract.entities.Contract;
import rw.ac.auca.contract.entities.ContractSetup;
import rw.ac.auca.contract.entities.Registration;
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

    public void createNewSetup(ContractSetup setup){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(setup);
        transaction.commit();
        session.close();
    }
    
    public void createSetup(ContractSetup setup){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(setup);
        transaction.commit();
        session.close();
    }

    public void updateSetup(ContractSetup setup){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.update(setup);
        transaction.commit();
        session.close();
    }
    
    public void createContract(Contract contract){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(contract);
        transaction.commit();
        session.close();
    }

    public void updateContract(Contract contract){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.update(contract);
        transaction.commit();
        session.close();
    }
    
    public void deleteContract(Contract contract){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.delete(contract);
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

    public Registration findRegistrationDetailsOfStudent(String regNumber){
        session = HibernateUtil.getSessionFactory().openSession();
        Registration foundDetials = (Registration)session.get(Registration.class, regNumber);
        session.close();
        return foundDetials;
    }

    public ContractSetup findContractSetup(String setupId){
        session = HibernateUtil.getSessionFactory().openSession();
        ContractSetup foundSetup = (ContractSetup)session.get(ContractSetup.class, setupId);
        session.close();
        return foundSetup;
    }
    
    public List<Contract> listContractPerStudent(String regNumber){
        session = HibernateUtil.getSessionFactory().openSession();
        Criteria cr = session.createCriteria(Contract.class);
        cr.add(Restrictions.eq("regNumber", regNumber));
        List listOfYourContracts = cr.list();
        session.close();
        return listOfYourContracts;
    }

    public List<Contract> fetchContracts(){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Contract> listOfContracts = session.createCriteria(Contract.class).list();
        transaction.commit();
        session.close();
        return listOfContracts;
    }
    public List<Registration> fetchRegistrations(){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Registration> RegistrationList = session.createCriteria(Registration.class).list();
        transaction.commit();
        session.close();
        return RegistrationList;
    }

    public List<ContractSetup> fetchSetups(){
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<ContractSetup> listOfSetups = session.createCriteria(ContractSetup.class).list();
        transaction.commit();
        session.close();
        return listOfSetups;
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
