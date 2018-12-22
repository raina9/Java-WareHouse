<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>First JSP</title>
</head>
<body bgcolor = "green">
Today's Date : <% out.println(new java.util.Date());%></br>
Today's Date : <%= new java.util.Date()%>
</body>
</html>