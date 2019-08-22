package Project;

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

public class PointOfSale extends HttpServlet {
	
	private static final long serialVersionUID = 7L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        try {
			List<Cars> allCars = new ArrayList();
			OracleWrapper.prepareStatement("SELECT Make, Model, Year, FROM TEAMDELTACARS WHERE Make = ?",);
			ResultSet rs = OracleWrapper.queryDB();
	        while (rs.next()) {
	        	allCars.add(new Cars(rs.getString(1), rs.getString(2), rs.getString(3)));
	        } // end while
	        out.println("<html>\r\n" + 
	        		"\r\n" + 
	        		"<head>\r\n" + 
	        		"    <title>Vehicle Purchase</title>\r\n" + 
	        		"    <meta name=\"viewport\" content=\"width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0\" />\r\n" + 
	        		"\r\n" + 
	        		"    <link rel=\"stylesheet\" href=\"main.css\">\r\n" + 
	        		"\r\n" + 
	        		"\r\n" + 
	        		"    <div class=\"container\">\r\n" + 
	        		"        <div class=\"row justify-content-center\">\r\n" + 
	        		"            <div>\r\n" + 
	        		"                <p>\r\n" + 
	        		"                    <h1>JRWM Cars</h1>\r\n" + 
	        		"                    <img class=\"btn m-1\" alt=\"image\" src=\"car.jpg\" height=\"150\">\r\n" + 
	        		"                </p>\r\n" + 
	        		"            </div>\r\n" + 
	        		"        </div>\r\n" + 
	        		"    </div>\r\n" + 
	        		"\r\n" + 
	        		"\r\n" + 
	        		"</head>\r\n" + 
	        		"\r\n" + 
	        		"<body>\r\n" + 
	        		"\r\n" + 
	        		"    <section>\r\n" + 
	        		"        <div class=\"container\">\r\n" + 
	        		"            <div class=\"row justify-content-center\">\r\n" + 
	        		"                <div class=\"col-12 col-md-4 text-center\">\r\n" + 
	        		"                    <div class=\"row\">\r\n" + 
	        		"                        <div class=\"col\">\r\n" + 
	        		"                            <p>Thank you for shopping with JRMW! Please select which vehicle you would like to purchase. </p>\r\n" + 
	        		"                        </div>\r\n" + 
	        		"                    </div>\r\n" + 
	        		"\r\n" + 
	        		"                    <div class=\"row justify-content-center\">\r\n" + 
	        		"                        <div class=\"col-md-5 mt-2\">\r\n" + 
	        		"\r\n" + 
	        		"                            <select name=\"carMake\" class=\"form-control\" value=\"Make\">\r\n" + 
	        		"                                <option value=\"\">Make</option>\r\n" + 
	        		"                                <option value=\"01\">Ferrari</option>\r\n" + 
	        		"                                <option value=\"02\">Lamborghini</option>\r\n" + 
	        		"                                <option value=\"03\">Mercedes</option>\r\n" + 
	        		"                                <option value=\"04\">Audi</option>\r\n" + 
	        		"                            </select>\r\n" + 
	        		"                        </div>\r\n" + 
	        		"                        <div class=\"m-1 mt-2\">\r\n" + 
	        		"\r\n" + 
	        		"                            <select name=\"carAmount\" class=\"form-control\" value=\"Quantity\">\r\n" + 
	        		"                                <option value=\"\">Qty</option>\r\n" + 
	        		"                                <option value=\"01\">1</option>\r\n" + 
	        		"                                <option value=\"02\">2</option>\r\n" + 
	        		"                                <option value=\"03\">3</option>\r\n" + 
	        		"                                <option value=\"04\">4</option>\r\n" + 
	        		"                                <option value=\"05\">5</option>\r\n" + 
	        		"                            </select>\r\n" + 
	        		"                        </div>\r\n" + 
	        		"                        <div class=\"m-1 mt-2\">\r\n" + 
	        		"                            <select name=\"color\" class=\"form-control\" placeholder=\"Color\">\r\n" + 
	        		"                                <option value=\"\">Color</option>\r\n" + 
	        		"                                <option value=\"12\">Red</option>\r\n" + 
	        		"                                <option value=\"12\">Silver</option>\r\n" + 
	        		"                                <option value=\"12\">White</option>\r\n" + 
	        		"                                <option value=\"12\">Black</option>\r\n" + 
	        		"                                <option value=\"12\">Beige</option>\r\n" + 
	        		"                            </select>\r\n" + 
	        		"                            <input class=\"inputCard\" type=\"hidden\" name=\"expiry\" maxlength=\"4\" />\r\n" + 
	        		"                        </div>\r\n" + 
	        		"                        <div class=\"mt-3\">\r\n");
	        
	        								out.println("name=\"color\" class=\"form-control1\" placeholder=\"Color\" multiple=\"true\" size=\"6\"");
	        								for (Cars eachOne: allCars) {
	        						        	out.println(eachOne.HTMLCars());
	        						        } // end for
	        		                        out.println(" <form action=\"http://localhost\" method=\"post\" name=\"Feedback\">\r\n" + 
	        		"                                <input class=\" btn btn-primary mt-3\" type=\"button\" value=\"Add to Order\" class=\"Feedback\">\r\n" + 
	        		"                            </form>\r\n" + 
	        		"                        </div>\r\n" + 
	        		"                    </div>\r\n" + 
	        		"                    <br>\r\n" + 
	        		"                    <hr>\r\n" + 
	        		"                    <br>\r\n" + 
	        		"                    <strong>Sub Total &nbsp&nbsp = &nbsp&nbsp</strong>\r\n" + 
	        		"                    <div class=\"box\">\r\n" + 
	        		"                        $45,000,000.00\r\n" + 
	        		"                    </div><br><br>\r\n" + 
	        		"                    <strong>Sales Tax &nbsp&nbsp = &nbsp&nbsp</strong>\r\n" + 
	        		"                    <div class=\"box\">\r\n" + 
	        		"                        $250,000.00\r\n" + 
	        		"                    </div><br><br>\r\n" + 
	        		"                    <strong>Grand Total &nbsp&nbsp = &nbsp&nbsp</strong>\r\n" + 
	        		"                    <div class=\"box\">\r\n" + 
	        		"                        $44,750,000.00\r\n" + 
	        		"                    </div>\r\n" + 
	        		"                    <form action=\"http://localhost\" method=\"post\" name=\"Feedback\">\r\n" + 
	        		"                        <input class=\" btn btn-primary m-4\" type=\"button\" value=\"Submit Order\" class=\"Feedback\">\r\n" + 
	        		"                    </form>\r\n" + 
	        		"                </div>\r\n" + 
	        		"            </div>\r\n" + 
	        		"        </div>\r\n" + 
	        		"    </section>\r\n" + 
	        		"\r\n" + 
	        		"</html>\r\n" + 
	        		"");
        }
	        catch (SQLException e) {
	        	System.out.println(e.getMessage());
	        	e.printStackTrace();
			} // end catch
        } // end doGet

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// do nothing
	} // end doPost
} // end UserReportHTMLAdvanced