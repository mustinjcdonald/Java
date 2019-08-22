package HW4;

import java.util.Scanner;

public class BankAccount {
	
	private double balance;
	final String fName;
	final String lName;
	
	
	public BankAccount (String fname, String lname) {
		this.fName = fname;
		this.lName = lname;
		this.balance = 0;
	} // end ctor
	
	public String getfName() {
		return this.fName;
	} // end getName
	
	public String getlName() {
		return this.lName;
	} // end getName
	
	public void deposit(double d) {
		balance = balance + d;
		String amount = String.format("%.02f", balance);
		Double.parseDouble(amount);
	} // end initDeposit
	
	public void withdrawal(double d) {
		balance = balance - d;
		String amount = String.format("%.02f", balance);
		Double.parseDouble(amount);
	} // end initWithdrawal
	
	public double getBalance() {
		String amount = String.format("%.02f", balance);
		return Double.parseDouble(amount);
	} // end getBalance
	
	
	public String toString() {
		return null;
	} // end toString
} // end Product