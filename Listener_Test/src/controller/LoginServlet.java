package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		session.setAttribute("username", name);
		session.setAttribute("password", password);
		out.println("<html>");
		out.println("<body>");
		out.println("Login Success");
		out.println("<a href = './logout'>logout</a>");
		out.println("</body>");
		out.println("</html>");

	}

}
