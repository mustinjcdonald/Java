package HW4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// Demonstrate polymorphic declaration and behavior
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("***** BASIC POLYMORPHISM *****");
		BankAccount acctOne = new Savings("Jeff","Hill");
		BankAccount acctTwo = new Retirement("Justin","McDonald");
		// userInput for deposit and withdrawal amount for each account instance
		System.out.println("Please enter the deposit you wish to enter for " + acctOne.getfName() + " " + acctOne.getlName() + ".");
		Double deposit1 = Double.valueOf(userInput.nextLine());
		acctOne.deposit(deposit1);
		System.out.println("Please enter the deposit you wish to make for " + acctTwo.getfName() + " " + acctTwo.getlName() + ".");
		Double deposit2 = Double.valueOf(userInput.nextLine());
		acctTwo.deposit(deposit2);
		System.out.println("Please enter the withdrawal you wish to make for " + acctOne.getfName() + " " + acctOne.getlName() + ".");
		Double withdrawal1 = Double.valueOf(userInput.nextLine());
		acctOne.withdrawal(withdrawal1);
		System.out.println("Please enter the withdrawal you wish to make for " + acctTwo.getfName() + " " + acctTwo.getlName() + ".");
		Double withdrawal2 = Double.valueOf(userInput.nextLine());
		acctTwo.withdrawal(withdrawal2);
		
		System.out.println(acctOne.toString());
		System.out.println(acctTwo.toString());
		
		System.out.println("***** POLYMORPHISM IN A COLLECTION *****");
		List<BankAccount> accounts = new ArrayList();
		accounts.add(acctOne);
		accounts.add(acctTwo);
		for (BankAccount eachOne: accounts) {
			if (eachOne instanceof Taxable) {
				eachOne.withdrawal(((Taxable)eachOne).calculateTax());
			} // end if
			if (eachOne instanceof InterestBearing) {
				eachOne.deposit(((InterestBearing)eachOne).calculateInterest());
			} // end if
			System.out.println(eachOne.toString());
		} // end for
	} // end main
} // end Driver

