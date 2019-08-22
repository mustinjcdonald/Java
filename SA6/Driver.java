package sa6;

import java.text.NumberFormat;

public class Driver {

	private static double DISCOUNT = 0.0;
	
	public static void main(String[] args) {
		IceCream orderOne = new IceCream("chocolate", 2, "regular", true);
		double subTotal = Utilities.calcSubTotal(orderOne);
		double salesTax = Utilities.calcSalesTax(subTotal);
		if (!orderOne.isTaxable()) { salesTax = 0.00; }
		double grandTotal = Utilities.calcGrandTotal(subTotal, salesTax, DISCOUNT);
		System.out.println("The " + orderOne + " costs subtotal: " 
				+ NumberFormat.getCurrencyInstance().format(subTotal) + " tax: " 
				+ NumberFormat.getCurrencyInstance().format(salesTax) 
				+ " grand total: " + NumberFormat.getCurrencyInstance().format(grandTotal));
	} // end main

} // end Driver