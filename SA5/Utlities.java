package SA5;

import SA3.Student;

public class Utlities {
	
	private final double SALESTAXRATE = 0.085;
	private final double CHOCLATEMARKUP = 1.00;
	private final double VANILLAMARKUP = 0.50;
	private final double STRAWBERRYMARKUP = 0.75;
	private final double CONECOST = 0.33;
	private final double SUGARUPCHARGE = 0.33;
	private final double SCOOPCOST = 1.00;
	
public static double calcSubTotal(IceCream.IceCream(String flavor, int numOfScoops, String coneType)) {
	
	double scoopCost = numOfScoops * SCOOPCOST;
	double coneCost = 0;
	double subTotal = 0;
	
	if (coneType = sugarCone) {
		coneCost = SUGARUPCHARGE + CONECOST;
	}
	else {
		coneCost = CONECOST;
	}
 		
	switch(flavor) {
	
	case "Choclate":
			subTotal = CHOCLATEMARKUP + scoopCost + coneCost;
		break;

	case "Vanilla":
		subTotal = CHOCLATEMARKUP + scoopCost + coneCost;
		break;
		
	case "Strawberry":
		subTotal = CHOCLATEMARKUP + scoopCost + coneCost;
		break;
					}
	return subTotal;
	}

public static double calcSalesTax() {
return calcSubTotal() + SALESTAXRATE;
	}
	
public static double calcGrandTotal() {
	double discount = 0;
return calcSalesTax() +  discount;
	}

}
