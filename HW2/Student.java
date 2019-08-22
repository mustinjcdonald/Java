package SA3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

 public class Student implements Comparable<Student> {
 private final String fName;
 private final String lName;
 public double Grade;

 public Student(String fName, String lName) {
	 
this.fName = fName;
this.lName = lName;
this.Grade = getGrade();
 
 } // end ctor

 public String toString() {
 return this.fName + " " + this.lName + "'s grade average is: " + String.format("%.2f", this.Grade);
 } // end describeMe
 
 public double getGrade() {
	 
	 ArrayList<Double> StudentGrade = new ArrayList();

	 Scanner userInput = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter " + this.fName + " " + this.lName + "'s grade as a decimal value: ");
			 Double	Grade = Double.valueOf(userInput.nextLine());
			 StudentGrade.add(Grade); 				
		}
		
		return SA2Avg.doAvg(StudentGrade);	

}
 
public static String getfName() {
	 
	 Scanner userInput = new Scanner(System.in);
	 
	 System.out.println("Please enter Student first name: ");
	 	String fName = String.valueOf(userInput.nextLine()); 
	 
	 	return fName;
 	}
 
public static String getlName() {
	 
	 Scanner userInput = new Scanner(System.in);
	 
	 System.out.println("Please enter Student last name: ");
	 	String lName = String.valueOf(userInput.nextLine()); 
	 
	 	return lName;
	 	
 		}

public int compareTo(Student inc) {
		return this.fName.compareTo(inc.fName);
}	
 }
