package class18;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("********** WRONG ANSWERS **********");
		System.out.println("********** INTEGER OVERFLOW **********");
		int a = 2000000000;
		int b = 2000000000;
		System.out.println("a + b = " + (a+b));
		System.out.println("********** FLOATING POINT ROUNDING **********");
		float a1 = 1234567.12f;
		float b1 = 7654321.65f;
		System.out.println("a1 + b1 = " + (a1+b1));
		System.out.println("********** DOUBLE IMPRECISION **********");
		double a2 = 1.0;
		double b2 = 1.1;
		System.out.println("a2 - b2 = " + (a2-b2));

		System.out.println("********** CORRECT ANSWERS **********");
		BigInteger a3 = new BigInteger("2000000000");
		BigInteger b3 = new BigInteger("2000000000");
		System.out.println("a3 + b3 = " + a3.add(b3));
		double a4 = 1234567.12;
		double b4 = 7654321.65;
		System.out.println("a4 + b4 = " + (a4+b4));
		BigDecimal a5 = new BigDecimal("1.0");
		BigDecimal b5 = new BigDecimal("1.1");
		System.out.println("a5 - b5 = " + a5.subtract(b5));
		
		System.out.println("********** EXCEPTION EXAMPLE **********");
		//System.out.println("5 / 0 = " + 5/0);
		
		System.out.println("********** EXCEPTION HANDLING EXAMPLE **********");
		try {
			System.out.println("5 / 0 = " + 5/0);
		} catch (Exception e) {
			System.out.println("oops... this happened: " + e.getMessage());
			e.printStackTrace();
		} // end catch
		
		System.out.println("********** EXCEPTIONAL SITUATION EXAMPLE **********");
		System.out.println("Please enter a number: ");
		Scanner input = new Scanner(System.in);
		int grade = input.nextInt();
		System.out.println("You entered the number: " + grade);
		
		System.out.println("********** EXCEPTIONAL SITUATION SIMPLE EXAMPLE **********");
		try {
			System.out.println("Please enter a number: ");
			Scanner input2 = new Scanner(System.in);
			int grade2 = input2.nextInt();
			System.out.println("You entered the number: " + grade2);
		} catch (Exception e) {
			System.out.println("I said enter a number!");
		} // end catch
		
		System.out.println("********** EXCEPTIONAL SITUATION PROPER EXAMPLE **********");
		boolean keepGoing = true;
		// define input3 and grade3 here due to scope!
		Scanner input3 = new Scanner(System.in);
		int grade3 = 0;
		while (keepGoing) {
			try {
				System.out.println("Please enter a number: ");
				grade3 = input3.nextInt(); // if the entry isn't valid, an exception is generated
				// if we make it to this line of code, we know an integer was entered!
				// set the sentinel to let us out of the loop
				keepGoing = false;
			} catch (Exception e) {
				System.out.println("I said enter a number!");
				input3.nextLine(); // clears the bad entry from the Scanner's buffer
			} // end catch
		} // end while
		System.out.println("You entered the number: " + grade3);

		System.out.println("********** FINALLY EXAMPLE **********");
		boolean keepGoing2 = true;
		// define input4 and grade4 here due to scope!
		Scanner input4 = new Scanner(System.in);
		int grade4 = 0;
		while (keepGoing2) {
			try {
				System.out.println("Please enter a number: ");
				grade4 = input4.nextInt(); // if the entry isn't valid, an exception is generated
				// if we make it to this line of code, we know an integer was entered!
				// set the sentinel to let us out of the loop
				keepGoing2 = false;
			} catch (Exception e) {
				System.out.println("I said enter a number!");
				input4.nextLine(); // clears the bad entry from the Scanner's buffer
			} finally {
				System.out.println("In the finally block!");
			} // end finally
		} // end while
		System.out.println("You entered the number: " + grade4);	
	} // end main

} // end ExceptionExample