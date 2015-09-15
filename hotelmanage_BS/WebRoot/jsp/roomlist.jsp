<%@ page language="java" import="java.util.List,com.hotel.hibernate.*,com.hotel.struts1.action.*" pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
<link href="<%=basePath%>jsp/style.css" rel="stylesheet" type="text/css" />
</head>

 <body scroll ="no" >
  
  <%
     List <Room> roomlist = (List<Room>)request.getAttribute("roomlist");
     if(roomlist==null){
  %>
  <jsp:forward page = "/SerchRoomServlet"></jsp:forward>
  <%
  }
  %>
  
<div id="wrap">
<script language="javascript">
   function select(){
     document.search.submit();
   }
</script>
       <div class="header">
       		<div class="logo"><a href="file:///E|/软件/tomcat6/webapps/index.html"></a></div>            
        <div id="menu">
            <ul>                                                                       
            <li><a href="index.jsp">&#39318;&#39029;</a></li>
            <li></li>
           
            <li></li>
            <li><a href="myaccount.jsp">&#25105;&#30340;&#36134;&#25143;</a></li>
            <li><a href="register.jsp">&#27880;&#20876;</a></li>
			<li><a href="customer.jsp"><%=session.getAttribute("userNickname")%></a></li>
            <li></li>
            <li></li>
            </ul>
        </div>                
       </div> 

       <div class="center_content">
       	<div class="left_content">
            <div class="title"></div>
<form  name="search" method="post" action="/hotelmanage1/SearchServlet2">
       	      <label></label>
       	      类型：
       	      <label>
       	      <input type="text" name="byname" />
       	      </label>
       	      <p>价格：   	          
       	        <label>
       	        <input type="text" name="byprice" />
       	        </label>
       	      </p>
       	      <p>时间： 
       	        <label>
       	        <input type="text" name="bytime" />
       	        </label>
       	        <label>
       	        <input type="submit" name="Submit2" value="提交" />
       	        </label>
       	      </p>
       	      <p>&nbsp; </p>
       	    </form>
   <div class="feat_prod_box_details">
       	    <table width="472" class="cart_table">
            	<tr class="cart_title">
                	<td width="78"></td>
                	<td width="93">房型</td>
                    <td width="72">单价</td>
                                   
                </tr>
  <%  String lujing =null;
      for(int i=0;i<roomlist.size();i++){
         Room room = roomlist.get(i);
         lujing =("details"+(i+1)+".jsp");
  %>

                <tr>
                	<td><a href="<%=lujing %>"><img src="<%=room.getPictures()%>" alt="" title="" border="0" class="cart_thumb" /></a></td>
                	<td><%=room.getRoomType()%></td>
                    <td><%=room.getPrice()%></td>
                    <td></td>               
              </tr>          
             <%} %>             
            </table>

          <a href="#" class="checkout">&#25552;&#20132; &gt;</a>		  </div>	
         <div class="clear"></div>
        </div><!--end of left content-->
        
        <div class="right_content">
          <div class="cart">
            <div class="title"><span class="title_icon"></span></div>
          </div>
          <div class="title"><span class="title_icon"><img src="images/bullet3.gif" alt="" title="" /></span></span>关于旅店</div> 
             <div class="about">
             <p>
             <img src="images/about.gif" alt="" title="" class="left" /></p>
             <p>欢迎来到舒适旅店</p>
             <p>本店竭诚为您提供最舒适的服务</p>
             <p></p>
             <p></p>
          </div>
             
         </div>
        <!--end of right content-->

       <div class="clear"></div>
       </div><!--end of center content-->
</div>
</body>
</html>
