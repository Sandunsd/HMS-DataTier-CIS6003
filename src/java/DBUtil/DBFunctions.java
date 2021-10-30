/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUtil;

import java.sql.SQLException;
import java.util.List;
import DBUtil.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sadun
 */
public class DBFunctions {

    static Connection con = DBConnection.getConnection();

    public static List<Customer> listAllCustopmers() {
        List<Customer> listCustomer = new ArrayList<>();

        String sql = "SELECT * FROM customer";
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                String cusEmail = resultSet.getString("email");
                String cusUsername = resultSet.getString("username");
                String cusPassword = resultSet.getString("password");
                String cusNIC = resultSet.getString("NIC");
                String cusPhone = resultSet.getString("phone");
                String cusDOB = resultSet.getString("dob");
                String cusGender = resultSet.getString("gender");
                String cusBloodType = resultSet.getString("bloodType");
                String cusJoinDate = resultSet.getString("joinedDate");
                String cusEmerContact = resultSet.getString("emerContact");
                String cusAddress = resultSet.getString("address");

                Customer customer = new Customer(cusEmail, cusUsername, cusPassword, cusNIC, cusPhone, cusDOB, cusGender, cusBloodType, cusJoinDate, cusEmerContact, cusAddress);
                listCustomer.add(customer);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                resultSet.close();
                
              

            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
            return listCustomer;
        }
    }

/*
    public static boolean addCustomer(Customer customer) {
        String sql = "INSERT INTO `customer`(`email`, `username`, `password`) VALUES (?, ?, ?)";
        PreparedStatement statement = null;
        boolean rowInserted = false;

        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, customer.getCusEmail());
            statement.setString(2, customer.getCusUsername());
            statement.setString(3, customer.getCusPassword());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {

                rowInserted = statement.executeUpdate() > 0;
                
               
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
            return rowInserted;
        }
    }*/
    

    public static boolean addCustomerToLogin(String email, String username, String password) {
        Customer customer = new Customer();
        String sql = "INSERT INTO `customer`(`email`, `username`, `password`) VALUES (?, ?, ?)";
        PreparedStatement statement = null;
        boolean rowInserted = false;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, username);
            statement.setString(3, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                rowInserted = statement.executeUpdate() > 0;
                
                
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
        return rowInserted;
    }
    public static boolean deletetheCustomer(String username) {
        boolean isDeleted = false;
        Statement stmt = null;
        
        try {
          stmt = con.createStatement();
          
          String sql = "DELETE FROM `customer` WHERE `username`='" + username + "'";
          int rows = stmt.executeUpdate(sql);
          isDeleted = rows == 1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        return isDeleted;
    }
    
   
    
        public static boolean updatetheCustomer(String address, String username, String nic, String email, String phone, String gender, String dob, String bloodType, String joinedDate, String emerContact) {
        boolean isUpdated = false;
        Statement stmt = null;
        
        try {
          stmt = con.createStatement();
          
          String sql = "UPDATE `customer` SET `email`='" + email + "',`NIC`='" + nic + "',`phone`='" + phone + "',`dob`='" + dob + "',`gender`='" + gender + "',`bloodType`='" + bloodType + "',`joinedDate`='" + joinedDate + "',`emerContact`='" + emerContact + "',`address`='" + address + "' WHERE `username`='" + username + "'";
          int rows = stmt.executeUpdate(sql);
          isUpdated = rows == 1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return isUpdated;
    }


    public static Customer authenticate(String username) {
        Connection conn = null;
        Statement stmt = null;
        Customer customer = null;

        try {

            stmt = con.createStatement();

            String sql = "SELECT `username`, `password` FROM `customer` WHERE `username`='" + username + "'";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                customer = new Customer(rs.getString("username"), rs.getString("password"));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e2) {
                    System.out.println(e2.getMessage());
                }
            }


        }
        return customer;
    }

    public static Customer checkUsername(String username) {
        Connection conn = null;
        Statement stmt = null;
        Customer customer = null;

        try {

            stmt = con.createStatement();

            String sql = "SELECT `username`, `password` FROM `customer` WHERE `username`='"+username+"'";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                customer = new Customer(rs.getString("username"), rs.getString("password"));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e2) {
                    System.out.println(e2.getMessage());
                }
            }

        }
        return customer;
    }

    public static Customer checkEmail(String email) {
        Connection conn = null;
        Statement stmt = null;
        Customer customer = null;

        try {

            stmt = con.createStatement();

            String sql = "SELECT `email`, `password` FROM `customer` WHERE `email`='"+email+"'";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                customer = new Customer(rs.getString("email"));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e2) {
                    System.out.println(e2.getMessage());
                }
            }
        }
        return customer;
    }

    public static boolean searchCustomer(String email) {

        Statement stat = null;
        ResultSet res = null;

        String cusEmail;
        String cusUsername;
        String cusPassword;
        String cusNIC;
        String cusPhone;
        String cusDOB;
        String cusGender;
        String cusBloodType;
        String cusJoinDate;
        String cusEmerContact;
        String cusAddress;

        try {
            stat = con.createStatement();
            String data = "SELECT * FROM customer where username='" + email + "' ";
            res = stat.executeQuery(data);
            while (res.next()) {
                cusEmail = res.getString("email");
                cusUsername = res.getString("username");
                cusPassword = res.getString("password");
                cusNIC = res.getString("NIC");
                cusPhone = res.getString("phone");
                cusDOB = res.getString("dob");
                cusGender = res.getString("gender");
                cusBloodType = res.getString("bloodType");
                cusJoinDate = res.getString("joinedDate");
                cusEmerContact = res.getString("emerContact");
                cusAddress = res.getString("address");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    /**
     * *Doctor Function**
     */
    public static Customer checkDocUsername(String docName) {
        Connection conn = null;
        Statement stmt = null;
        Customer customer = null;

        try {

            stmt = con.createStatement();

            String sql = "SELECT username, password FROM doctor WHERE username='" + docName + "'";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                customer = new Customer(rs.getString("docName"), rs.getString("phone"));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e2) {
                    System.out.println(e2.getMessage());
                }
            }

        }
        return customer;
    }

    public static Customer checkDocEmail(String email) {
        Connection conn = null;
        Statement stmt = null;
        Customer customer = null;

        try {

            stmt = con.createStatement();

            String sql = "SELECT email, password FROM doctor WHERE email='" + email + "'";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                customer = new Customer(rs.getString("email"));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e2) {
                    System.out.println(e2.getMessage());
                }
            }
        }
        return customer;
    }

    public static boolean addDocToLogin(String docName, String email, String phone) {
        Customer customer = new Customer();
        String sql = "INSERT INTO doctor (docName, email, phone) VALUES (?, ?, ?)";
        PreparedStatement statement = null;
        boolean rowInserted = false;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, docName);
            statement.setString(2, email);
            statement.setString(3, phone);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                rowInserted = statement.executeUpdate() > 0;
                

            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
        return rowInserted;
    }

    /**
     * Appointments*
     */
    public static boolean addAppointment(String User, String Date, String Time, String Doctor, Float Payment) {
        String sql = "INSERT INTO `appointment` (`User`, `Date`, `Time`, `Doctor`, `Payment`) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = null;
        boolean rowInserted = false;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, User);
            statement.setString(2, Date);
            statement.setString(3, Time);
            statement.setString(4, Doctor);
            statement.setFloat(5, Payment);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                rowInserted = statement.executeUpdate() > 0;
                
                
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
        return rowInserted;
    }
    
    
       public static boolean updatetheAppointment(String username, String Time, String Payment) {
        boolean isUpdated = false;
        Statement stmt = null;
        
        try {
          stmt = con.createStatement();
          
          String sql = "UPDATE `appointment` SET `Time`='" + Time + "',`Payment`='" + Payment + "' WHERE `User`='" + username + "'";
          int rows = stmt.executeUpdate(sql);
          isUpdated = rows == 1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        return isUpdated;
    }
    public static boolean deleteAppointment(String username) {
        boolean isDeleted = false;
        Statement stmt = null;
        
        try {
          stmt = con.createStatement();
          
          String sql = "DELETE FROM `appointment` WHERE `User`='" + username + "'";
          int rows = stmt.executeUpdate(sql);
          isDeleted = rows == 1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        return isDeleted;
    }
    
    
    
       public static boolean updatetheDoctor(String email, String docName, String phone) {
        boolean isUpdated = false;
        Statement stmt = null;
        
        try {
          stmt = con.createStatement();
          
          String sql = "UPDATE `doctor` SET `docName`='" + docName + "',`phone`='" + phone + "' WHERE `email`='" + email + "'";
          int rows = stmt.executeUpdate(sql);
          isUpdated = rows == 1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        return isUpdated;
    }
}
