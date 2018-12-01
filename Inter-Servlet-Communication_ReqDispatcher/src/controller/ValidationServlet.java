package controller;
/*
 * url-pattern = /reg
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Address;

public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
       
		PrintWriter out = res.getWriter();
		
		String name  = req.getParameter("name");
        String email = req.getParameter("email");
        String address=req.getParameter("address");
        
        boolean b = false;
        
        if(name.equals(""))
        {
        	out.println("name is required");
            b=false;
        }
        if(email.equals(""))
        {
        	out.println("email is required");
            b=false;
        }
        if(address.equals(""))
        {
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
        /*
         * from here we need to call next servlet
         * ---------------------------------------
         * getServlet method is deprecated
        *RegistrationServlet servlet = (RegistrationServlet)getServletContext().getServlet("controller.RegistrationServlet");
        */
        RequestDispatcher rd=req.getRequestDispatcher("/next");	
        rd.forward(req,res);
        }
        else {}
	}
}
