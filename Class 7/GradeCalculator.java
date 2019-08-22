package class7;

import java.util.ArrayList;

public class GradeCalculator {
	
	private static double totalPoints = 0;
	
	public static double doGrade(ArrayList<Double> grades) {
		double runningTally = 0;
		for (double eachOne: grades) {
			runningTally += eachOne;
		} // end for
		return runningTally / totalPoints;
	} // end doAverage
	
	public static void setTotalPoints(double inc) {
		totalPoints = inc;
	} // end setTotalPoints
	
} // end Utility