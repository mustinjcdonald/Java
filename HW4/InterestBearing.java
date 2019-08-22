package HW4;

public interface InterestBearing extends Taxable {
	public static double INTERESTRATE = 0.05;
	
	public abstract double calculateInterest();
	
} // end HouseholdGood