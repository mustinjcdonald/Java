package hw6;

public class Textbook {

	public static class TextbookBuilder {
		
		private static int builderISBN;
		private static int builderYear;
		private static int builderPages;
		private static String builderEdition;
		private static String builderAuthor;
		private static String builderTitle;
		private static String builderCourse;


		public static Textbook build() {

			Textbook book = new Textbook(builderISBN, builderPages, builderYear, builderEdition, builderAuthor, builderTitle, builderCourse);
			
			return book;
		}
		
		//use Ice Cream method to set builder methods to build order
		public static void setISBN (int inc) {
			builderISBN = inc; //call setFlavor in the Ice Cream method
		}
		
		public static void setPages (int inc) {
			builderPages = inc; //call setFlavor in the Ice Cream method
		}
		
		public static void setYear (int inc) {
			builderYear = inc; //call setFlavor in the Ice Cream method
		}
		
		public static void setEdition (String text) {
			builderEdition = text; //call setFlavor in the Ice Cream method
		}
		
		public static void setAuthor (String text) {
			builderAuthor = text; //call setFlavor in the Ice Cream method
		}
		
		public static void setTitle (String text) {
			builderTitle = text; //call setFlavor in the Ice Cream method
		}
		
		public static void setCourse (String text) {
			builderCourse = text; //call setFlavor in the Ice Cream method
		}
	}

	private int ISBN;
	private int pages;
	private int year;
	private String edition;
	private String author;
	private String title;
	private String course;
	

	private Textbook(int ISBN, int pages, int year, String edition, String author, String title, String course) {

		this.ISBN = ISBN;
		this.year = year;
		this.pages = pages;
		this.edition = edition;
		this.author = author;
		this.title = title;
		this.course = course;
	} 
	

	public int getISBN() {
		
		return ISBN;
	}

	public int getYear() {
	
		return year;
	}

	public int getPages() {
		return pages;
	}
	
	public String getEdition() {
		return edition;
	}

	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCourse() {
		return course;
	}
	
	public String toJSON() {
		return "{\"ISBN\":\"" + this.ISBN + "\", \"pages\":\"" + this.pages + "\", \"year\":\"" + this.year 
				+ "\", \"edition\":\"" + this.edition + "\", \"author\":\"" + this.author + "\", \"title\":\"" 
				+ this.title + "\", \"course\":\"" + this.course +"\"}";
	}
	
	
	
}