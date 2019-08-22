package hw4;

public class Savings extends BankAccount implements Taxable, InterestBearing {
	
	public Savings(String incOwnerfName, String incOwnerlName) {
		super(incOwnerfName, incOwnerlName);
	} // end ctor
	
	@Override
	public double calculateTax() {
		if (this.getBalance() <= 0) {
			return 0;
		} else {
			return this.getBalance() * Taxable.TAXRATE;
		} // end else
	} // end calculateTax
	
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
		return "Savings account owned by " + this.getOwnerfName() + " " 
				+ this.getOwnerlName() + " has a current balance of " + 
				java.text.NumberFormat.getCurrencyInstance().format(this.getBalance());
	} // end toString
} // end Savings