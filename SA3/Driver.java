package SA3;

import SA3.Student;
import java.util.Scanner;
import java.util.ArrayList;

public class Driver {

 public static void main(String[] args) {
 // example data member manipulation method
	

 		Student studentOne = new Student (Student.getfName(), Student.getlName());
 		
 		System.out.println(studentOne.describeMe());
 		
 	}
 
}