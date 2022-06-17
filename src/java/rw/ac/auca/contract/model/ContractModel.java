package rw.ac.auca.contract.model;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import rw.ac.auca.contract.controller.GenericDao;
import rw.ac.auca.contract.entities.Contract;
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

    public void setUserNames(String userNames) {
        this.userNames = userNames;
    }

    public String getUserNames() {
        return userNames;
    }
    
    String regNumber = credentials.getRegistrationNumber();
    
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
        userNames = credentials.getFirstName()+" "+credentials.getLastName();
        String studentRegNumber = credentials.getRegistrationNumber();
        contract.setRegNumber(studentRegNumber);
        return "create-contract";
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
        userNames = credentials.getFirstName()+" "+credentials.getLastName();
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