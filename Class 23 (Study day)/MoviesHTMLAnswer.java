package class23;

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

public class MoviesHTMLAnswer extends HttpServlet {
	
	private static final long serialVersionUID = 8L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		try {
			List<MovieAnswer> allMovies = new ArrayList();
			OracleWrapper.prepareStatement("SELECT TITLE, YEAR, ROTTENTOMATOESCRITIC, ROTTENTOMATOESAUDIENCE FROM MOVIES");
			ResultSet rs = OracleWrapper.queryDB();
	        while (rs.next()) {
	        	allMovies.add(new MovieAnswer(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4)));
	        } // end while
	        out.println("<html><head><title>User Report</title></head><body>");
	        out.println("<table border=\"1\" cellpadding=\"5\">");
	        for (MovieAnswer eachOne: allMovies) {
	        	out.println(eachOne.toHTML());
	        } // end for
	        out.println("</table></body></html>");
	        rs.close();
		} catch (SQLException e) {
        	System.out.println(e.getMessage());
        	e.printStackTrace();
		} // end catch
	} // end doGet

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// do nothing
	} // end doPost
} // end MoviesHTMLAnswer