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

public class UserReportJSONBasic extends HttpServlet {
	
	private static final long serialVersionUID = 5L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
        PrintWriter out = response.getWriter();
		try {
			OracleWrapper.prepareStatement("SELECT fname, lname, email FROM USERS");
			ResultSet rs = OracleWrapper.queryDB();
	        out.println("{\"accounts\":[");				
			boolean hasNext = rs.next(); // needed to add comma between records
	        while (hasNext) {
				out.println("{\"fname\":\"" + rs.getString(1) + "\",");
				out.println("\"lname\":\"" + rs.getString(2) + "\",");
				out.println("\"email\":\"" + rs.getString(3) + "\"}");
				hasNext = rs.next(); // needed to add comma between records
				if (hasNext) { // needed to add comma between records
					out.print(","); // needed to add comma between records
				} // end if
			} // end while
			out.println("]}");
        } catch (SQLException e) {
        	System.out.println(e.getMessage());
        	e.printStackTrace();
		} // end catch
	} // end doGet

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// do nothing
	} // end doPost
} // end UserReportJSONBasic