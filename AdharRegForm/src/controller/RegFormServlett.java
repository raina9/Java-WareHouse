package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegFormServlett extends HttpServlet {
		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs = req.getSession();
        PrintWriter out = res.getWriter();
		String fno=req.getParameter("fno");
        if(fno.equals("1")) {
        String name = req.getParameter("name");
        String fname=req.getParameter("fname");
        String mname=req.getParameter("mname");
        
        hs.setAttribute("name", name);
        hs.setAttribute("fname",fname);
        hs.setAttribute("mname", mname);
        
        res.sendRedirect("./form2.html");    
        }
        if(fno.equals("2"))
        {
        	String contact = req.getParameter("contact");
        	String email   = req.getParameter("email");
        	String address = req.getParameter("address");
            
        	hs.setAttribute("contact", contact);
            hs.setAttribute("email", email);
            hs.setAttribute("address", address);
            
           res.sendRedirect("./form3.html");
        }
        if(fno.equals("3"))
        {
        	String qual=req.getParameter("qual");
        	String per=req.getParameter("per");
           
        	String name=(String)hs.getAttribute("name");
        	String fname=(String)hs.getAttribute("fname");
            String mname=(String)hs.getAttribute("mname");
            
            String contact=(String)hs.getAttribute("contact");
            String email=(String)hs.getAttribute("email");
            String address=(String)hs.getAttribute("address");
        
           try {
        	   Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/avengers","root","Shivendr@786");
              PreparedStatement pst=con.prepareStatement("insert into adharreg values(?,?,?,?,?,?,?,?)");
              
              pst.setString(1,name);
              pst.setString(2,fname);
              pst.setString(3,mname);
              pst.setString(4,contact);
              pst.setString(5,email);
              pst.setString(6,address);
              pst.setString(7,qual);
              pst.setString(8,per);
               
              int i=pst.executeUpdate();
              
              if(i!=0) {
            	  out.println("<pre>");
            	  out.println("NAME="+name);
            	  out.println("FNAME="+fname);
            	  out.println("MNAME="+mname);
            	  out.println("CONTACT"+contact);
            	  out.println("EMAIL"+email);
            	  out.println("ADDRESS"+address);
            	  out.println("QUAL"+qual);
            	  out.println("PER"+per);
            	  out.println("</pre>");
            	  }
              else {
            	  out.println("Reg Failed (:");
              }
           
           }
           catch(Exception e) {
        	   out.println(e.getMessage());
           }
        
        
        }
	 }
}
