package class23;

public class MovieAnswer {

	private final String title;
	private final int year;
	private final int criticRating;
	private final int viewerRating;
	
	public MovieAnswer (String incTitle, int incYear, int incCriticRating, int incViewerRating) {
		this.title = incTitle;
		this.year = incYear;
		this.criticRating = incCriticRating;
		this.viewerRating = incViewerRating;
	} // end ctor
	
	public String toHTML() {
		return "<tr><td>Title: </td><td>" + this.title + "</td></tr>"
				+ "<tr><td>Year: </td><td>" + this.year + "</td></tr>"
				+ "<tr><td>Critic Rating: </td><td>" + this.criticRating + "</td></tr>"
				+ "<tr><td>Viewer Rating: </td><td>" + this.viewerRating + "</td></tr>";
	} // end toHTML
} // end Movie