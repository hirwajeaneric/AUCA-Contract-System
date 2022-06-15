package rw.ac.auca.contract.entities;

import java.time.LocalDate;

/**
 *
 * @author hirwa
 */
public class AucaStudents {
    private String registrationNumber;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String nationalId;
    private LocalDate entryDate; 
    private String residence;

    public AucaStudents() {
    }

    public AucaStudents(String registrationNumber, String firstName, String lastName, String emailAddress, String phoneNumber, String nationalId, LocalDate entryDate, String residence) {
        this.registrationNumber = registrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.nationalId = nationalId;
        this.entryDate = entryDate;
        this.residence = residence;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
    
    
}
