package sa2;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Double> values = new ArrayList<Double>();
		values.add(75.0);
		values.add(85.0);
		values.add(95.0);
		values.add(105.0);
		System.out.println("The average value is: " + SkillAssignment2.averageCalculator(values));
	} // end main

} // end Driver