package com.Hotelmanager.cs.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import com.Hotelmanager.cs.Hibernate.DBconn;

public class convertSql {

	public String convert(Object data, int row, int column,String TableName,String sql)
		//	ResultSetMetaData metaData,ResultSet rs) 
					throws SQLException {
		String columnName = null;
		String zhujian = null;
		Object zhujianzhi = null;
		String sqlconvert=null;	

		Connection dbConn = DBconn.getConn();
		Statement stat  = dbConn.createStatement();
	    ResultSet rs = stat.executeQuery(sql);
	    ResultSetMetaData   metaData;
	    metaData = rs.getMetaData();
	    
	    zhujianzhi = rs.getObject(1);
	    System.out.print("rs.getObject(1):"+rs.getObject(1));
	    metaData.getColumnLabel(1);
	    int number=metaData.getColumnCount();
	    while(rs.next())
	    {
	    	for (int i = 1; i <= number; i++) {
		    	if(i==(row+1)){
		    		columnName = metaData.getColumnLabel(i);
		    	}
		    }
	    }
		sqlconvert="UPDATE "+TableName+" SET "+columnName+" = '"
		+data+"' WHERE "+zhujian+" = '"+zhujianzhi+"' ";
		return sqlconvert;
	}
}
