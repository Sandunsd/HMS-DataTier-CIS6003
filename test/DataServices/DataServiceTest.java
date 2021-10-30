/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataServices;

import DBUtil.Customer;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class DataServiceTest {
    
    public DataServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of listAllCustopmers method, of class DataService.
     */
    @Test
    public void testListAllCustopmers() {
        System.out.println("listAllCustopmers");
        DataService instance = new DataService();
        List<Customer> expResult = null;
        List<Customer> result = instance.listAllCustopmers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addCustomerToLogin method, of class DataService.
     */
    @Test
    public void testAddCustomerToLogin() {
        System.out.println("addCustomerToLogin");
        String email = "";
        String username = "";
        String password = "";
        DataService instance = new DataService();
        boolean expResult = false;
        boolean result = instance.addCustomerToLogin(email, username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCustomer method, of class DataService.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        String username = "";
        DataService instance = new DataService();
        Customer expResult = null;
        Customer result = instance.getCustomer(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkUsername method, of class DataService.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "";
        DataService instance = new DataService();
        Customer expResult = null;
        Customer result = instance.checkUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkEmail method, of class DataService.
     */
    @Test
    public void testCheckEmail() {
        System.out.println("checkEmail");
        String email = "";
        DataService instance = new DataService();
        Customer expResult = null;
        Customer result = instance.checkEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchCustomer method, of class DataService.
     */
    @Test
    public void testSearchCustomer() {
        System.out.println("searchCustomer");
        String email = "";
        DataService instance = new DataService();
        boolean expResult = false;
        boolean result = instance.searchCustomer(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDocToLogin method, of class DataService.
     */
    @Test
    public void testAddDocToLogin() {
        System.out.println("addDocToLogin");
        String docName = "";
        String email = "";
        String phone = "";
        DataService instance = new DataService();
        boolean expResult = false;
        boolean result = instance.addDocToLogin(docName, email, phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDocEmail method, of class DataService.
     */
    @Test
    public void testCheckDocEmail() {
        System.out.println("checkDocEmail");
        String email = "";
        DataService instance = new DataService();
        Customer expResult = null;
        Customer result = instance.checkDocEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDocUsername method, of class DataService.
     */
    @Test
    public void testCheckDocUsername() {
        System.out.println("checkDocUsername");
        String docName = "";
        DataService instance = new DataService();
        Customer expResult = null;
        Customer result = instance.checkDocUsername(docName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAppointment method, of class DataService.
     */
    @Test
    public void testAddAppointment() {
        System.out.println("addAppointment");
        String User = "";
        String Date = "";
        String Time = "";
        String Doctor = "";
        Float Payment = null;
        DataService instance = new DataService();
        boolean expResult = false;
        boolean result = instance.addAppointment(User, Date, Time, Doctor, Payment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatetheCustomer method, of class DataService.
     */
    @Test
    public void testUpdatetheCustomer() {
        System.out.println("updatetheCustomer");
        String address = "";
        String nic = "";
        String email = "";
        String phone = "";
        String gender = "";
        String dob = "";
        String bloodType = "";
        String joinedDate = "";
        String emerContact = "";
        String username = "";
        DataService instance = new DataService();
        boolean expResult = false;
        boolean result = instance.updatetheCustomer(address, nic, email, phone, gender, dob, bloodType, joinedDate, emerContact, username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletetheCustomer method, of class DataService.
     */
    @Test
    public void testDeletetheCustomer() {
        System.out.println("deletetheCustomer");
        String username = "";
        DataService instance = new DataService();
        boolean expResult = false;
        boolean result = instance.deletetheCustomer(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatetheDoctor method, of class DataService.
     */
    @Test
    public void testUpdatetheDoctor() {
        System.out.println("updatetheDoctor");
        String email = "";
        String docName = "";
        String phone = "";
        DataService instance = new DataService();
        boolean expResult = false;
        boolean result = instance.updatetheDoctor(email, docName, phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatetheAppointment method, of class DataService.
     */
    @Test
    public void testUpdatetheAppointment() {
        System.out.println("updatetheAppointment");
        String username = "";
        String Time = "";
        String Payment = "";
        DataService instance = new DataService();
        boolean expResult = false;
        boolean result = instance.updatetheAppointment(username, Time, Payment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAppointment method, of class DataService.
     */
    @Test
    public void testDeleteAppointment() {
        System.out.println("deleteAppointment");
        String username = "";
        DataService instance = new DataService();
        boolean expResult = false;
        boolean result = instance.deleteAppointment(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
