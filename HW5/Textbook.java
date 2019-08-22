	package hw5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Textbook {

	public static class TextbookBuilder {

		private static int builderISBN;
		private static int builderYear;
		private static int builderPages;
		private static String builderEdition;
		private static String builderAuthor;
		private static String builderTitle;
		private static String builderCourse;


		public static  Textbook build() {

			Textbook book = new Textbook(builderISBN, builderPages, builderYear, builderEdition, builderAuthor, builderTitle, builderCourse);

			return book;
		}
		
		//use Ice Cream method to set builder methods to build order
		public static void setISBN () {
			builderISBN = Textbook.getISBN(null); //call setFlavor in the Ice Cream method
		}
		
		public static void setPages () {
			builderISBN = Textbook.getPages(null); //call setFlavor in the Ice Cream method
		}
		
		public static void setYear () {
			builderISBN = Textbook.getISBN(null); //call setFlavor in the Ice Cream method
		}
		
		public static void setEdition () {
			builderISBN = Textbook.getISBN(null); //call setFlavor in the Ice Cream method
		}
		
		public static void setAuthor () {
			builderISBN = Textbook.getISBN(null); //call setFlavor in the Ice Cream method
		}
		
		public static void setTitle () {
			builderISBN = Textbook.getISBN(null); //call setFlavor in the Ice Cream method
		}
		
		public static void setCourse () {
			builderISBN = Textbook.getISBN(null); //call setFlavor in the Ice Cream method
		}
	}

	private static int ISBN;
	private static int pages;
	private static int year;
	private static String edition;
	private static String author;
	private static String title;
	private static String course;
	public static Connection conn = null;
	

	private Textbook(int ISBN, int pages, int year, String edition, String author, String title, String course) {

		this.ISBN = ISBN;
		this.year = year;
		this.pages = pages;
		this.edition = edition;
		this.author = author;
		this.title = title;
		this.course = course;
	} 
	
	public static void getTableData () {
		
		try {
            // load the Oracle driver into the JDBC driver manager
            // "oracle.jdbc.OracleDriver" is the name that must be used
            // there is an older reference oracle.jdbc.driver.OracleDriver that is now deprecated
            Class.forName("oracle.jdbc.OracleDriver");
        } // end try
        catch (ClassNotFoundException ex) {
            System.out.println("The Oracle driver is not available.");
            System.out.println(ex.getMessage());
        }
		
		ArrayList<String> columns = new ArrayList();
		ArrayList bookdata = new ArrayList();
		
		try {
		conn = DriverManager.getConnection("jdbc:oracle:thin:@161.31.3.67:1521:xe","MIS3339","MIS3339");
        // explicitly set transactional processing to be off
        conn.setAutoCommit(true);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM TEXTBOOKS");
        // get the table's metadata
        ResultSetMetaData md = rs.getMetaData();
        // databases start counting at 1, not 0 like arrays
		
        for (int i = 1; i <= md.getColumnCount(); i++) {
		
			//Ice Cream is built through the builder method and placed in the array orders
			columns.add(md.getColumnName(i));
        }

    	while (rs.next()) {
            // iterate through the columns in each row
            for (int i = 1; i <= md.getColumnCount(); i++) {
            	bookdata.add((Textbook) rs.getObject(i));
            	} // end for
        	}
		}
    	 catch (SQLException e) {
         	System.out.println(e.getMessage());
         	e.printStackTrace();
    }
		ISBN = (int) bookdata.get(1);
		pages = (int) bookdata.get(2);
		year = (int) bookdata.get(3);
		edition = (String) bookdata.get(4);
		author = (String) bookdata.get(5);
		title = (String) bookdata.get(6);
		course = (String) bookdata.get(7);
		
}

	public static int getISBN(ArrayList bookdata) {
		ISBN = (int) bookdata.get(1);
		return ISBN;
	}

	public int getYear(ArrayList bookdata) {
		year = (int) bookdata.get(3);
		return year;
	}

	public static int getPages(ArrayList bookdata) {
		pages = (int) bookdata.get(2);
		return pages;
	}
	
	public static String getEdition(ArrayList bookdata) {
		edition = (String) bookdata.get(4);
		return edition;
	}

	public static String getAuthor(ArrayList bookdata) {
		author = (String) bookdata.get(5);
		return author;
	}
	
	public static String getTitle(ArrayList bookdata) {
		title = (String) bookdata.get(6);
		return title;
	}
	
	public static String getCourse(ArrayList bookdata) {
		course = (String) bookdata.get(7);
		return course;
	}

	public String toString(ArrayList columns) {
		return "The textbook for the " + this.course + " course " + columns.get(1) + ": " + this.ISBN + " " + columns.get(6) + ": " 
		+ this.title + ", " + this.edition + " ed. written by: " + this.author + " in " + this.year + " has " + this.pages + " pages.";
	}
	
	
	
}