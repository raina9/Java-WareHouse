package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/next")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
     	{
     	PrintWriter out = res.getWriter();
		// TODO Auto-generated method stub
	    String name=req.getParameter("name");
	    System.out.println("Next Servlet Execution");
        out.println("Hello...Mr."+name);
        
     	}
}
