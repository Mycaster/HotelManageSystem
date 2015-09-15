package com.hotel.hibernate;

import java.util.HashSet;
import java.util.Set;


/**
 * RoomDetail entity. @author MyEclipse Persistence Tools
 */

public class RoomDetail  implements java.io.Serializable {


    // Fields    

     private Integer roomId;
     private RoomDetail roomDetail;
     private String type;
     private Integer price;
     private String isEmpty;
     private Set roomDetails = new HashSet(0);


    // Constructors

    /** default constructor */
    public RoomDetail() {
    }

	/** minimal constructor */
    public RoomDetail(Integer roomId, RoomDetail roomDetail, String type, Integer price, String isEmpty) {
        this.roomId = roomId;
        this.roomDetail = roomDetail;
        this.type = type;
        this.price = price;
        this.isEmpty = isEmpty;
    }
    
    /** full constructor */
    public RoomDetail(Integer roomId, RoomDetail roomDetail, String type, Integer price, String isEmpty, Set roomDetails) {
        this.roomId = roomId;
        this.roomDetail = roomDetail;
        this.type = type;
        this.price = price;
        this.isEmpty = isEmpty;
        this.roomDetails = roomDetails;
    }

   
    // Property accessors

    public Integer getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public RoomDetail getRoomDetail() {
        return this.roomDetail;
    }
    
    public void setRoomDetail(RoomDetail roomDetail) {
        this.roomDetail = roomDetail;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return this.price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getIsEmpty() {
        return this.isEmpty;
    }
    
    public void setIsEmpty(String isEmpty) {
        this.isEmpty = isEmpty;
    }

    public Set getRoomDetails() {
        return this.roomDetails;
    }
    
    public void setRoomDetails(Set roomDetails) {
        this.roomDetails = roomDetails;
    }
   








}