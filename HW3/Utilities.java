package SA5;

import SA5.IceCream;

import java.util.ArrayList;

import SA5.Driver;

public class Utilities {

	private static final double SALESTAXRATE = 0.085;
	private static final double CHOCLATEMARKUP = 1.00;
	private static final double VANILLAMARKUP = 0.50;
	private static final double STRAWBERRYMARKUP = 0.75;
	private static final double CONECOST = 0.33;
	private static final double SUGARUPCHARGE = 0.33;
	private static final double SCOOPCOST = 1.00;

	public static double calcSubTotal(IceCream order) {

		double subTotal = 0;
		double coneCost = 0;


		//charge the user per scoop
		double scoopCost = order.getNumOfScoops() * SCOOPCOST;

		//check for the cone type that the user and charge them correctly
		if (order.getConeType() .equalsIgnoreCase("sugar")) {
			coneCost = SUGARUPCHARGE + CONECOST;
		}
		else if (order.getConeType() .equalsIgnoreCase ("regular")) {
			coneCost = CONECOST;
		} 

		//check for the flavor type the user chose and charge them correctly 
		switch(order.getFlavor().toLowerCase()) {

		case "chocolate":
			subTotal = CHOCLATEMARKUP + scoopCost + coneCost;
			break;

		case "vanilla":
			subTotal = VANILLAMARKUP + scoopCost + coneCost;
			break;

		case "strawberry":
			subTotal = STRAWBERRYMARKUP + scoopCost + coneCost;
			break;
		}
		return subTotal;
	}

	//find out how much the sales tax is according to the subtotal of the order
	public static double calcSalesTax(double subTotal) {
		return  subTotal * SALESTAXRATE;
	}

	public static double calcGrandTotal(double subTotal, double salesTax, double DISCOUNT) {
		return subTotal + salesTax - (subTotal * DISCOUNT);
	}

}
