package hw5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {
	
	Connection conn = null; {
	
		try {
	conn = DriverManager.getConnection("jdbc:oracle:thin:@161.31.3.67:1521:xe","MIS3339","MIS3339");
    // explicitly set transactional processing to be off
    conn.setAutoCommit(true);
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM TEXTBOOKS");
    // get the table's metadata
    ResultSetMetaData md = rs.getMetaData();
	
	while (rs.next()) {
        // iterate through the columns in each row
        for (int i = 1; i <= md.getColumnCount(); i++) {
        	Textbook.TextbookBuilder.setISBN();
        	Textbook.TextbookBuilder.setYear();
        	Textbook.TextbookBuilder.setPages();
        	Textbook.TextbookBuilder.setEdition();
        	Textbook.TextbookBuilder.setAuthor();
        	Textbook.TextbookBuilder.setTitle();
        	Textbook.TextbookBuilder.setCourse();

        }
	}// end for
        
	} catch (SQLException e) {
    	System.out.println(e.getMessage());
    	e.printStackTrace();

		}
	}
}



