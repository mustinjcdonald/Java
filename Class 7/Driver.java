package class7;

import java.util.ArrayList;

import Utility.GradeCalculator;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Double> grades = new ArrayList();
		grades.add(78.0);
		grades.add(64.5);
		grades.add(84.3);
		GradeCalculator .setTotalPoints(300);
		System.out.println("The grade average is: " + GradeCalculator.doGrade(grades));
		GradeCalculator .setTotalPoints(270);
		System.out.println("The curved grade average is: " + GradeCalculator.doGrade(grades));
	} // end main

} // end Driver