/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sadun
 */
@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {

    private String cusEmail;
    private String cusUsername;
    private String cusPassword;
    private String cusNIC;
    private String cusPhone;
    private String cusDOB;
    private String cusGender;
    private String cusBloodType;
    private String cusJoinDate;
    private String cusEmerContact;
    private String cusAddress;

    public Customer() {

    }

    public Customer(String cusUsername, String cusPassword) {
        this.cusUsername = cusUsername;
        this.cusPassword = cusPassword;
    }
    
       public Customer(String cusEmail) {
        this.cusEmail = cusEmail;
    }
    
    public Customer(String cusEmail, String cusUsername, String cusPassword, String cusNIC, String cusPhone, String cusDOB, String cusGender, String cusBloodType, String cusJoinDate, String cusEmerContact, String cusAddress) {
        this.cusEmail = cusEmail;
        this.cusUsername = cusUsername;
        this.cusPassword = cusPassword;
        this.cusNIC = cusNIC;
        this.cusPhone = cusPhone;
        this.cusDOB = cusDOB;
        this.cusGender = cusGender;
        this.cusBloodType = cusBloodType;
        this.cusJoinDate = cusJoinDate;
        this.cusEmerContact = cusEmerContact;
        this.cusAddress = cusAddress;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public String getCusUsername() {
        return cusUsername;
    }

    public String getCusPassword() {
        return cusPassword;
    }

    public String getCusNIC() {
        return cusNIC;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public String getCusDOB() {
        return cusDOB;
    }

    public String getCusGender() {
        return cusGender;
    }

    public String getCusBloodType() {
        return cusBloodType;
    }

    public String getCusJoinDate() {
        return cusJoinDate;
    }

    public String getCusEmerContact() {
        return cusEmerContact;
    }

    public String getCusAddress() {
        return cusAddress;
    }


    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public void setCusUsername(String cusUsername) {
        this.cusUsername = cusUsername;
    }

    public void setCusPassword(String cusPassword) {
        this.cusPassword = cusPassword;
    }

    public void setCusNIC(String cusNIC) {
        this.cusNIC = cusNIC;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    public void setCusDOB(String cusDOB) {
        this.cusDOB = cusDOB;
    }

    public void setCusGender(String cusGender) {
        this.cusGender = cusGender;
    }

    public void setCusBloodType(String cusBloodType) {
        this.cusBloodType = cusBloodType;
    }

    public void setCusJoinDate(String cusJoinDate) {
        this.cusJoinDate = cusJoinDate;
    }

    public void setCusEmerContact(String cusEmerContact) {
        this.cusEmerContact = cusEmerContact;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

}
