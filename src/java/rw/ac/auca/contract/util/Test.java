package rw.ac.auca.contract.util;

import rw.ac.auca.contract.controller.GenericDao;
import rw.ac.auca.contract.entities.LoginCheckUp;
import rw.ac.auca.contract.entities.StudentCredentials;

/**
 *
 * @author hirwa
 */
public class Test {
    
    public static void main(String[] args) {
        GenericDao genericDao = new GenericDao();
        StudentCredentials studentCredentials = new StudentCredentials();
        LoginCheckUp loginCheckUp = new LoginCheckUp();
        
        String regNumber = "22025";
        StudentCredentials thestudent = genericDao.findPassword(regNumber);
        System.out.println("password for"+regNumber+" is "+thestudent.getCreatePassword());
        if("123456".equals(thestudent.getCreatePassword())){
            System.out.println("Logged in successfully!");
        }else {
            System.out.println("Failed to loggin!");            
        }
    }
}
