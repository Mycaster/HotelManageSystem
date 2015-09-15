<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri = "/WEB-INF/struts-html.tld" prefix = "html" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>注册</title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>jsp/style.css" />
</head>
<body>
<div id="wrap">

       <div class="header">
       		<div class="logo"><a href="../index.html"></a></div>            
        <div id="menu">
            <ul>                                                                       
            <li><a href="index.jsp">&#39318;&#39029;</a></li>
            <li></li>
            <li></li>
            <li><a href="myaccount.jsp">&#25105;&#30340;&#36134;&#25143;</a></li>
            <li class="selected"><a href="register.jsp">&#27880;&#20876;</a></li>
			<li><a href="customer.jsp"><%=session.getAttribute("userNickname")%></a></li>
            <li></li>
            <li></li>
            </ul>
        </div>     
            
            
       </div> 
       
       
       <div class="center_content">
       	<div class="left_content">
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>&#27880;&#20876;</div>
        
        	<div class="feat_prod_box_details">
            <p class="details">&nbsp;</p>
            
              	<div class="contact_form">
                <div class="form_subtitle">&#21019;&#24314;&#26032;&#30340;&#36134;&#25143;</div>
               <% if(request.getAttribute("errMessage")!= null) {%>
	    <script>
	         alert('<%=request.getAttribute("errMessage")%>');
	    </script> 
	<% } %>               
                <form  name="register" method="post" action="/hotelmanage1/RegisterServlet">             
                    <div class="form_row">
                    <label class="contact"><strong>昵称 :</strong></label>
                    <input type="text" class="contact_input" name ="cnickname"/>
                    </div>  
                    <div class="form_row">
                    <label class="contact"><strong>验证邮箱:</strong></label>
                    <input type="text" class="contact_input" name = "cemail"/>
                    </div>

                    <div class="form_row">
                    <label class="contact"><strong>真实姓名 :</strong></label>
                    <input type="text" class="contact_input" name ="cname"/>
                    </div> 
                    
                    <div class="form_row">
                    <label class="contact"><strong>密码 :</strong></label>
                    <input type="text" class="contact_input" name = "cpassword"/>
                    </div> 
 
                    <div class="form_row">
                    <label class="contact"><strong>联系电话 :</strong></label>
                    <input type="text" class="contact_input" name = "cphone"/>
                    </div>

                    <div class="form_row">
                    <label class="contact"><strong>联系地址 :</strong></label>
                    <input type="text" class="contact_input" name = "caddress"/>
                    </div>
                    
                    <div class="form_row">
                    <label class="contact"><strong>性别:</strong></label>
                    <input type="text" class="contact_input" name = "csex"/>
                    </div>                    

                    <div class="form_row">
                    <label class="contact"><strong>身份证 :</strong></label>
                    <input type="text" class="contact_input" name = "cverifyID"/>
                    </div>
                    
                    <div class="form_row">
                      <div class="terms">

                        <label>
                        
                        <div align="right">
                             <html:submit> 注册 </html:submit>
                          </div>
                        </label>
                        </div>
                    </div> 
                    <div class="form_row"></div> 
                      <html:errors property="errorUserInfo" />
                  </form>     
                </div>  
            
          </div>	
         <div class="clear"></div>
        </div><!--end of left content-->
        
        <div class="right_content">
          <div class="cart">
                  <div class="title"><span class="title_icon"><img src="images/cart.gif" alt="" title="" /></span><a href="../cart.html">&#25105;&#30340;&#36141;&#29289;&#36710;</a></div>
          </div>
          <div class="title"><span class="title_icon"><img src="images/bullet3.gif" alt="" title="" /></span>关于旅店</div> 
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
