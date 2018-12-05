package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/stdreg")
public class StudentRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    PrintWriter out = res.getWriter();
 		
	    //read data
	    String name = req.getParameter("name");
	    String email= req.getParameter("email");
	    int marks=Integer.parseInt(req.getParameter("marks"));
 	   
	    out.println("NAME="+name);
	    out.println("EMAIL="+email);
	    out.println("MARKS"+marks);
	    
 	}

}
