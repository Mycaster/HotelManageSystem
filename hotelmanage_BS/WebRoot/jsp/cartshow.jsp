<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="wrap">

       <div class="header">
       		<div class="logo"><a href="../index.html"></a></div>            
        <div id="menu">
            <ul>                                                                       
            <li><a href="index.jsp">&#39318;&#39029;</a></li>
            <li></li>
            <li><a href="category.jsp">&#20070;&#31821;</a></li>
            <li></li>
            <li><a href="myaccount.jsp">&#25105;&#30340;&#36134;&#25143;</a></li>
            <li><a href="register.jsp">&#27880;&#20876;</a></li>
			<li><a href="customer.jsp"><%=session.getAttribute("id")%></a></li>
            <li></li>
            <li></li>
            </ul>
        </div>                
       </div> 
       
       
       <div class="center_content">
       	<div class="left_content">
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>&#25105;&#30340;&#36141;&#29289;&#36710;</div>
        
       	  <div class="feat_prod_box_details">
                
        	     <table width="597" class="cart_table">
            	<tr class="cart_title">
                	<td width="74">&nbsp;</td>
                	<td width="85">&#21517;&#31216;</td>
                    <td width="56">&#21333;&#20215;</td>
                    <td width="141">日期</td>
                    <td width="141">&#21512;&#35745;</td>               
                </tr>
                	<td><a href="details1.jsp"><img src="images/biaozhun.jpg" alt="" title="" border="0" class="cart_thumb" width="85" height="58"/></a></td>
                	<td>标准间</td>
                    <td>128</td>
                    <td>11.11-11.12</td>
                    <td>128</td>
                    <td></td>               
              </tr>          
                 

                <tr>
                <td colspan="4" class="cart_total"><span class="red"><br /></span></td>
                <td>&nbsp;</td>
                <td> <br /></td>                
                </tr>                  
            </table>
            <form id="form1" name="form1" method="post" action="">
              <label>
                
              <div align="center">
                <input type="submit" name="Submit" value="提交" />
              </div>
              </label>
            </form>
          <a href="#" class="checkout">&#25552;&#20132; &gt;</a>		  </div>	
         <div class="clear"></div>
        </div><!--end of left content-->
        
        <div class="right_content">
          <div class="title"><span class="title_icon"><img src="images/bullet3.gif" alt="" title="" /></span>关于旅店</div> 
             <div class="about">
             <p>
             <img src="images/about.gif" alt="" title="" class="right" /></p></div><div class="right_box"><p style="margin: 0px; padding: 5px 0px; text-align: justify; line-height: 19px; color: rgb(0, 0, 0); font-family: Arial,Helvetica,sans-serif; font-size: 12px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; text-indent: 0px; text-transform: none; white-space: normal; word-spacing: 0px; background-color: rgb(255, 255, 255);">&nbsp;欢迎来到舒适旅店</p><p style="margin: 0px; padding: 5px 0px; text-align: justify; line-height: 19px; color: rgb(0, 0, 0); font-family: Arial,Helvetica,sans-serif; font-size: 12px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; text-indent: 0px; text-transform: none; white-space: normal; word-spacing: 0px; background-color: rgb(255, 255, 255);">&nbsp;本店竭诚为您提供最舒适的服务</p><div class="new_prod_box"> 
                        <a href="../details.html"></a><br /></div>               
             
             </div>
             
             <div class="right_box">
             
             	<div class="title"><span class="title_icon"></span></div><br /></div>         
             
        
        </div><!--end of right content-->
        
        
       
       
       <div class="clear"></div>
       </div><!--end of center content-->
</div>
</body>
</html>
