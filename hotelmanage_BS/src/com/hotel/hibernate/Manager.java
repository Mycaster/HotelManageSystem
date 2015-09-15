package com.hotel.hibernate;



/**
 * Manager entity. @author MyEclipse Persistence Tools
 */

public class Manager implements java.io.Serializable {


    // Fields    

     private String mid;
     private String mname;
     private String msex;
     private String mpassword;
     private String mtype;


    // Constructors

    /** default constructor */
    public Manager() {
    }

	/** minimal constructor */
    public Manager(String mid, String mname, String msex) {
        this.mid = mid;
        this.mname = mname;
        this.msex = msex;
    }
    
    /** full constructor */
    public Manager(String mid, String mname, String msex, String mpassword, String mtype) {
        this.mid = mid;
        this.mname = mname;
        this.msex = msex;
        this.mpassword = mpassword;
        this.mtype = mtype;
    }

   
    // Property accessors

    public String getMid() {
        return this.mid;
    }
    
    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMname() {
        return this.mname;
    }
    
    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMsex() {
        return this.msex;
    }
    
    public void setMsex(String msex) {
        this.msex = msex;
    }

    public String getMpassword() {
        return this.mpassword;
    }
    
    public void setMpassword(String mpassword) {
        this.mpassword = mpassword;
    }

    public String getMtype() {
        return this.mtype;
    }
    
    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

}