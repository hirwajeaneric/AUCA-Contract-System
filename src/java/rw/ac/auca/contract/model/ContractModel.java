package rw.ac.auca.contract.model;

import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import rw.ac.auca.contract.controller.GenericDao;
import rw.ac.auca.contract.entities.Contract;
import rw.ac.auca.contract.entities.Registration;
import rw.ac.auca.contract.entities.StudentCredentials;

/**
 *
 * @author hirwa
 */
@SessionScoped
@ManagedBean(name = "cont")
public class ContractModel {

    private Contract contract = new Contract();
    private GenericDao genericDao = new GenericDao();
    private StudentCredentials credentials = new StudentCredentials();
    private String userNames;
    private Registration registrationData = new Registration();
    String regNumber = credentials.getRegistrationNumber();
    
    public void fetchRegistrationData(String studentRegNumber){
        registrationData = genericDao.findRegistrationDetailsOfStudent(studentRegNumber);
        System.out.println("The student with id "+studentRegNumber+" will pay "+registrationData.getAmountDue());
    }
    
    public void setUserNames(String userNames) {
        this.userNames = userNames;
    }

    public String getUserNames() {
        return userNames;
    }
    
    public StudentCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(StudentCredentials credentials) {
        this.credentials = credentials;
    }

    public Contract getContract() {
        return contract;
    }
    
    public void setContract(Contract contract) {
        this.contract = contract;
    }
    
    public String submitContract(){
        if (contract.getNameOnReciept()!= null) {
            genericDao.createContract(contract);
            return "contract-result";
        } else {
            FacesMessage errorMessage = new FacesMessage("Unable to create contract, please make sure that all fields are properly completed!");
            FacesContext.getCurrentInstance().addMessage("error-message2", errorMessage);
            return "create-contract";
        }
    }
    
    public List<Contract> listOfAllContracts(){
        return genericDao.fetchContracts();
    }
    
    public List<Contract> listOfAStudentContracts(){
        return genericDao.listContractPerStudent(regNumber);
    }
    
    public String goHome(){
        return "index";
    }
    
    public String createContract(){
        String studentRegNumber = credentials.getRegistrationNumber();
        System.out.println("The students' ID is "+studentRegNumber);
        fetchRegistrationData(studentRegNumber);
        if (registrationData.getAmountDue() > 0) {
            
            userNames = credentials.getFirstName()+" "+credentials.getLastName();
            
            contract.setRegNumber(registrationData.getRegNumber());    
            contract.setFirstName(registrationData.getFirstName());
            contract.setLastName(registrationData.getLastName());    
            contract.setDueAmount(registrationData.getAmountDue());    
            
            return "student-account";
        } else {
            FacesMessage message = new FacesMessage("Sorry, you can't create a contract if you are didn't register for courses in this semester.");
            FacesContext.getCurrentInstance().addMessage("contract-error", message);
            return "create-contract";
        }
    }
    
    public String confirmContract(){
        userNames = credentials.getFirstName()+" "+credentials.getLastName();
        return "contact";
    }
    
    public String viewYourContracts(){
        userNames = credentials.getFirstName()+" "+credentials.getLastName();
        return "student-account";
    }   

    public String contractStep2(){
        contract.setCreationdate(new Date());
        userNames = credentials.getFirstName()+" "+credentials.getLastName();
        return "contract-step2";
    } 
    
    public String calculateAmountPerInstallment(){
        contract.setAmountPerInstallment(contract.getDueAmount()/3);
        return "contract-step2";
    }
    
    public String previousToStep1(){
        userNames = credentials.getFirstName()+" "+credentials.getLastName();
        return "create-contract";
    }   

    public String nextToContractSummary(){
        userNames = credentials.getFirstName()+" "+credentials.getLastName();
        return "contract";
    }   
}