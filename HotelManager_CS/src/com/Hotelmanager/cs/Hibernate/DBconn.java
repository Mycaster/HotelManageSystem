package com.Hotelmanager.cs.Hibernate;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBconn {
    static String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=hotelmanage";
    private static String userName="sa";    //默认用户名 
    private static String userPwd="husong";     //密码 

	public static Connection getConn(){
	     try{
	    //Class,forName() 保证相应的类被加载到JVM中，可以等价为：
	    	 /*com.microsoft.sqlserver.jdbc.SQLServerDriver diverName 
	    	                  =  new com.microsoft.sqlserver.jdbc.SQLServerDriver;
	    	  */
	         Class.forName(driverName); 
	         Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);	 
	     	 return dbConn;
	      }catch(Exception e){
	         System.out.println("连接失败！");
	         return null;
	    }

	}
}
