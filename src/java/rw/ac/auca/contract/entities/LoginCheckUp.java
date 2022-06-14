package rw.ac.auca.contract.entities;

/**
 *
 * @author hirwa
 */
public class LoginCheckUp {
    private String registrationNumberC;
    private String passwordC;

    public LoginCheckUp() {
    }

    public LoginCheckUp(String registrationNumberC, String passwordC) {
        this.registrationNumberC = registrationNumberC;
        this.passwordC = passwordC;
    }

    public String getRegistrationNumberC() {
        return registrationNumberC;
    }

    public void setRegistrationNumberC(String registrationNumberC) {
        this.registrationNumberC = registrationNumberC;
    }

    public String getPasswordC() {
        return passwordC;
    }

    public void setPasswordC(String passwordC) {
        this.passwordC = passwordC;
    }
    
    
}
