<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Tables</title>
</head>
<body>
<table border = "5">
<tr><th>NUMBER:</th><th>VALUE:</th></tr>
<%
for(int i=0;i<10;i++){
%>
<tr><td>NUMBER=</td><td><%=i+1%></td></tr>
<%
} 
%>
</table>
</body>
</html> 