<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri = "/WEB-INF/struts-html.tld" prefix = "html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title>Book Store</title>
<link rel="stylesheet" type="text/css" href="style.css" />
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
            <li class="selected"><a href="myaccount.jsp">&#25105;&#30340;&#36134;&#25143;</a></li>
            <li><a href="register.jsp">&#27880;&#20876;</a></li>
			<li><a href="customer.jsp"><%=session.getAttribute("id")%></a></li>
            <li></li>
            <li></li>
            </ul>
        </div>     
            
            
       </div> 
       
       
       <div class="center_content">
       	<div class="left_content">
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>&#25105;&#30340;&#36134;&#25143;</div>
		<div class="clear">
        	  <form id="form1" name="form1" method="post" action="logout.jsp">
        	    <label></label>
      	        <div align="right">
      	          <input type="submit" name="Submit" value="&#30331;&#20986;"  />
   	              </div>
        	  </form>

        	  
<%
request.setCharacterEncoding("utf-8");
String cName = null;
cName = (String)session.getAttribute("id");
try{
Class.forName("org.gjt.mm.mysql.Driver");
}catch(ClassNotFoundException e){
out.println("!!");
}

Connection conn=null;
Statement stmt=null;
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","husong");
stmt=conn.createStatement();
String cus="select * from customer where cname like '%"+cName+"%';";
ResultSet rs=stmt.executeQuery(cus);
String cname = null;
String cmail = null;
String cmobile = null;
String caddress = null;
while(rs.next()){
 cname=rs.getString(1);
 cmail=rs.getString(3);
 cmobile=rs.getString(4);
 caddress=rs.getString(5);
  }
stmt.close();


%>
        	  <table width="388" border="1">
                <tr>
                  <th width="46" height="55" scope="row">&#22995;&#21517;</th>
                  <th width="326" scope="row"><%=cname%></th>
                </tr>
                <tr>
                  <th scope="row">&#37038;&#20214;</th>
                  <th height="49" scope="row">cmail</th>
                </tr>
                <tr>
                  <th height="52" scope="row">&#25163;&#26426;</th>
                  <th scope="row"><%=cmobile%></th>
                </tr>
                <tr>
                  <th height="88" scope="row">&#22320;&#22336;</th>
                  <th scope="row"><%=caddress%></th>
                </tr>
              </table>
        	</div>
        </div><!--end of left content--><!--end of right content-->
<div class="clear"></div>
       </div><!--end of center content-->
</div>
</body>
</html>
