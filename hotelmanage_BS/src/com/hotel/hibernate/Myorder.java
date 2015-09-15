package com.hotel.hibernate;

import java.util.Date;


/**
 * Myorder entity. @author MyEclipse Persistence Tools
 */

public class Myorder  implements java.io.Serializable {


    // Fields    

     private Integer oid;
     private Customer customer;
     private Room room;
     private Integer roomcount;
     private String status;
     private Date timeDeal;
     private Date timeIn;
     private Date timeOut;


    // Constructors

    /** default constructor */
    public Myorder() {
    }

    
    /** full constructor */
    public Myorder(Integer oid, Customer customer, Room room, Integer roomcount, String status, Date timeDeal, Date timeIn, Date timeOut) {
        this.oid = oid;
        this.customer = customer;
        this.room = room;
        this.roomcount = roomcount;
        this.status = status;
        this.timeDeal = timeDeal;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

   
    // Property accessors

    public Integer getOid() {
        return this.oid;
    }
    
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return this.room;
    }
    
    public void setRoom(Room room) {
        this.room = room;
    }

    public Integer getRoomcount() {
        return this.roomcount;
    }
    
    public void setRoomcount(Integer roomcount) {
        this.roomcount = roomcount;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTimeDeal() {
        return this.timeDeal;
    }
    
    public void setTimeDeal(Date timeDeal) {
        this.timeDeal = timeDeal;
    }

    public Date getTimeIn() {
        return this.timeIn;
    }
    
    public void setTimeIn(Date timeIn) {
        this.timeIn = timeIn;
    }

    public Date getTimeOut() {
        return this.timeOut;
    }
    
    public void setTimeOut(Date timeOut) {
        this.timeOut = timeOut;
    }
   








}