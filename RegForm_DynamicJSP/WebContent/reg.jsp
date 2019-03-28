<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%
int id         = Integer.parseInt(request.getParameter("id"));
String name    = request.getParameter("name"); 
String email   = request.getParameter("email");
String address = request.getParameter("address");
String qual    = request.getParameter("qual  ");

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/First","root","Shivendr@786");
PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?,?,?)");
pst.setInt(1, id);
pst.setString(2, name);
pst.setString(3,email);
pst.setString(4,address);
pst.setString(5,qual);
int i = pst.executeUpdate();
con.close();
pst.close();
if(i!=0)
out.println("Registration success :)");
else
out.println("Registration fail:(");
%>