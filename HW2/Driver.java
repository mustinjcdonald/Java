package SA3;

import SA3.Student;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Driver {

 public static void main(String[] args) {
 // example data member manipulation method
	
	 ArrayList<Student> students = new ArrayList<Student>();
	 
 		students.add(new Student (Student.getfName(), Student.getlName()));
 		students.add(new Student (Student.getfName(), Student.getlName()));
 		students.add(new Student (Student.getfName(), Student.getlName()));
 		Collections.sort(students);
 		
 		for (Student eachOne: students) {
			System.out.println(eachOne);
		} 
 	}
 
}