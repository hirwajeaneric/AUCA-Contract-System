package rw.ac.auca.contract.model;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import rw.ac.auca.contract.controller.GenericDao;
import rw.ac.auca.contract.entities.AucaStudents;
import rw.ac.auca.contract.entities.LoginCheckUp;
import rw.ac.auca.contract.entities.StudentCredentials;

/**
 *
 * @author hirwa
 */
@SessionScoped
@ManagedBean(name = "authent")
public class AuthenticationModel {
    private StudentCredentials userCredentials= new StudentCredentials();
    private LoginCheckUp checking = new LoginCheckUp();
    private AucaStudents aucaStudent = new AucaStudents();
    private GenericDao genericDao = new GenericDao();

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
        List<StudentCredentials> listOfRegisteredUsers = genericDao.fetchAccounts();

        if(checking.getRegistrationNumberC().equals(userCredentials.getRegistrationNumber())){
            return "student-account";
        }else{
            FacesMessage message = new FacesMessage("Incorrect username or password");
            FacesContext.getCurrentInstance().addMessage(null, message);
            return "index";
        }
    }
    
    public String createAccount(){
        if(userCredentials.getRegistrationNumber()!=null && userCredentials.getEmail() !=null && userCredentials.getConfirmPassword()!=null && userCredentials.getCreatePassword()!=null){
            genericDao.createAccount(userCredentials);
            FacesMessage message = new FacesMessage("Your account is successfully created!");
            FacesContext.getCurrentInstance().addMessage(null, message);
            return "signup";
        }else{
            FacesMessage message = new FacesMessage("All fields must be filled");
            FacesContext.getCurrentInstance().addMessage(null, message);
            return "index";
        }
    }
}
