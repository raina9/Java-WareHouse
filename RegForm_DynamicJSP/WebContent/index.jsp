<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dynamic Registration Page</title>
</head>
<body>
<% 
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/First","root","Shivendr@786");
PreparedStatement pst = con.prepareStatement("select * from qualification");
ResultSet rs=pst.executeQuery();
%>
<form action = "./reg.jsp">
<pre>
ID:<input type="text" name="id"/>
NAME:<input type="text" name="name"/>
ADDRESS:<input type ="text" name="address"/>
QUAL:<select name = "qual">
      <%
      while(rs.next()){
      %>
     <option value="<%=rs.getString(2)%>"><%=rs.getString(2)%></option>
     <% 
      }
     %>
</select>
</pre>
</form>
<%
rs.close();
con.close();
%>
</body>
</html>