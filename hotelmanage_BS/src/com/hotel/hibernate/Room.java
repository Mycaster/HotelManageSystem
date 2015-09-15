package com.hotel.hibernate;

import java.util.HashSet;
import java.util.Set;


/**
 * Room entity. @author MyEclipse Persistence Tools
 */

public class Room  implements java.io.Serializable {


    // Fields    

     private String roomType;
     private Integer price;
     private Integer restNumber;
     private String pictures;
     private String introduce;
     private Set myorders = new HashSet(0);


    // Constructors

    /** default constructor */
    public Room() {
    }

	/** minimal constructor */
    public Room(String roomType, Integer price, Integer restNumber, String pictures, String introduce) {
        this.roomType = roomType;
        this.price = price;
        this.restNumber = restNumber;
        this.pictures = pictures;
        this.introduce = introduce;
    }
    
    /** full constructor */
    public Room(String roomType, Integer price, Integer restNumber, String pictures, String introduce, Set myorders) {
        this.roomType = roomType;
        this.price = price;
        this.restNumber = restNumber;
        this.pictures = pictures;
        this.introduce = introduce;
        this.myorders = myorders;
    }

   
    // Property accessors

    public String getRoomType() {
        return this.roomType;
    }
    
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getPrice() {
        return this.price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRestNumber() {
        return this.restNumber;
    }
    
    public void setRestNumber(Integer restNumber) {
        this.restNumber = restNumber;
    }

    public String getPictures() {
        return this.pictures;
    }
    
    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getIntroduce() {
        return this.introduce;
    }
    
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Set getMyorders() {
        return this.myorders;
    }
    
    public void setMyorders(Set myorders) {
        this.myorders = myorders;
    }
   








}