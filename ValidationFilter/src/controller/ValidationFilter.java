package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/stdreg")
public class ValidationFilter implements Filter {
	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		String value = fConfig.getInitParameter("key");
		System.out.println(value);
	}
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
	   PrintWriter out = response.getWriter();
	   // TODO Auto-generated method stub
		// place your code here
      String name=request.getParameter("name");
      String email=request.getParameter("email");
      int marks=0;
      try {
    	  marks = Integer.parseInt(request.getParameter("marks"));
      }
      catch(Exception e)
      {}
      if(name.equals(""))
      {
    	  out.println("name is required");
      }
      if(email.equals(""))
      {
    	  out.println("email is required");
      }
      if(marks==0)
      {
    	  out.println("marks is required");
      }
		// pass the request along the filter chain
       else	{
             //we want to customize output
             //we can write html here 
             out.println("<div style = 'border-style:dashed;border-color:red;color:blue;font-size:30;' >");
             out.println("<pre>");
             chain.doFilter(request, response);
             out.println("<pre>");
             out.println("<div>");
       }
       }
   public void destroy() {
		// TODO Auto-generated method stub
	 System.out.println("filter destroy");
   }
	

}
