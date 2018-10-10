import javax.servlet.*;
import java.io.*;
public class HelloWorld implements Servlet
{
public void init(ServletConfig sc)throws ServletException
{
//initialisation code
}
public ServletConfig getServletConfig()
{
return null;
}
public void service(ServletRequest req,ServletResponse res) throws IOException
{
//read data
//generate output
//send output
String name=req.getParameter("p1");
PrintWriter out = res.getWriter();
out.println("Hello..."+name); 
}
public String getServletInfo()
{
return null;
}
public void destroy()
{
//do Clean Up
}
}