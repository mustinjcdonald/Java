package class22;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import uca.mis3339.OracleWrapper;

public class UserReportHTMLAdvanced extends HttpServlet {
	
	private static final long serialVersionUID = 7L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		try {
			List<Account> allAccounts = new ArrayList();
			OracleWrapper.prepareStatement("SELECT fname, lname, email FROM USERS");
			ResultSet rs = OracleWrapper.queryDB();
	        while (rs.next()) {
	        	allAccounts.add(new Account(rs.getString(1), rs.getString(2), rs.getString(3)));
	        } // end while
	        out.println("<html><head><title>User Report</title></head><body>");
	        out.println("<table border=\"0\" cellpadding=\"5\">");
	        for (Account eachOne: allAccounts) {
	        	out.println(eachOne.toHTML());
	        } // end for
	        out.println("</table></body></html>");
		} catch (SQLException e) {
        	System.out.println(e.getMessage());
        	e.printStackTrace();
		} // end catch
	} // end doGet

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// do nothing
	} // end doPost
} // end UserReportHTMLAdvanced