package controller;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class StudentRegServlet extends GenericServlet {
	private Connection con;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		ServletContext scxt = config.getServletContext();
		String driver = scxt.getInitParameter("driver");
		String url = scxt.getInitParameter("url");

		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		System.out.println("student user = " + username);
		System.out.println("student password = " + password);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Shivendr@786");
		} catch (Exception e) {
			e.getMessage();
		}
		super.init(config);
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = res.getWriter();
		int id = Integer.parseInt(req.getParameter("ID"));
		String name = req.getParameter("NAME");
		String email = req.getParameter("EMAIL");

		try {
			PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");

			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, email);

			int i = pst.executeUpdate();

			if (i != 0) {
				out.println("student Reg success :)");
			}

			else
				out.println("student Reg fail :<");
		}

		catch (Exception e) {
			out.println("exception aya :<" + e.getMessage());
			e.printStackTrace();
		}
	}

	public void destroy() {
		// TODO Auto-generated method stub
		try {
			con.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
