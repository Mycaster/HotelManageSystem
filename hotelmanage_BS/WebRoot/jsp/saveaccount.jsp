<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
</head>

<body>
<%
request.setCharacterEncoding("gb2312");
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
%>

</body>
</html>
