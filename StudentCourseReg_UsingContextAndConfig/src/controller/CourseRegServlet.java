package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CourseRegServlet extends GenericServlet {
   	private Connection con;
	public void init(ServletConfig config)throws ServletException
   	{    
   		ServletContext scxt=config.getServletContext();
   	    String driver=scxt.getInitParameter("driver");
   	    String url=scxt.getInitParameter("url");
   		
   	    String username=config.getInitParameter("username");
   		String password=config.getInitParameter("password");
   		
   		System.out.println("course user = "+username);
   		System.out.println("course password = "+password);
   		
   		try {
   			Class.forName("com.mysql.cj.jdbc.Driver");
   		     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","test","test");
   		    }
   		catch(Exception e) {}
   	    super.init(config);
   	}
   	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
   		PrintWriter out =res.getWriter();
   		int cid = Integer.parseInt(req.getParameter("CID"));
   		String cname=req.getParameter("CNAME");
   		int fee=Integer.parseInt(req.getParameter("FEE"));
	 
   		try {
   	     PreparedStatement pst = con.prepareStatement("insert into course values(?,?,?)");
       	 pst.setInt(1,cid);
       	 pst.setString(2,cname);
       	 pst.setInt(3,fee);
       	 int i=pst.executeUpdate();
       	 if(i!=0) {
       		 out.println("course Reg success :)");
       	 }
       	 else
       		 out.println("course Reg fail :<");
	 }
	 catch(Exception e) {
		 out.println("exception aya :<"+e.getMessage());
		 e.printStackTrace();
		}
	 }
   	
   	@Override
   	public void destroy() {
   		// TODO Auto-generated method stub
   		try {
   			con.close();
   	     	}
   		catch(Exception e) 
   		    {
   			e.getMessage();
   	    	}
   	}

}
