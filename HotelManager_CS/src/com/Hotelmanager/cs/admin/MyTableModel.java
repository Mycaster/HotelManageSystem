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
	   //��������������һ��Ҫ����AbstractTableModel��
	    //�ֱ�����������,�������б������
	    public int getColumnCount() {return columnNames.length;}

	    public int getRowCount() {return data.length;}

	    public Object getValueAt(int row, int col) {
	    	return data[row][col];}
	  //�÷�����һ��Ҫ����AbstractTableModel��,�÷��������б�ı���
	    public String getColumnName(int col) {return columnNames[col];}
	   //ͨ��getClass()��������Ĭ�ϵĿؼ�,��true��false��Ĭ�Ͽؼ��Ǹ�ѡ��,
	    //�÷�����һ��Ҫ����AbstractTableModel��
	    public Class getColumnClass(int c) {

	      return getValueAt(0, c).getClass();

	    }
	    //������Ա༭�ĵ�Ԫ,true��ʾ�ɱ༭,false��ʾ���ɱ༭

	    public boolean isCellEditable(int row, int col) {return true;}
	   //���ı���ֵ�����ڱ����
	    public void setValueAt(Object value, int row, int col) {

	      data[row][col] = value;

	      fireTableCellUpdated(row, col);

	    }

	}




