<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri = "/WEB-INF/struts-html.tld" prefix = "html" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Hotel Reserve</title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>jsp/style.css" />
</head>
<body>
<div id="wrap">

       <div class="header">
       		<div class="logo"><a href="../index.html"></a></div>            
        <div id="menu">
            <ul>                                                                       
            <li><a href="index.jsp">首页</a></li>
            <li></li>
            <li class="selected"><a href="myaccount.jsp">我的账户</a></li>
            <li><a href="register.jsp">注册</a></li>
			<li><a href="customer.jsp"><%=session.getAttribute("cNickname")%></a></li>
            <li></li>
            <li></li>
            </ul>
        </div>               
       </div> 
       <div class="center_content">
       	<div class="left_content">
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>&#25105;&#30340;&#36134;&#25143;</div>
        	<div class="feat_prod_box_details">
            <p class="details">
                                     登录事项</p>
            <div class="contact_form">
				<div class="form_subtitle">&#30331;&#24405;</div>
					   
				<html:form action ="/login.do" method = "post">       
                    <div class="form_row">
                    <bean:message key="info.input" arg0="用户名" />
                    <label class="contact"><strong>用户名:</strong></label>
                       <html:text property = "cname" /><br>
                       <html:errors property="userNameError"  />
                    </div>  
                    <div class="form_row">
                    <bean:message key="info.input" arg0="密码" />
                    <label class="contact"><strong>密码:</strong></label>
                      <html:password property = "cpassword" /><br>
                      <html:errors property="userPassError"  />
                    
                    </div>          
                   <div class="form_row">
                      <div class="terms">
                        <html:submit> 登录</html:submit>
						<html:errors property="errorUserInfo"  />
					  <div align="right">
  
						</div>
                      </div>
                    </div>           
				</html:form>            
                    <div class="form_row">
                      <label></label>
                    </div>   
                  </form>     
                </div>  
            
            </div>	
       
        <div class="clear"></div>
        </div><!--end of left content-->
        
        <div class="right_content">
          <div class="cart">
            <div class="title"><span class="title_icon"><img src="images/cart.gif" alt="" title="" /></span><a href="cartshow.jsp">&#25105;&#30340;&#36141;&#29289;&#36710;</a></div>
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
</html:html>
