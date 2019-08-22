package class14;

public class MidTermPracticeExam {

	private final String releaseDate;
	private final String movieTitle;
	private final double rottenTomatoesCriticRating;
	private final double rottenTomatoesAudienceRating;

	public MidTermPracticeExam(String incReleaseDate, String incMovieTitle, double incRottenTomatoesCriticRating, double incRottenTomatoesAudienceRating) {
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
		MidTermPracticeExam movieOne = MidTermPracticeExamBuilder.build();
		System.out.println(movieOne.toString());
	} // end main
} // end MidTermExam