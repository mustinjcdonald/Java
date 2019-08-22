package hw6;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import uca.mis3339.OracleWrapper;

public class TextbookReportJSON extends HttpServlet {
	
	private static final long serialVersionUID = 3L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		try {
			
			ArrayList<Textbook> allBooks = new ArrayList();
			
			OracleWrapper.prepareStatement("SELECT * FROM TEXTBOOKS");
			ResultSet rs = OracleWrapper.queryDB();
			
	        while (rs.next()) {
	        	
	                // iterate through the columns in each row
	                	Textbook.TextbookBuilder.setISBN(Integer.valueOf((String) rs.getObject(1)));
	        			Textbook.TextbookBuilder.setPages(Integer.valueOf(String.valueOf(rs.getObject(2))));
	        			Textbook.TextbookBuilder.setYear(Integer.valueOf(String.valueOf(rs.getObject(3))));
	        			Textbook.TextbookBuilder.setEdition(String.valueOf(rs.getObject(4)));
	        			Textbook.TextbookBuilder.setAuthor(String.valueOf(rs.getObject(5)));
	        			Textbook.TextbookBuilder.setTitle(String.valueOf(rs.getObject(6)));
	        			Textbook.TextbookBuilder.setCourse(String.valueOf(rs.getObject(7)));
	                	allBooks.add(Textbook.TextbookBuilder.build());
	        	}
	        
	        rs.close();
	        
	        out.println("{\"textbooks\":[");			
	        
	        for (Textbook eachOne: allBooks) {
	        	out.println(eachOne.toJSON());
	        	
	        	if (allBooks.indexOf(eachOne) != allBooks.size()-1) { // test if this is the last record
	        		out.print(","); // add a comma if not the last record
	        	} // end if
	        } // end for
	        out.println("]}");
	        
        } catch (SQLException e) {
        	out.println(e.getMessage());
        	e.printStackTrace();
		} // end catch
	} // end doGet

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// do nothing
		} // end doPost
	}// end UserReportJSONAdvanced