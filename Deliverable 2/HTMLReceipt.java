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

public class HTMLReceipt extends HttpServlet {
	
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
	        out.println("\r\n" + 
	        		"<!DOCTYPE html>\r\n" + 
	        		"<html>\r\n" + 
	        		"\r\n" + 
	        		"<head>\r\n" + 
	        		"    <title>Vehicle Purchase</title>\r\n" + 
	        		"    <meta name=\"viewport\" content=\"width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0\" />\r\n" + 
	        		"\r\n" + 
	        		"    <link rel=\"stylesheet\" href=\"CSS/main.css\">\r\n" + 
	        		"\r\n" + 
	        		"    <div class=\"container\">\r\n" + 
	        		"        <div class=\"row justify-content-center\">\r\n" + 
	        		"            <div>\r\n" + 
	        		"                <p>\r\n" + 
	        		"                    <h1>JRWM Cars</h1>\r\n" + 
	        		"                    <img class=\"btn m-1\" alt=\"image\" src=\"Images/car.jpg\" height=\"150\">\r\n" + 
	        		"                </p>\r\n" + 
	        		"            </div>\r\n" + 
	        		"        </div>\r\n" + 
	        		"    </div>\r\n" + 
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
	        		"                            <p>Thank you for your purchase with JRWM. Here is your recipt and transaction number. </p>\r\n" + 
	        		"                        </div>\r\n" + 
	        		"                    </div>\r\n" + 
	        		"                    <hr>\r\n" + 
	        		"                    <div class=\"row justify-content-center\">\r\n" + 
	        		"                        <p><strong>Transaction #:</strong> 564221895 <br><br>\r\n" + 
	        		"                            <strong>Subtotal:</strong> $45000000.00<br><br>\r\n" + 
	        		"                            <strong>Sales Tax:</strong> $2500000.00<br><br>\r\n" + 
	        		"                            <strong>Grand Total:</strong> $44750000.00</p><br>\r\n" + 
	        		"                    </div>\r\n" + 
	        		"                    <hr>\r\n" + 
	        		"                </div>\r\n" + 
	        		"            </div>\r\n" + 
	        		"            <br>\r\n" + 
	        		"            <h6>\r\n" + 
	        		"                16449562315497685 &nbsp&nbsp\r\n" + 
	        		"                (1) &nbsp&nbsp\r\n" + 
	        		"                $244750000.00 &nbsp&nbsp\r\n" + 
	        		"                Lamborghini Lenevo &nbsp&nbsp\r\n" + 
	        		"            </h6>\r\n" + 
	        		"        </div>\r\n" + 
	        		"\r\n" + 
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