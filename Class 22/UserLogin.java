package class22;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import uca.mis3339.OracleWrapper;

public class UserLogin extends HttpServlet {
	
	private static final long serialVersionUID = 4L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>User Login</title></head><body>");
        out.println("<form action=\"/login\" method=\"post\">");
        out.println("<table border=\"0\" cellpadding=\"5\">");
        out.println("<tr><td>Email:</td><td><input type=\"textbox\" name=\"email\"></td></tr>");
        out.println("<tr><td colspan=\"2\"><input type=\"submit\" value=\"Login\"></td></tr>");
        out.println("</table>");
        out.println("</form>");
        out.println("</body></html>");
	} // end doGet

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean login = false;
		try {
			String email = request.getParameter("email");
			OracleWrapper.prepareStatement("SELECT fname, lname, email FROM USERS WHERE email = ?", email);
			ResultSet rs = OracleWrapper.queryDB();
			if (rs.next()) { // if no records were returned, then there was no match in the database
				login = true;
			} // end if
        } catch (SQLException e) {
        	System.out.println(e.getMessage());
        	e.printStackTrace();
		} // end catch
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (login) {
            out.println("<html><body><title>Login Successful!</title>");
            out.println("<h1>Login Successful!</h1>");        	
        } else {
            out.println("<html><body><title>Login Unsuccessful!</title>");
            out.println("<h1>Login Unsuccessful!</h1>");        	        	
        } // end else
        out.println("</body></html>");
    } // end doPost
} // end UserRegistration