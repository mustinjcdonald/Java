package HW4;

public interface Taxable {
	public static double TAXRATE = 0.1;
	
	public abstract double calculateTax();
} // end Taxable