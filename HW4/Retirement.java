package HW4;

public class Retirement extends BankAccount implements InterestBearing {

	public Retirement(String fname, String lname) {
		super(fname, lname);
	} // end ctor

	public String toString() {
		
		return "Retirement account owner by " + this.getfName() + " " + this.getlName() + " has a current balance of " + this.getBalance();
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return this.getBalance() * INTERESTRATE;
	}

	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		return 0;
	}

} // end Foodstuff