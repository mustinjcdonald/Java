package hw4;

public class Retirement extends BankAccount implements InterestBearing {
	
	public Retirement(String incOwnerfName, String incOwnerlName) {
		super(incOwnerfName, incOwnerlName);
	} // end ctor
	
	@Override
	public double calculateInterest() {
		if (this.getBalance() <= 0) {
			return 0;
		} else {
			return this.getBalance() * InterestBearing.INTERESTRATE;
		} // end else
	} // end calculateTax
	
	@Override
	public String toString() {
		return "Retirement account owned by " + this.getOwnerfName() + " " 
				+ this.getOwnerlName() + " has a current balance of " + 
				java.text.NumberFormat.getCurrencyInstance().format(this.getBalance());
	} // end toString
} // end Retirement