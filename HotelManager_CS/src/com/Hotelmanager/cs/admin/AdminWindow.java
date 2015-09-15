package com.Hotelmanager.cs.admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.ListSelectionModel;

import com.Hotelmanager.cs.Hibernate.DBconn;
import com.Hotelmanager.cs.manage.ManageWindow;

public class AdminWindow extends JFrame implements ActionListener{


	private JPanel Jpanel ;
	private JPanel titlepanel;
	private JButton ManagerBt;
	private JButton CusBt;
	private JButton RoomBt;
	private JScrollPane mscrollPane;

	/**
	 * Create the application.
	 */
	public AdminWindow() {
		Jpanel = new JPanel();
		Jpanel.setBackground(Color.WHITE);
		Jpanel.setLayout(new BorderLayout(10, 10));
		
		titlepanel = new JPanel();
		Jpanel.add(titlepanel, BorderLayout.NORTH);
		titlepanel.setLayout(new GridLayout(1, 5, 10, 30));
		
		ManagerBt = new JButton("前台人员信息管理");
		titlepanel.add(ManagerBt);
		
		CusBt = new JButton("用户信息管理");
		titlepanel.add(CusBt);
		
		RoomBt = new JButton("房间信息管理");
		titlepanel.add(RoomBt);

		setTitle("\u7CFB\u7EDF\u7BA1\u7406\u5458\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setContentPane(Jpanel);
		
		ManagerBt.addActionListener(this);
		CusBt.addActionListener(this);
		RoomBt.addActionListener(this);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == ManagerBt){
			ManagerAction();
		}else if(e.getSource() == CusBt){
			CusAction();
		}else if(e.getSource()==RoomBt){
			RoomAction();
		}
	}
	private void RoomAction() {
		// TODO Auto-generated method stub
		final String sql = "select * from Room";	
		MyTableModel myModel = new MyTableModel(sql);
	    final JTable table1 = new JTable(myModel);
		table1.setRowHeight(30);  //设置表格的行高度
		table1.setPreferredScrollableViewportSize(new Dimension(500,70));
	    table1.setColumnSelectionAllowed(true);
	    table1.setRowHeight(30);
	    //当表格的内容改变的时候取得表格的内容
	    final TableModel model = table1.getModel();
	    model.addTableModelListener(new TableModelListener(){
	      public void tableChanged(TableModelEvent e) {
	        int row = e.getFirstRow();
	        int column = e.getColumn();
	        //取得列表框的数据
	        Object data = model.getValueAt(row, column);
	        try{
	        	//new updateDB(data,row,column,"Room",sql);
	        	System.out.println("("+row +","+column+")"+data);
	        	table1.requestFocus();
	        	}
	          catch(Exception e1){
	          }
	      }
	    });
	   //为数据表中"爱好"一列加入下拉列表框

	    TableColumn sexColumn = table1.getColumnModel().getColumn(0);
	    JComboBox comboBox = new JComboBox(
	                    new String[] {"标准房","商务房","豪华海景房","豪华双人房"});
	    sexColumn.setCellEditor(new DefaultCellEditor(comboBox));
	  //为数据表的数字列加入数字检证框
	    final JTextField integerField = new JTextField();
	    integerField.setHorizontalAlignment(JTextField.RIGHT);
	    DefaultCellEditor integerEditor =
	        new DefaultCellEditor(integerField) {
	            //重载返回值的方法,当输入文字的时候，将文字转变为0
	            public Object getCellEditorValue() {
	              try {return new Double(integerField.getText());}
	                catch(Exception e){return new Double(0);}
	            }
	        };
	    table1.setDefaultEditor(Integer.class, integerEditor);
	    mscrollPane = new JScrollPane(table1);
	    Jpanel.add(mscrollPane, BorderLayout.CENTER);
	}
	private void CusAction() {
	// TODO Auto-generated method stub
//		mtable =MyTableModel.mtable; 
			final String sql = "select * from Customer";
			//创建带有模式类的列表框,并加入数据改变接收器
		    MyTableModel myModel = new MyTableModel(sql);
		    final JTable table1 = new JTable(myModel);
			table1.setRowHeight(30);  //设置表格的行高度
			table1.setPreferredScrollableViewportSize(new Dimension(500,70));
		    table1.setColumnSelectionAllowed(true);
		    table1.setRowHeight(30);
		    //当表格的内容改变的时候取得表格的内容
		    final TableModel model = table1.getModel();
		    model.addTableModelListener(new TableModelListener(){
		      public void tableChanged(TableModelEvent e) {
		        int row = e.getFirstRow();
		        int column = e.getColumn();
		        //取得列表框的数据
		        Object data = model.getValueAt(row, column);
		        try{
		        //s	new updateDB(data,row,column,"Customer",sql);
		        	System.out.println(data);
		        	table1.requestFocus();
		        	}
		          catch(Exception e1){
		          }
		      }
		    });
		   //为数据表中"爱好"一列加入下拉列表框

		    TableColumn sexColumn = table1.getColumnModel().getColumn(4);
		    JComboBox comboBox = new JComboBox(
		                    new String[] {"男","女"});
		    sexColumn.setCellEditor(new DefaultCellEditor(comboBox));
		  //为数据表的数字列加入数字检证框
		    final JTextField integerField = new JTextField();
		    integerField.setHorizontalAlignment(JTextField.RIGHT);
		    DefaultCellEditor integerEditor =
		        new DefaultCellEditor(integerField) {
		            //重载返回值的方法,当输入文字的时候，将文字转变为0
		            public Object getCellEditorValue() {
		              try {return new Double(integerField.getText());}
		                catch(Exception e){return new Double(0);}
		            }
		        };
		    table1.setDefaultEditor(Integer.class, integerEditor);
		    mscrollPane = new JScrollPane(table1);
		    Jpanel.add(mscrollPane, BorderLayout.CENTER);
		
	}
	public void ManagerAction(){
	//	mtable =MyTableModel.mtable; 
		String sql = "select mId,mName,mSex,mPassword from Manager";
		//创建带有模式类的列表框,并加入数据改变接收器
	    MyTableModel myModel = new MyTableModel(sql);
	    final JTable table1 = new JTable(myModel);
		table1.setRowHeight(30);  //设置表格的行高度
		table1.setPreferredScrollableViewportSize(new Dimension(500,70));
	    table1.setColumnSelectionAllowed(true);
	    table1.setRowHeight(30);
	    //当表格的内容改变的时候取得表格的内容
	    final TableModel model = table1.getModel();
	    model.addTableModelListener(new TableModelListener(){
	      public void tableChanged(TableModelEvent e) {
	        int row = e.getFirstRow();
	        int column = e.getColumn();
	        //取得列表框的数据
	        Object data = model.getValueAt(row, column);
	        try{
	        //	new updateDB(data,row,column,"Manager");
	        	System.out.println(data);
	        	table1.requestFocus();
	        	}
	          catch(Exception e1){
	          }
	      }
	    });
	   //为数据表中"爱好"一列加入下拉列表框

	    TableColumn sexColumn = table1.getColumnModel().getColumn(2);
	    JComboBox comboBox = new JComboBox(
	                    new String[] {"男","女"});
	    sexColumn.setCellEditor(new DefaultCellEditor(comboBox));
	  //为数据表的数字列加入数字检证框
	    final JTextField integerField = new JTextField();
	    integerField.setHorizontalAlignment(JTextField.RIGHT);
	    DefaultCellEditor integerEditor =
	        new DefaultCellEditor(integerField) {
	            //重载返回值的方法,当输入文字的时候，将文字转变为0
	            public Object getCellEditorValue() {
	              try {return new Double(integerField.getText());}
	                catch(Exception e){return new Double(0);}
	            }
	        };
	    table1.setDefaultEditor(Integer.class, integerEditor);
	    mscrollPane = new JScrollPane(table1);
	    Jpanel.add(mscrollPane, BorderLayout.CENTER);
	}
}
