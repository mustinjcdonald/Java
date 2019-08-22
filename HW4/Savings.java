package HW4;

public class Savings extends BankAccount implements Taxable, InterestBearing {

	public Savings(String fname, String lname) {
		// TODO Auto-generated constructor stub
		super(fname, lname);
	}

	public String toString() {
		
	 return "Savings account owner by " + this.getfName() + " " + this.getlName() + " has a current balance of " + this.getBalance();
	}

	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		return this.getBalance() * TAXRATE;
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return this.getBalance() * INTERESTRATE;
	}
} // end HouseholdGood