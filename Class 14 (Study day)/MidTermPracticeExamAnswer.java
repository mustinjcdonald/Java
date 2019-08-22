package class14;

public class MidTermPracticeExamAnswer {

	private static class MidTermPracticeExamBuilder {
		
		private static String releaseDate;
		private static String movieTitle;
		private static double rottenTomatoesCriticRating;
		private static double rottenTomatoesAudienceRating;
		
		public static void setReleaseDate(String inc) {
			releaseDate = inc;
		} // end setReleaseDate
		
		public static void setMovieTitle(String inc) {
			movieTitle = inc;
		} // end setMovieTitle
		
		public static void setRottenTomatoesCriticRating(double inc) {
			rottenTomatoesCriticRating = inc;
		} // end setRottenTomatoesCriticRating
		
		public static void setRottenTomatoesAudienceRating(double inc) {
			rottenTomatoesAudienceRating = inc;
		} // end setRottenTomatoesAudienceRating
		
		public static MidTermPracticeExamAnswer build() {
			return new MidTermPracticeExamAnswer(releaseDate, movieTitle, rottenTomatoesCriticRating, rottenTomatoesAudienceRating);
		} // end build
	} // end MidTermPracticeExamAnswer
	
	private final String releaseDate;
	private final String movieTitle;
	private final double rottenTomatoesCriticRating;
	private final double rottenTomatoesAudienceRating;

	private MidTermPracticeExamAnswer(String incReleaseDate, String incMovieTitle, double incRottenTomatoesCriticRating, double incRottenTomatoesAudienceRating) {
		this.releaseDate = incReleaseDate;
		this.movieTitle = incMovieTitle;
		this.rottenTomatoesCriticRating = incRottenTomatoesCriticRating;
		this.rottenTomatoesAudienceRating = incRottenTomatoesAudienceRating;
	} // end ctor
	
	public static void main(String[] args) {
		MidTermPracticeExamBuilder.setReleaseDate("04/27/2018");
		MidTermPracticeExamBuilder.setMovieTitle("Avengers: Infinity War");
		MidTermPracticeExamBuilder.setRottenTomatoesCriticRating(84.0);
		MidTermPracticeExamBuilder.setRottenTomatoesAudienceRating(92.0);
		MidTermPracticeExamAnswer movieOne = MidTermPracticeExamBuilder.build();
		System.out.println(movieOne.toString());
	} // end main
	
	@Override
	public String toString() {
		return "The movie titled: " + this.movieTitle + " released on " + this.releaseDate +
				" received a critic score of: " + this.rottenTomatoesCriticRating + 
				"% and an audience score of: " + this.rottenTomatoesAudienceRating + 
				"% from Rotten Tomatoes.";
	} // end toString
} // end MidTermPracticeExamAnswer