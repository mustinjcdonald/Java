package class19;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import uca.mis3339.OracleWrapper;

public class UCAWrapperDemo {
	public static void main(String[] args) {
		try {
			OracleWrapper.prepareStatement("SELECT * FROM BOOKS");
			ResultSet rs = OracleWrapper.queryDB();					
            ResultSetMetaData md = rs.getMetaData();
            // databases start counting at 1, not 0 like arrays
            for (int i = 1; i <= md.getColumnCount(); i++) {
            	System.out.print(String.format("%1$"+20+ "s", md.getColumnName(i)).toUpperCase());
            } // end for
            // insert a CR/LF after all the column names are printed out
            System.out.print("\n");
            // iterate through the rowset
            while (rs.next()) {
                // iterate through the columns in each row
                for (int i = 1; i <= md.getColumnCount(); i++) {
                	System.out.print(String.format("%1$"+20+ "s", rs.getObject(i)).toUpperCase());
                } // end for
                System.out.print("\n");
            } // end while
            rs.close();
        } catch (SQLException e) {
        	System.out.println(e.getMessage());
		} // end catch
	} // end main
} // end UCAWrapperDemo