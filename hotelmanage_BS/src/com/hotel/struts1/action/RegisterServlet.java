package com.hotel.struts1.action;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.hibernate.*;
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn=null;
		Statement stmt=null;
		try{
		Class.forName("org.gjt.mm.mysql.Driver");
		}catch(ClassNotFoundException e){
		out.println("加载驱动器类时出现异常");
		}
		try{
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","husong");
		stmt=conn.createStatement();
		PreparedStatement pstmtInsert=conn.prepareStatement(
		"INSERT INTO customer(cname,cpassword,cmail,cmobile,caddress) VALUES(?,?,?,?,?)");
		pstmtInsert.setString(1,cName);
		pstmtInsert.setString(2,cPass);
		pstmtInsert.setString(3,cMail);
		pstmtInsert.setString(4,cMobile);
		pstmtInsert.setString(5,cAddress);
		pstmtInsert.executeUpdate();
		pstmtInsert.close();
		stmt.close();
		out.print("注册成功！");
		response.sendRedirect("myaccount.jsp");
		}catch(SQLException e){out.println("出现异常");}
		finally{
		try{if(conn!=null) conn.close();}catch(SQLException e){out.println("出现关闭异常");}
		}
		
		
		request.setCharacterEncoding("GBK");
	    response.setContentType("text/html;charset=GBK");
	    String cName = null;
		cName=request.getParameter("cname");
		String cPass=null;
		cPass = request.getParameter("cpassword");
		String cMail = null;
		cMail=request.getParameter("cmail");
		String cMobile=null;
		cMobile = request.getParameter("cmobile");
		String cAddress = null;
		cAddress=request.getParameter("caddress");
	    RoomDAO roomdao = new RoomDAO();
	    List <RoomDAO> roomlist =null;
	    try{
	    	if(byprice!=null&&byprice.length()>0){
	    		roomlist = roomdao.findByPrice(Integer.parseInt(byprice));
	    	}
	    	//System.out.print(byname);    	
	    	//roomlist = roomdao.findAll();
	    	for(int i=0;i<=roomlist.size();i++){
	    		System.out.print(roomlist.get(i+1));
	    	}
	    	System.out.print(roomlist);
	 	}catch (Exception ex){
	 		ex.printStackTrace();
	 	}
	     if(roomlist!=null){
	    	 request.setAttribute("roomlist", roomlist);
	     }
	     request.getRequestDispatcher("/jsp/searchend.jsp").forward(request, response);
	}
}
