package com.Hotelmanager.cs.welcome;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.Hotelmanager.cs.Hibernate.DBconn;
import com.Hotelmanager.cs.admin.AdminWindow;
import com.Hotelmanager.cs.manage.ManageWindow;

public class welcome implements ActionListener{

	private JFrame mframe;
	private JTextField userName;
	private JPasswordField userPassword;
	private JComboBox comboBox ;
	private JButton LoginButton; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome window = new welcome();
					window.mframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mframe = new JFrame();
		mframe.setTitle("\u9152\u5E97\u7BA1\u7406\u7CFB\u7EDF");
		mframe.setBackground(Color.GRAY);
		mframe.setForeground(Color.GRAY);
		mframe.setBounds(100, 100, 450, 300);
		mframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mframe.getContentPane().setLayout(null);
		
		JPanel LoginPanel = new JPanel();
		LoginPanel.setBounds(24, 54, 378, 164);
		mframe.getContentPane().add(LoginPanel);
		LoginPanel.setLayout(null);
		
		JLabel Title = new JLabel("\u8BF7\u767B\u5F55\uFF1A");
		Title.setFont(new Font("创艺繁楷体", Font.PLAIN, 20));
		Title.setBounds(127, 0, 155, 25);
		LoginPanel.add(Title);
		
		JLabel nameText = new JLabel("\u7528\u6237\u540D\uFF1A");
		nameText.setBounds(10, 65, 54, 15);
		LoginPanel.add(nameText);
		
		JLabel passwordText = new JLabel("\u5BC6\u7801\uFF1A");
		passwordText.setBounds(10, 90, 54, 15);
		LoginPanel.add(passwordText);
		
		userPassword = new JPasswordField();
		userPassword.setBounds(74, 90, 164, 15);
		LoginPanel.add(userPassword);
		
		userName = new JTextField();
		userName.setBounds(74, 65, 66, 15);
		LoginPanel.add(userName);
		userName.setColumns(10);
		
		LoginButton = new JButton("\u767B\u5F55");
		LoginButton.setBounds(121, 131, 93, 23);
		LoginPanel.add(LoginButton);
		
		JLabel Text = new JLabel("\u8EAB\u4EFD\uFF1A");
		Text.setBounds(10, 37, 54, 15);
		LoginPanel.add(Text);
		
		comboBox = new JComboBox();
		comboBox.setBounds(74, 34, 164, 21);
		LoginPanel.add(comboBox);
		comboBox.addItem("前台管理员");
		comboBox.addItem("系统管理员");
		
		LoginButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String inputType = comboBox.getSelectedItem().toString();
		String inputName = userName.getText().toString();
		String inputPassword = new String(userPassword.getPassword());	
		 
		if(e.getSource()==LoginButton){
			if(inputType=="前台管理员"){
				
				if(isCorrect(inputName,inputPassword)){
					System.out.print("登陆成功！");
					ManageWindow mframe = new ManageWindow();
					mframe.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(mframe,"用户名或密码错误！");
				}

			}else if(inputType =="系统管理员"){
				if(isCorrect(inputName,inputPassword)){
					System.out.print("系统管理员登陆成功！");
					AdminWindow aframe = new AdminWindow();
					aframe.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(mframe,"用户名或密码错误！");
				}
				
			}
		}
	
	}
	public boolean isCorrect(String inputName,String inputPassword){
    
		try {
			boolean flag =true;
		    String sql = "Select mName,mPassword from Manager";
		    Connection dbConn = DBconn.getConn();
			Statement stat  =dbConn.createStatement();
		    ResultSet rs = stat.executeQuery(sql);
		    while(rs.next()&& flag){
		    	if(inputName.equals(rs.getString("mName"))){
		    		System.out.println(inputPassword);
		    		if(inputPassword.equals(rs.getString("mPassword") )){
			    		flag = false;
		    		}
		    	}
			}
		    dbConn.close();
		    
		    return (!flag);
		} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return false;
		}
	}
}
