package rw.ac.auca.contract.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author hirwa
 */
@Entity
public class StudentCredentials implements Serializable {
    @Id
    private String registrationNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String createPassword;
    private String ConfirmPassword;

    public StudentCredentials() {
    }

    public StudentCredentials(String registrationNumber, String firstName, String lastName, String email, String createPassword, String ConfirmPassword) {
        this.registrationNumber = registrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.createPassword = createPassword;
        this.ConfirmPassword = ConfirmPassword;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatePassword() {
        return createPassword;
    }

    public void setCreatePassword(String createPassword) {
        this.createPassword = createPassword;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }
    
    
}
