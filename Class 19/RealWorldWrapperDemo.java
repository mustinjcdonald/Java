package class19;

import java.sql.ResultSet;
import java.sql.SQLException;
import uca.mis3339.OracleWrapper;

public class RealWorldWrapperDemo {

	private static int PADDING = 20;
	
	public static String formatMe(String inc) {
		return String.format("%1$"+ PADDING + "s", inc).toUpperCase();
	} // end formatMe
	
	public static void main(String[] args) {
		try {
			String header = "";
			header += formatMe("ID");
			header += formatMe("PAGES");
			header += formatMe("YEAR");
			header += formatMe("AUTHOR");
			header += formatMe("TITLE");
			OracleWrapper.prepareStatement("SELECT * FROM BOOKS");
			System.out.println(header);
			ResultSet rs = OracleWrapper.queryDB();					
            // iterate through the results
            while (rs.next()) {
                String record = "";
                // don't forget, databases start counting at 1
            	record += formatMe(String.valueOf(rs.getObject(1)));
            	record += formatMe(String.valueOf(rs.getObject(2)));
            	record += formatMe(String.valueOf(rs.getObject(3)));
            	record += formatMe(String.valueOf(rs.getObject(4)));
            	record += formatMe(String.valueOf(rs.getObject(5)));
                System.out.println(record);
            } // end while
            rs.close();
        } catch (SQLException e) {
        	System.out.println(e.getMessage());
		} // end catch
	} // end main
} // end RealWorldWrapperDemo