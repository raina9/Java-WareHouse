package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name    = req.getParameter("name");
	    String email   = req.getParameter("email");
	    String address = req.getParameter("address");
	  
	  System.out.println(name);
	  System.out.println(email);
	  System.out.println(address);
	  
	  res.getWriter().println("success");
	}

}
