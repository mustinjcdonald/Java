package SA1;

import java.util.ArrayList;
import java.util.Scanner;

public class SkillAssignment1 {

	public static void main (String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		ArrayList<Integer> numberlist = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter a whole number:");
			numberlist.add(userInput.nextInt());
			} 
		
		System.out.printf("You entered the following numbers: ");
		
		for (Integer x: numberlist) {
			System.out.print(x + " ");
		}
	}
}
