package com.hotel.struts1.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.hibernate.*;

public class SerchRoomServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("GBK");
	    response.setContentType("text/html;charset=GBK");
	    RoomDAO roomtypedao = new RoomDAO();
	    List <Room> roomlist =null;
	    try{
	    	 roomlist = roomtypedao.findAll();
	 	}catch (Exception ex){
	 		ex.printStackTrace();
	 	}
	     if(roomlist!=null){
	    	 request.setAttribute("roomlist", roomlist);
	     }
//	     synchronized (this) {
//	    	 out.print("akdhkl");
//			
//		}
	     request.getRequestDispatcher("/jsp/roomlist.jsp").forward(request, response);

	}

}
