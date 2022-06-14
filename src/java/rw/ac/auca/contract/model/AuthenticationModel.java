package rw.ac.auca.contract.model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
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
    
    public String studentlogin(){
        if(checking.getRegistrationNumberC().equals(userCredentials.getRegistrationNumber())){
            return "student-account";
        }else{
            FacesMessage message = new FacesMessage("Incorrect username or password");
            FacesContext.getCurrentInstance().addMessage(null, message);
            return "index";
        }
    }
    
}
