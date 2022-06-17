package rw.ac.auca.contract.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author hirwa
 *
 */
@Entity
public class ContractSetup implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String setupId;
    private String academicYear;
    private String semester;
    private String submittionStartDate;
    private String submittionEndDate;
    private Double rate;

    public ContractSetup() {
    }

    public ContractSetup(String setupId, String academicYear, String semester, String submittionStartDate, String submittionEndDate, Double rate) {
        this.setupId = setupId;
        this.academicYear = academicYear;
        this.semester = semester;
        this.submittionStartDate = submittionStartDate;
        this.submittionEndDate = submittionEndDate;
        this.rate = rate;
    }

    public String getSetupId() {
        return setupId;
    }

    public void setSetupId(String setupId) {
        this.setupId = setupId;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSubmittionStartDate() {
        return submittionStartDate;
    }

    public void setSubmittionStartDate(String submittionStartDate) {
        this.submittionStartDate = submittionStartDate;
    }

    public String getSubmittionEndDate() {
        return submittionEndDate;
    }

    public void setSubmittionEndDate(String submittionEndDate) {
        this.submittionEndDate = submittionEndDate;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
