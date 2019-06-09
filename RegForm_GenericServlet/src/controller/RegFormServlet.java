package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegFormServlet extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String address = req.getParameter("address");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/avengers", "root",
					"Shivendr@786");
			PreparedStatement pst = con.prepareStatement("insert into StudentDetail values(?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setString(4, address);
			int i = pst.executeUpdate();
			if (i != 0) {
				out.println("<font color='Blue'><h1>Reg Success:)</h1></font>");
			} else
				out.println("<font color='Red'><h1>Reg Fail(:</h1></font>");
		} catch (Exception e) {
			out.println("<font color='Red'><h1>" + e.getMessage() + "(:</h1></font>");
			e.printStackTrace();
		}
	}
}
