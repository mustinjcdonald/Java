package class22;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import uca.mis3339.OracleWrapper;

public class UserRegistration extends HttpServlet {
	
	private static final long serialVersionUID = 4L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Demonstration servlet</title></head><body>");
        out.println("<form action=\"/registration\" method=\"post\">");
        out.println("<table border=\"0\" cellpadding=\"5\">");
        out.println("<tr><td>First Name:</td><td><input type=\"textbox\" name=\"fname\"></td></tr>");
        out.println("<tr><td>Last Name:</td><td><input type=\"textbox\" name=\"lname\"></td></tr>");
        out.println("<tr><td>Email:</td><td><input type=\"textbox\" name=\"email\"></td></tr>");
        out.println("<tr><td colspan=\"2\"><input type=\"submit\" value=\"Register\"></td></tr>");
        out.println("</table>");
        out.println("</form>");
        out.println("</body></html>");
	} // end doGet

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String email = request.getParameter("email");
			OracleWrapper.prepareStatement("INSERT INTO USERS (fname, lname, email) VALUES (?,?,?)", fname, lname, email);
			OracleWrapper.updateDB();					
        } catch (SQLException e) {
        	System.out.println(e.getMessage());
		} // end catch
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><title>Registration Successful!</title>");
        out.println("<h1>Registration Successful!</h1>");
        out.println("</body></html>");
    } // end doPost
} // end UserRegistration