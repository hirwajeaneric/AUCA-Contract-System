package rw.ac.auca.contract.util;

import java.util.List;
import rw.ac.auca.contract.controller.GenericDao;
import rw.ac.auca.contract.entities.Contract;

/**
 *
 * @author hirwa
 */
public class TestFetchingUserContracts {
    public static void main(String[] args) {
        Contract contract = new Contract();
        GenericDao genericDao = new GenericDao();
        
        String regNumber = "22026";
        List<Contract> listOfUserContracts = genericDao.listContractPerStudent(regNumber);
        for (Contract aContract : listOfUserContracts) {
            System.out.println(aContract.getFirstName()+" - "+aContract.getLastName()+" - "+aContract.getStatus());
        }
    }
}
