package rw.ac.auca.contract.entities;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author hirwa
 */
@Entity
public class Contract implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contractNumber;
    private String regNumber;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String dueAmount;
    private String paidAmount;
    private String nameOnReciept;
    private String installments;
//    private byte[] paymentReciet;
    private String amountPerInstallment;
    private LocalDate creationdate;
    private String sponsor;
    private String status;

    public Contract() {
    }

    public Contract(int contractNumber, String regNumber, String firstName, String lastName, String phone, String email, String dueAmount, String paidAmount, String nameOnReciept, String installments, String amountPerInstallment, LocalDate creationdate, String sponsor, String status) {
        this.contractNumber = contractNumber;
        this.regNumber = regNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.dueAmount = dueAmount;
        this.paidAmount = paidAmount;
        this.nameOnReciept = nameOnReciept;
        this.installments = installments;
        this.amountPerInstallment = amountPerInstallment;
        this.creationdate = creationdate;
        this.sponsor = sponsor;
        this.status = status;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getNameOnReciept() {
        return nameOnReciept;
    }

    public void setNameOnReciept(String nameOnReciept) {
        this.nameOnReciept = nameOnReciept;
    }

    public String getInstallments() {
        return installments;
    }

    public void setInstallments(String installments) {
        this.installments = installments;
    }

    public String getAmountPerInstallment() {
        return amountPerInstallment;
    }

    public void setAmountPerInstallment(String amountPerInstallment) {
        this.amountPerInstallment = amountPerInstallment;
    }

    public LocalDate getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(LocalDate creationdate) {
        this.creationdate = creationdate;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
