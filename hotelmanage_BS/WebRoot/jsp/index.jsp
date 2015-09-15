<%@ page contentType="text/html;charset = utf-8" language="java" pageEncoding="UTF-8" errorPage="" %>
<%@ page import ="com.hotel.hibernate.*,java.util.List ,java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>首页</title>
<style type="text/css">
<!--
body {
	background-color: #666666;
}
-->
</style>
<link href="<%=basePath%>jsp/style.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
.STYLE2 {font-size: 18px}
.STYLE3 {color: #000000}
-->
</style>
</head>

<body>
<div id="wrap">
  <div class="header">
    <div class="logo"><a href="../index.html"></a></div>
    <div id="menu">
      <ul>
        <li class="selected"><a href="index.jsp">首页</a></li>
        <li>
          <div align="right"></div>
        </li>
        <li><a href="myaccount.jsp">我的账户</a></li>
        <li><a href="register.jsp">注册</a></li>
		<li><a href="customer.jsp"><%=session.getAttribute("userNickname")%></a></li>
	  </ul>
    </div>

  </div>
  <div class="center_content">
    <div class="left_content">
      <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="bullet1" title="" />精品好房</span></div>
      <div class="feat_prod_box">
        <div class="prod_img"><a href="details1.jsp"><img src="images/biaozhun.jpg" alt="prod1" title="" border="0" /></a></div>
        <div class="prod_det_box">
          <div class="box_top"></div>
          <div class="box_center">
            <div class="prod_title">标准间 </div>
            <p class="details">&nbsp;</p>
            <a href="details1.jsp" class="more">- more details -</a>
            <div class="clear"></div>
          </div>
          <div class="box_bottom"></div>
        </div>
        <div class="clear"></div>
      </div>
      <div class="feat_prod_box">
        <div class="prod_img"><a href="details2.jsp"><img src="images/shangwu.jpg" alt="prod2" title="" border="0" /></a></div>
        <div class="prod_det_box">
          <div class="box_top"></div>
          <div class="box_center">
            <div class="prod_title">商务间</div>
            <p class="details">&nbsp;</p>
            <a href="details2.jsp" class="more">- more details -</a>
            <div class="clear"></div>
          </div>
          <div class="box_bottom"></div>
        </div>
        <div class="clear"></div>
      </div>
     <div class="feat_prod_box">
        <div class="prod_img"><a href="details3.jsp"><img src="images/haijing.jpg" alt="prod2" title="" border="0" /></a></div>
        <div class="prod_det_box">
          <div class="box_top"></div>
          <div class="box_center">
            <div class="prod_title">豪华海景房</div>
            <p class="details">&nbsp;</p>
            <a href="details.jsp" class="more">- more details -</a>
            <div class="clear"></div>
          </div>
          <div class="box_bottom"></div>
        </div>
        <div class="clear"></div>
      </div>
           <div class="feat_prod_box">
        <div class="prod_img"><a href="details4.jsp"><img src="images/shuangren.jpg" alt="prod2" title="" border="0" /></a></div>
        <div class="prod_det_box">
          <div class="box_top"></div>
          <div class="box_center">
            <div class="prod_title">豪华双人间</div>
            <p class="details">&nbsp;</p>
            <a href="details.jsp" class="more">- more details -</a>
            <div class="clear"></div>
          </div>
          <div class="box_bottom"></div>
        </div>
        <div class="clear"></div>
      </div>
      <div class="clear"></div>
    </div>
    <form action="AddRoomServlet" method="post">
        <table>
           <tr align = "center" valign="middle"></tr>
              <td>
                 <TABLE style = "height:200;width :492" cellSpacing = 0 cellPadding = 0
                        border= 0 align = "center">
                 <TBODY>
                 <TR valign="middle">
                    <td class "titlt_td" height =12 colspan = "3"></td>
                 
                 </TR>
                 <tr></tr>
                            </TBODY>
                </TABLE>
              </td>
        </table>
  </form>
<li><a href="roomlist.jsp">Get More</a></li>
    
    <!--end of left content-->
    <div class="right_content">
          <div class="cart">
            <div class="title"><span class="title_icon"><img src="images/cart.gif" alt="" title="" /></span><a href="cartshow.jsp">我的购物车</a></div>
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
  </div>
  <!--end of center content-->
</div>




</body>
</html>
