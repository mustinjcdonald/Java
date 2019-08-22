package hw4;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// Demonstrate polymorphic declaration and behavior
		System.out.println("***** BASIC POLYMORPHISM *****");
		BankAccount acctOne = new Savings("Jeff","Hill");
		BankAccount acctTwo = new Retirement("Jeff","Hill");
		acctOne.deposit(150);
		acctTwo.deposit(250);
		acctOne.withdrawal(25);
		acctTwo.withdrawal(55);
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