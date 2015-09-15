package com.Hotelmanager.cs.manage;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel{
	private String [] columnNames = {
			"","","","","","",""
	};
	private Object[][]data ={
			{""},{""},{""},{""},{""},{""},{""}
	};
	public int getColumnCount(){
		return columnNames.length;
	}
	public int getRowCount(){
		return data.length;
	}
	public String getColumnName(int col){
		return columnNames[col];
	}
	public Object getValueAt(int row,int col){
		return data[row][col];
	}
	
	public Class getColumnClass(int c){
		return getValueAt(0, c).getClass();
	}
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		if(columnIndex<2){
			return false;
		}else{
			return true;
		}
	}
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

		
	}
	
}
