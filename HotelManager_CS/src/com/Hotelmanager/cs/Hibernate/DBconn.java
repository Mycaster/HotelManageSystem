package com.Hotelmanager.cs.Hibernate;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBconn {
    static String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=hotelmanage";
    private static String userName="sa";    //Ĭ���û��� 
    private static String userPwd="husong";     //���� 

	public static Connection getConn(){
	     try{
	    //Class,forName() ��֤��Ӧ���౻���ص�JVM�У����Եȼ�Ϊ��
	    	 /*com.microsoft.sqlserver.jdbc.SQLServerDriver diverName 
	    	                  =  new com.microsoft.sqlserver.jdbc.SQLServerDriver;
	    	  */
	         Class.forName(driverName); 
	         Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);	 
	     	 return dbConn;
	      }catch(Exception e){
	         System.out.println("����ʧ�ܣ�");
	         return null;
	    }

	}
}
