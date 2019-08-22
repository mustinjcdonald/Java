package class21;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JSONDemo extends HttpServlet {
	
	private static final long serialVersionUID = 3L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("{\"person\":{\"fname\":\"Jeff\",\"lname\":\"Hill\"}}");
	} // end doGet

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// this is used for form processing, we'll deal with this later
	} // end doPost
} // end JSONDemo