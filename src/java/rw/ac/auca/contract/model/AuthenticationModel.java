package rw.ac.auca.contract.model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import rw.ac.auca.contract.controller.GenericDao;
import rw.ac.auca.contract.entities.AucaStudents;
import rw.ac.auca.contract.entities.LoginCheckUp;
import rw.ac.auca.contract.entities.Registration;
import rw.ac.auca.contract.entities.StudentCredentials;

/**
 *
 * @author hirwa
 */
@SessionScoped
@ManagedBean(name = "authent")
public class AuthenticationModel {
    private StudentCredentials userCredentials= new StudentCredentials();
    private Registration registrationData = new Registration();
    private LoginCheckUp checking = new LoginCheckUp();
    private AucaStudents aucaStudent = new AucaStudents();
    private GenericDao genericDao = new GenericDao();
    private String userNames;

    public void setUserNames(String userNames) {
        this.userNames = userNames;
    }

    public String getUserNames() {
        return userNames;
    }

    public void setRegistrationData(Registration registrationData) {
        this.registrationData = registrationData;
    }

    public Registration getRegistrationData() {
        return registrationData;
    }
    
    public AucaStudents getAucaStudent() {
        return aucaStudent;
    }

    public void setAucaStudent(AucaStudents aucaStudent) {
        this.aucaStudent = aucaStudent;
    }

    public LoginCheckUp getChecking() {
        return checking;
    }

    public void setChecking(LoginCheckUp checking) {
        this.checking = checking;
    }
    
    public StudentCredentials getUserCredentials() {
        return userCredentials;
    }

    public void setUserCredentials(StudentCredentials userCredentials) {
        this.userCredentials = userCredentials;
    }
    
    public String goToIndex(){
        return "index";
    }

    public String goToSignUp(){
        return "signup";
    }
    
    public String studentlogin(){
        String enteredId = checking.getRegistrationNumberC();
        String enteredPassword = checking.getPasswordC();
        
        userCredentials = genericDao.findPassword(enteredId);
        registrationData = genericDao.findRegistrationDetailsOfStudent(enteredId);
        System.out.println("Due amount is: "+registrationData.getAmountDue());
        String userPassword = userCredentials.getCreatePassword();
        
        if(enteredPassword.equals(userPassword)){
            userNames = userCredentials.getFirstName()+" "+userCredentials.getLastName();
            return "student-account";
        }else {
            FacesMessage message = new FacesMessage("Incorrect username or password");
            FacesContext.getCurrentInstance().addMessage("error-message", message);
            return "index";            
        }
    }
    
    public String createAccount(){
        if(userCredentials.getRegistrationNumber()!=null && userCredentials.getEmail() !=null && userCredentials.getConfirmPassword()!=null && userCredentials.getCreatePassword()!=null){
            genericDao.createAccount(userCredentials);
            FacesMessage successMessage = new FacesMessage("Your account is successfully created!");
            FacesContext.getCurrentInstance().addMessage("successful-creation" , successMessage);
            return "signup";
        }else{
            FacesMessage message = new FacesMessage("All fields must be filled");
            FacesContext.getCurrentInstance().addMessage("error-message2", message);
            return "signup";
        }
    }
}
