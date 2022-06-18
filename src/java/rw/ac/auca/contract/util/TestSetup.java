package rw.ac.auca.contract.util;

import java.util.Date;
import rw.ac.auca.contract.controller.GenericDao;
import rw.ac.auca.contract.entities.ContractSetup;

/**
 *
 * @author hirwa
 */
public class TestSetup {
    public static void main(String[] args) {
        ContractSetup setup1 = new ContractSetup();
        ContractSetup setup2 = new ContractSetup();
        GenericDao dao = new GenericDao();
        
        setup1.setSetupId("S2-21-22");
        setup1.setAcademicYear("2021-2022");
        setup1.setRate(0.50);
        setup1.setSemester("2");
        setup1.setSubmittionStartDate(new Date(2022,06,01));
        setup1.setSubmittionEndDate(new Date(2022,07,01));

        setup2.setSetupId("S1-21-22");
        setup2.setAcademicYear("2021-2022");
        setup2.setRate(0.50);
        setup2.setSemester("1");
        setup2.setSubmittionStartDate(new Date(2022, 02, 10));
        setup2.setSubmittionEndDate(new Date(2022,02,30));
        
        dao.createNewSetup(setup1);
        dao.createNewSetup(setup2);
        
        ContractSetup set1 = dao.findContractSetup("S2-21-22");
        System.out.println(set1.getSemester()+" - "+set1.getAcademicYear()+" - "+set1.getRate()+" - "+set1.getSubmittionStartDate()+" - "+set1.getSubmittionEndDate());
    }
}
