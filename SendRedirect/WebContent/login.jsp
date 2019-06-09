<%
String uname = request.getParameter("uname");
String pwd = request.getParameter("pwd");
if(uname.equals("shivendra")&&pwd.equals("Shivendr@786"))
{
response.sendRedirect("./success.jsp");
}
else
{
response.sendRedirect("./failure.jsp");
}
%>