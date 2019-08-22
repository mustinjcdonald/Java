package SA3;

import java.util.ArrayList;

public class SA2Avg {
	
	public static double doAvg(ArrayList<Double> StudentGrade) {
		
		double arraySum = 0;
		
		for (double eachOne: StudentGrade) {
			arraySum += eachOne;
		} // end for
		
		return arraySum / StudentGrade.size();
		
	} // end doAverage
	
}