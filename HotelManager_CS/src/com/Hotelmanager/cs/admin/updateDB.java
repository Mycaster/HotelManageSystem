package com.Hotelmanager.cs.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.Hotelmanager.cs.Hibernate.DBconn;

public class updateDB {

	public updateDB (Object data,int row,int column,String TableName,String sql)
			//ResultSetMetaData metaData,ResultSet rs)
			{
	try{
		String sql2=new convertSql().convert(data,row,column,TableName,sql);
		Connection dbConn = DBconn.getConn();
		PreparedStatement pre = dbConn.prepareStatement(sql2);
		pre.executeUpdate();
		dbConn.close();
			
	  }catch (SQLException ex) {
		ex.printStackTrace();
    	System.err.println("Cannot connect to this database.");
        System.err.println(ex);
	}
	}
}
