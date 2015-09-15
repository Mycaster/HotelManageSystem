package com.Hotelmanager.cs.admin;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import com.Hotelmanager.cs.Hibernate.DBconn;
public class MyTableModel  extends AbstractTableModel {
	private  Object[][] data = new Object[100][10];
	private  String[] columnNames;
	
	public MyTableModel(String sql){
		try{
			Connection dbConn = DBconn.getConn();
			Statement stat  = dbConn.createStatement();
		    ResultSet rs = stat.executeQuery(sql);
		    ResultSetMetaData   metaData;
		    metaData = rs.getMetaData();
		    int number=metaData.getColumnCount();
		    columnNames = new String[number];
		    for(int num=0 ; num<number; num++)
		    {
		    	columnNames[num]=(metaData.getColumnLabel(num+1));
		    }
		    int j=0;
		    while(rs.next())
		    {	    
		    	for (int i = 0; i < number; i++) {
		    		data[j][i]=rs.getObject(i+1);
			    	// newRow.addElement(rs.getObject(i));			    	 
			    }
			    j++;
		    }
			dbConn.close();
			rs.close();
		}   catch (SQLException ex) {
			ex.printStackTrace();
	    	System.err.println("Cannot connect to this database.");
	        System.err.println(ex);
		}
	}
	   //下面三个方法是一定要加入AbstractTableModel类
	    //分别是设置列数,行数与列表的数据
	    public int getColumnCount() {return columnNames.length;}

	    public int getRowCount() {return data.length;}

	    public Object getValueAt(int row, int col) {
	    	return data[row][col];}
	  //该方法不一定要加入AbstractTableModel类,该方法设置列表的标题
	    public String getColumnName(int col) {return columnNames[col];}
	   //通过getClass()方法设置默认的控件,如true与false的默认控件是复选框,
	    //该方法不一定要加入AbstractTableModel类
	    public Class getColumnClass(int c) {

	      return getValueAt(0, c).getClass();

	    }
	    //定义可以编辑的单元,true表示可编辑,false表示不可编辑

	    public boolean isCellEditable(int row, int col) {return true;}
	   //将改变后的值保存在表格中
	    public void setValueAt(Object value, int row, int col) {

	      data[row][col] = value;

	      fireTableCellUpdated(row, col);

	    }

	}




