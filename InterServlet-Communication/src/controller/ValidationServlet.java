package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       PrintWriter out = res.getWriter();
	   
	    String name=req.getParameter("NAME");
        String email=req.getParameter("EMAIL");
        String address=req.getParameter("ADDRESS");
        
        boolean b = false;
        
        if(name.equals("")) {
        	out.println("name is required");
        	b=false;
        }
        if(email.equals("")){
        	out.println("email is required");
            b=false;
        }
        if(address.equals("")) {
        	out.println("address is required");
            b=false;
        }
        else
        {
        	b=true;
        }
        if(b==true)
        {
           System.out.println("Forward to Next");
        	// --> from here we need to call next servlet
        	/*
        	 * getServlet() is deprcated so its no longer supported
        	 * getServletContext().getServlet(arg0);
             */
        
        	RegistrationServlet servlet = (RegistrationServlet)getServletContext().getServlet("controller.RegistrationServlet");
            servlet.doGet(req, res);
        }
        else
    	super.doGet(req, res);
    }

}
