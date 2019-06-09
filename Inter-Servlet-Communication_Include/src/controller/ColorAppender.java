package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ColorAppender
 */
@WebServlet("/hello")
public class ColorAppender extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = res.getWriter();
		// by passing url pattern
		// RequestDispatcher rd = req.getRequestDispatcher("next");

		// by passing class name
		RequestDispatcher rd = getServletContext().getNamedDispatcher("HelloServlet");
		out.println("<body style = 'background-color:red;'>");
		rd.include(req, res);
		out.println("</body>");
	}

}
