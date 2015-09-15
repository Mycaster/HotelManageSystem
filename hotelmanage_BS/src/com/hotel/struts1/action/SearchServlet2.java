package com.hotel.struts1.action;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.hibernate.*;
public class SearchServlet2 extends HttpServlet{

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
		request.setCharacterEncoding("GBK");
	    response.setContentType("text/html;charset=GBK");
	    String bytime = request.getParameter("bytime");
	    String byname = request.getParameter("byname");
	    String byprice = request.getParameter("byprice");
	    RoomDAO roomdao = new RoomDAO();
	    System.out.println("byprice:"+byprice);
	    List <RoomDAO> roomlist =null;
	    try{
	    	if(byprice!=null&&byprice.length()>0){
	    		roomlist = roomdao.findByPrice(Integer.parseInt(byprice));
	    	}else if(byprice==null&&byname!=null){
	    	//	roomlist = roomdao.findById(byname).getRoomType();
	    	}
	    	//System.out.print(byname);    	
	    	//roomlist = roomdao.findAll();
//	    	for(int i=0;i<=roomlist.size();i++){
//	    		System.out.print(roomlist.get(i+1));
//	    	}
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
