/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataServices;

import DBUtil.Customer;
import DBUtil.DBFunctions;
import java.sql.SQLException;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Sadun
 */
@WebService(serviceName = "DataService")
public class DataService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listAllCustopmers")
    public List<Customer> listAllCustopmers() {
        return DBFunctions.listAllCustopmers();
    }

/*
    @WebMethod(operationName = "addCustomer")
    public boolean addCustomer(@WebParam(name = "user") Customer customer) {
        return DBFunctions.addCustomer(customer);
    }
*/
    
    @WebMethod(operationName = "addCustomerToLogin")
    public boolean addCustomerToLogin(@WebParam(name = "email") String email,
            @WebParam(name = "username") String username,
            @WebParam(name = "password") String password) {
        return DBFunctions.addCustomerToLogin(email, username, password);
    }

    @WebMethod(operationName = "authenticate")
    public Customer getCustomer(@WebParam(name = "username") String username) {
        return DBFunctions.authenticate(username);
    }

    @WebMethod(operationName = "checkUsername")
    public Customer checkUsername(@WebParam(name = "username") String username) {
        return DBFunctions.checkUsername(username);
    }

    @WebMethod(operationName = "checkEmail")
    public Customer checkEmail(@WebParam(name = "email") String email) {
        return DBFunctions.checkEmail(email);
    }

    @WebMethod(operationName = "searchCustomer")
    public boolean searchCustomer(@WebParam(name = "email") String email) {
        return DBFunctions.searchCustomer(email);
    }

    @WebMethod(operationName = "addDocToLogin")
    public boolean addDocToLogin(@WebParam(name = "docName") String docName,
            @WebParam(name = "email") String email,
            @WebParam(name = "phone") String phone) {
        return DBFunctions.addDocToLogin(docName, email, phone);
    }

    @WebMethod(operationName = "checkDocEmail")
    public Customer checkDocEmail(@WebParam(name = "email") String email) {
        return DBFunctions.checkDocEmail(email);
    }

    @WebMethod(operationName = "checkDocUsername")
    public Customer checkDocUsername(@WebParam(name = "docName") String docName) {
        return DBFunctions.checkDocUsername(docName);
    }

    @WebMethod(operationName = "addAppointment")
    public boolean addAppointment(@WebParam(name = "User") String User,
            @WebParam(name = "Date") String Date, @WebParam(name = "Time") String Time, @WebParam(name = "Doctor") String Doctor, @WebParam(name = "Payment") Float Payment){
        return DBFunctions.addAppointment(User, Date, Time, Doctor, Payment);
    }

    @WebMethod(operationName = "updatetheCustomer")
    public boolean updatetheCustomer(@WebParam(name = "address") String address, @WebParam(name = "nic") String nic, @WebParam(name = "email") String email, @WebParam(name = "phone") String phone, @WebParam(name = "gender") String gender, @WebParam(name = "dob") String dob, @WebParam(name = "bloodType") String bloodType, @WebParam(name = "joinedDate") String joinedDate, @WebParam(name = "emerContact") String emerContact, @WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        return DBFunctions.updatetheCustomer(address, username, nic, email,phone,gender,dob,bloodType,joinedDate,emerContact);
    }
    
    @WebMethod(operationName = "deletetheCustomer")
    public boolean deletetheCustomer(@WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        return DBFunctions.deletetheCustomer(username);
    }
    @WebMethod(operationName = "updatetheDoctor")
    public boolean updatetheDoctor(@WebParam(name = "email") String email, @WebParam(name = "docName") String docName, @WebParam(name = "phone") String phone) {
        //TODO write your implementation code here:
        return DBFunctions.updatetheDoctor(email, docName, phone);
    }
   
    
    @WebMethod(operationName = "updatetheAppointment")
    public boolean updatetheAppointment(@WebParam(name = "username") String username, @WebParam(name = "Time") String Time, @WebParam(name = "Payment") String Payment) {
        //TODO write your implementation code here:
        return DBFunctions.updatetheAppointment(username, Time, Payment);
    }

    @WebMethod(operationName = "deleteAppointment")
    public boolean deleteAppointment(@WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        return DBFunctions.deleteAppointment(username);
    }
    
}
