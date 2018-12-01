package controller;
/*
 *url-pattern = /next
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    PrintWriter out = res.getWriter();
	    System.out.println("Next Servlet");
		String name    = req.getParameter("name");
	   String email   = req.getParameter("email");
	   String address = req.getParameter("address");
	   
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/avengers", "root", "Shivendr@786");
	       PreparedStatement pst = con.prepareStatement("insert into stdcom values(?,?,?)");
	       
	       pst.setString(1,name);
	       pst.setString(2,email);
	       pst.setString(3,address);
	       
	       int i=pst.executeUpdate();
	       if(i!=0) 
	       {
	    	   out.println("success");
	       }
	       else
	       {
	    	   out.println("fail");
	       }
	       
	   }
	   catch(Exception e)
	   {
		e.getMessage();
		e.printStackTrace();
	   }
	}

}
