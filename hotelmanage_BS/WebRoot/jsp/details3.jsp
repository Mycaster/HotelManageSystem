<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="lightbox.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
.STYLE2 {font-size: 18px}
-->
</style>
</head>

<body>
<div id="wrap">

       <div class="header">
       		<div class="logo"><a href="file:///E|/软件/tomcat6/webapps/index.html"></a></div>            
        <div id="menu">
            <ul>                                                                       
            <li class="selected"><a href="index.jsp">&#39318;&#39029;</a></li>
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
        	<div class="crumb_nav">
            <a href="index.jsp">首页</a> &gt;&gt;房间信息           </div>
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" width="26" height="25" title="" /></span>精品好房</div>
        
        	<div class="feat_prod_box_details">
            
            	<div class="prod_img"><a href="details3.jsp"><img src="images/shuangren.jpg" alt=""  border="0" title="" /></a>
                <br />
                <br />
                <a href="images/big_pic.jpg" rel="lightbox"><img src="images/zoom.gif" alt="" title="" border="0" /></a>
              </div>
                
                <div class="prod_det_box">
                	<div class="box_top"></div>
                    <div class="box_center">
                    <div class="prod_title">Details</div>
                    <p class="details"><div class="price"><strong>PRICE:</strong> <span class="red">100 $</span></div>
                    <div class="price"><strong>COLORS:</strong> 
                    <span class="colors"><img src="images/color1.gif" alt="" title="" border="0" /></span>
                    <span class="colors"><img src="images/color2.gif" alt="" title="" border="0" /></span>
                    <span class="colors"><img src="images/color3.gif" alt="" title="" border="0" /></span>                    </div>
                    <form id="form1" name="form1" method="post" action="cart.jsp">
                                    <div align="right">
                                      <input type="submit" name="1" value="&#21152;&#20837;&#36141;&#29289;&#36710;" />
                      </div>
                    </form>
                    <div class="clear"></div>
                    </div>
                    
                    <div class="box_bottom"></div>
                </div>    
            <div class="clear"></div>
            </div>	
            
              
            <div id="demo" class="demolayout">

                <ul id="demo-nav" class="demolayout">
                
                </ul>
    
           

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
</html>
