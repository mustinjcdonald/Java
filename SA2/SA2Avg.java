package SA2;

import java.util.ArrayList;

public class SA2Avg {
	
	public static double doAvg(ArrayList<Double> element) {
		
		double arraySum = 0;
		
		for (double eachOne: element) {
			arraySum += eachOne;
		} // end for
		
		return arraySum / element.size();
		
	} // end doAverage
	
}