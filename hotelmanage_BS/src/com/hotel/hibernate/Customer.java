package com.hotel.hibernate;

import java.util.HashSet;
import java.util.Set;


/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer  implements java.io.Serializable {


    // Fields    

     private Integer cid;
     private String cname;
     private String cnickname;
     private String cpassword;
     private String csex;
     private String cverifyId;
     private String cphone;
     private String caddress;
     private String cemail;
     private Set myorders = new HashSet(0);


    // Constructors

    /** default constructor */
    public Customer() {
    }

	/** minimal constructor */
    public Customer(Integer cid, String cname, String cnickname, String cpassword, String csex, String cverifyId, String cphone, String caddress, String cemail) {
        this.cid = cid;
        this.cname = cname;
        this.cnickname = cnickname;
        this.cpassword = cpassword;
        this.csex = csex;
        this.cverifyId = cverifyId;
        this.cphone = cphone;
        this.caddress = caddress;
        this.cemail = cemail;
    }
    
    /** full constructor */
    public Customer(Integer cid, String cname, String cnickname, String cpassword, String csex, String cverifyId, String cphone, String caddress, String cemail, Set myorders) {
        this.cid = cid;
        this.cname = cname;
        this.cnickname = cnickname;
        this.cpassword = cpassword;
        this.csex = csex;
        this.cverifyId = cverifyId;
        this.cphone = cphone;
        this.caddress = caddress;
        this.cemail = cemail;
        this.myorders = myorders;
    }

   
    // Property accessors

    public Integer getCid() {
        return this.cid;
    }
    
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return this.cname;
    }
    
    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCnickname() {
        return this.cnickname;
    }
    
    public void setCnickname(String cnickname) {
        this.cnickname = cnickname;
    }

    public String getCpassword() {
        return this.cpassword;
    }
    
    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public String getCsex() {
        return this.csex;
    }
    
    public void setCsex(String csex) {
        this.csex = csex;
    }

    public String getCverifyId() {
        return this.cverifyId;
    }
    
    public void setCverifyId(String cverifyId) {
        this.cverifyId = cverifyId;
    }

    public String getCphone() {
        return this.cphone;
    }
    
    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getCaddress() {
        return this.caddress;
    }
    
    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public String getCemail() {
        return this.cemail;
    }
    
    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public Set getMyorders() {
        return this.myorders;
    }
    
    public void setMyorders(Set myorders) {
        this.myorders = myorders;
    }
   








}