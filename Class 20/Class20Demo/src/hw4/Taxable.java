package hw4;

public interface Taxable {

	public static double TAXRATE = 0.10;
	public abstract double calculateTax();
} // end Taxable