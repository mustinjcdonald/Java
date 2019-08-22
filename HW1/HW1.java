package HW1;
	
	import java.util.Scanner;

	public class HW1 {

		public static void main(String[] args) {
			
			// Enter Student Data
			Scanner userInput = new Scanner(System.in);
			System.out.println("How many students grades will you enter?: ");
			int NumofStud = Integer.valueOf(userInput.nextLine());
			
			System.out.println("What is student #1's name?: ");
			String StudentOne = userInput.nextLine();
			
			// SO is Student One
			System.out.println("What was the studnet's exam 1 grade?: ");
			double SOexam1 = Integer.valueOf(userInput.nextLine());
			System.out.println("What was the studnet's exam 2 grade?: ");
			double SOexam2 = Integer.valueOf(userInput.nextLine());
			System.out.println("What was the studnet's exam 3 grade?: ");
			double SOexam3 = Integer.valueOf(userInput.nextLine());
			
			System.out.println("What is student #2's name?: ");
			String StudentTwo = userInput.nextLine();
			
			// ST is Student Two
			System.out.println("What was the studnet's exam 1 grade?: ");
			double STexam1 = Integer.valueOf(userInput.nextLine());
			System.out.println("What was the studnet's exam 2 grade?: ");
			double STexam2 = Integer.valueOf(userInput.nextLine());
			System.out.println("What was the studnet's exam 3 grade?: ");
			double STexam3 = Integer.valueOf(userInput.nextLine());
			
			double SOFinalScore = ((SOexam1 + SOexam2 + SOexam3) / 3);
			double STFinalScore = ((STexam1 + STexam2 + STexam3) / 3);
			double classAvg = ((STFinalScore + SOFinalScore) / 2);
			
			System.out.println(StudentOne + "'s exam average score is: " + SOFinalScore); 
			System.out.println(StudentTwo + "'s exam average score is: " + STFinalScore); 
			System.out.println("The class average exam grade was: " + classAvg); 
	
		} // end main

	} // end UserInteractionDemo}
