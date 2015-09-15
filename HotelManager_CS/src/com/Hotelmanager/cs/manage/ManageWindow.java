package com.Hotelmanager.cs.manage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import com.Hotelmanager.cs.admin.MyTableModel;

public class ManageWindow extends JFrame  implements ActionListener{

	private JPanel mcontentPane;
	private JPanel titlepanel;
	JButton orderButton;
	JButton cusButton;
	JButton roomButton;
	private JScrollPane mscrollPane;
	private JPanel Jpanel ;
	public ManageWindow() {
		Jpanel = new JPanel();
		Jpanel.setBackground(Color.WHITE);
		Jpanel.setLayout(new BorderLayout(10, 10));
		
		titlepanel = new JPanel();
		Jpanel.add(titlepanel, BorderLayout.NORTH);
		titlepanel.setLayout(new GridLayout(1, 5, 10, 30));
		
		orderButton = new JButton("�����鿴");
		titlepanel.add(orderButton);
		
		cusButton = new JButton("�û��鿴");
		titlepanel.add(cusButton);
		
		roomButton = new JButton("�������");
		titlepanel.add(roomButton);

		setTitle("ǰ̨��Ա�������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setContentPane(Jpanel);
		
		
		orderButton.addActionListener(this);
		cusButton.addActionListener(this);
		roomButton.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == orderButton){
			OrderAction();
		}else if(e.getSource() == cusButton){
			CusAction();
		}else if(e.getSource()==roomButton){
			RoomAction();
		}
		
	}
	private void RoomAction() {
		// TODO Auto-generated method stub
		final String sql = "select * from Room";	
		MyTableModel myModel = new MyTableModel(sql);
	    final JTable table1 = new JTable(myModel);
		table1.setRowHeight(30);  //���ñ����и߶�
		table1.setPreferredScrollableViewportSize(new Dimension(500,70));
	    table1.setColumnSelectionAllowed(true);
	    table1.setRowHeight(30);
	    //���������ݸı��ʱ��ȡ�ñ�������
	    final TableModel model = table1.getModel();
	    model.addTableModelListener(new TableModelListener(){
	      public void tableChanged(TableModelEvent e) {
	        int row = e.getFirstRow();
	        int column = e.getColumn();
	        //ȡ���б�������
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
	   //Ϊ���ݱ���"����"һ�м��������б��

	    TableColumn sexColumn = table1.getColumnModel().getColumn(0);
	    JComboBox comboBox = new JComboBox(
	                    new String[] {"��׼��","����","����������","����˫�˷�"});
	    sexColumn.setCellEditor(new DefaultCellEditor(comboBox));
	  //Ϊ���ݱ�������м������ּ�֤��
	    final JTextField integerField = new JTextField();
	    integerField.setHorizontalAlignment(JTextField.RIGHT);
	    DefaultCellEditor integerEditor =
	        new DefaultCellEditor(integerField) {
	            //���ط���ֵ�ķ���,���������ֵ�ʱ�򣬽�����ת��Ϊ0
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
		final String sql = "select * from Customer";	
		MyTableModel myModel = new MyTableModel(sql);
	    final JTable table1 = new JTable(myModel);
		table1.setRowHeight(30);  //���ñ����и߶�
		table1.setPreferredScrollableViewportSize(new Dimension(500,70));
	    table1.setColumnSelectionAllowed(true);
	    table1.setRowHeight(30);
	    //���������ݸı��ʱ��ȡ�ñ�������
	    final TableModel model = table1.getModel();
	    model.addTableModelListener(new TableModelListener(){
	      public void tableChanged(TableModelEvent e) {
	        int row = e.getFirstRow();
	        int column = e.getColumn();
	        //ȡ���б�������
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
	   //Ϊ���ݱ���"����"һ�м��������б��

	    TableColumn sexColumn = table1.getColumnModel().getColumn(0);
	    JComboBox comboBox = new JComboBox(
	                    new String[] {"��׼��","����","����������","����˫�˷�"});
	    sexColumn.setCellEditor(new DefaultCellEditor(comboBox));
	  //Ϊ���ݱ�������м������ּ�֤��
	    final JTextField integerField = new JTextField();
	    integerField.setHorizontalAlignment(JTextField.RIGHT);
	    DefaultCellEditor integerEditor =
	        new DefaultCellEditor(integerField) {
	            //���ط���ֵ�ķ���,���������ֵ�ʱ�򣬽�����ת��Ϊ0
	            public Object getCellEditorValue() {
	              try {return new Double(integerField.getText());}
	                catch(Exception e){return new Double(0);}
	            }
	        };
	    table1.setDefaultEditor(Integer.class, integerEditor);
	    mscrollPane = new JScrollPane(table1);
	    Jpanel.add(mscrollPane, BorderLayout.CENTER);
		
	}

	public void OrderAction(){
		final String sql = "select * from Myorder";	
		MyTableModel myModel = new MyTableModel(sql);
	    final JTable table1 = new JTable(myModel);
		table1.setRowHeight(30);  //���ñ����и߶�
		table1.setPreferredScrollableViewportSize(new Dimension(500,70));
	    table1.setColumnSelectionAllowed(true);
	    table1.setRowHeight(30);
	    //���������ݸı��ʱ��ȡ�ñ�������
//	    final TableModel model = table1.getModel();
//	    model.addTableModelListener(new TableModelListener(){
//	      public void tableChanged(TableModelEvent e) {
//	        int row = e.getFirstRow();
//	        int column = e.getColumn();
//	        //ȡ���б�������
//	        Object data = model.getValueAt(row, column);
//	        try{
//	        	//new updateDB(data,row,column,"Room",sql);
//	        	System.out.println("("+row +","+column+")"+data);
//	        	table1.requestFocus();
//	        	}
//	          catch(Exception e1){
//	          }
//	      }
//	    });
	   //Ϊ���ݱ���"����"һ�м��������б��

//	    TableColumn sexColumn = table1.getColumnModel().getColumn(0);
//	    JComboBox comboBox = new JComboBox(
//	                    new String[] {"��׼��","����","����������","����˫�˷�"});
//	    sexColumn.setCellEditor(new DefaultCellEditor(comboBox));
	  //Ϊ���ݱ�������м������ּ�֤��
//	    final JTextField integerField = new JTextField();
//	    integerField.setHorizontalAlignment(JTextField.RIGHT);
//	    DefaultCellEditor integerEditor =
//	        new DefaultCellEditor(integerField) {
//	            //���ط���ֵ�ķ���,���������ֵ�ʱ�򣬽�����ת��Ϊ0
//	            public Object getCellEditorValue() {
//	              try {return new Double(integerField.getText());}
//	                catch(Exception e){return new Double(0);}
//	            }
//	        };
//	    table1.setDefaultEditor(Integer.class, integerEditor);
	    mscrollPane = new JScrollPane(table1);
	    Jpanel.add(mscrollPane, BorderLayout.CENTER);
		
	}

}
