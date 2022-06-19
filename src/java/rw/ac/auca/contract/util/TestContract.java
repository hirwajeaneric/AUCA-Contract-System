package rw.ac.auca.contract.util;

import java.util.Date;
import rw.ac.auca.contract.controller.GenericDao;
import rw.ac.auca.contract.entities.Contract;

/**
 *
 * @author hirwa
 */
public class TestContract {
    
    public static void main(String[] args) {
        Contract contract1 = new Contract();
        Contract contract2 = new Contract();
        Contract contract3 = new Contract();
        Contract contract4 = new Contract();
        Contract contract5 = new Contract();
        GenericDao genericDao = new GenericDao();
    
        contract1.setRegNumber("22002");
        contract1.setFirstName("Muyango");
        contract1.setLastName("Bailly");
        contract1.setPhone("0780539859");
        contract1.setEmail("muyango@gmail.com");
        contract1.setDueAmount(500000.0);
        contract1.setPaidAmount(200000.0);
        contract1.setNameOnReciept("Muyango Bailly");
        contract1.setAmountPerInstallment(100000.0);
        contract1.setCreationdate(new Date(02/07/2022));
        contract1.setStatus("pending");

        contract2.setRegNumber("22026");
        contract2.setFirstName("Hirwa");
        contract2.setLastName("Jean Eric");
        contract2.setPhone("0780599859");
        contract2.setEmail("hirwa@gmail.com");
        contract2.setDueAmount(200000.0);
        contract2.setPaidAmount(100000.0);
        contract2.setNameOnReciept("Hirwa J Eric");
        contract2.setAmountPerInstallment(33333.33);
        contract2.setCreationdate(new Date(06/07/2022));
        contract2.setStatus("pending");
     
        contract3.setRegNumber("22025");
        contract3.setFirstName("Bientot");
        contract3.setLastName("Ririmba");
        contract3.setPhone("0780534859");
        contract3.setEmail("bririmba@gmail.com");
        contract3.setDueAmount(300000.0);
        contract3.setPaidAmount(150000.0);
        contract3.setNameOnReciept("Ririmba");
        contract3.setAmountPerInstallment(50000.0);
        contract3.setCreationdate(new Date(26/06/2022));
        contract3.setStatus("pending");

        contract4.setRegNumber("22022");
        contract4.setFirstName("Anne Marie");
        contract4.setLastName("Umubyeyi");
        contract4.setPhone("0780512323");
        contract4.setEmail("umubyeyiannemarie@gmail.com");
        contract4.setDueAmount(100000.0);
        contract4.setPaidAmount(50000.0);
        contract4.setNameOnReciept("Anne Umubyeyi");
        contract4.setAmountPerInstallment(1666.7);
        contract4.setCreationdate(new Date(02/07/2022));
        contract4.setStatus("pending");
        
        contract5.setRegNumber("22026");
        contract5.setFirstName("Hirwa");
        contract5.setLastName("Jean Eric");
        contract5.setPhone("0780599859");
        contract5.setEmail("hirwa@gmail.com");
        contract5.setDueAmount(200000.0);
        contract5.setPaidAmount(100000.0);
        contract5.setNameOnReciept("Hirwa J Eric");
        contract5.setAmountPerInstallment(33333.33);
        contract5.setCreationdate(new Date(10/02/2022));
        contract5.setStatus("Approved");
        
        genericDao.createContract(contract1);
        genericDao.createContract(contract2);
        genericDao.createContract(contract3);
        genericDao.createContract(contract4);
        genericDao.createContract(contract5);
        
    }
}
