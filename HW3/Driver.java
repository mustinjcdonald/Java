package SA5;

import java.text.NumberFormat;
import java.util.ArrayList;
import SA5.Utilities;
import SA5.IceCream;
import java.util.Scanner;

public class Driver {

	private static double DISCOUNT = 0.0;

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		ArrayList<IceCream> orders = new ArrayList<IceCream>();
		
		for (int i = 0; i < 3; i++ ) {
		
			//Ice Cream is built through the builder method and placed in the array orders
			IceCream.IceCreamBuilder.setConeType();
			IceCream.IceCreamBuilder.setFlavor();
			IceCream.IceCreamBuilder.setNumOfScoops();
			IceCream.IceCreamBuilder.setTaxable();
			orders.add(IceCream.IceCreamBuilder.build());
			
			//asks the user if they apply for a discount
			System.out.println("Are you a Student, in the Military, or Senior citizen? (1 = Student, 2 = Military, 3 = Senior citizen, 4 = None)");
			int getDiscount = Integer.valueOf(userInput.nextLine()); 

			//the amounts for each of the discounts
			if (getDiscount == 1) {
				DISCOUNT = 0.15;
			}
			else if (getDiscount == 2) {
				DISCOUNT = 0.5;
			}
			else if (getDiscount == 3) {
				DISCOUNT = 0.3;
			}
			else if (getDiscount == 4) {
				DISCOUNT = 0.0;
			}
			else {
				DISCOUNT = 0.0;
			}
			
			//object variable to index the total for the order being placed
			IceCream order = orders.get(i);

			double subTotal = Utilities.calcSubTotal(order);
			double salesTax = Utilities.calcSalesTax(subTotal);
			if (!orders.get(i).getTaxable()) { salesTax = 0.00; }
			double grandTotal = Utilities.calcGrandTotal(subTotal, salesTax, DISCOUNT);

			System.out.println("\nThe " + orders.get(i) + " costs a subtotal of: " 
					+ NumberFormat.getCurrencyInstance().format(subTotal) +"." + "\nWith tax and discount included" + " (tax: " 
					+ NumberFormat.getCurrencyInstance().format(salesTax) + " discount: " 
					+ NumberFormat.getCurrencyInstance().format(DISCOUNT * subTotal) + "), your grand total comes out to be: " 
					+ NumberFormat.getCurrencyInstance().format(grandTotal) + "\n");
		}
	} // end main

} // end Driver