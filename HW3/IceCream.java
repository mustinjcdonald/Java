package SA5;

import java.util.Scanner;

public class IceCream implements Taxable {

	public static class IceCreamBuilder {

		private static String builderflavor;
		private static String buildercone;
		private static Integer builderscoop;
		private static Boolean buildertaxable;

		public static  IceCream build() {

			IceCream order = new IceCream(builderflavor, builderscoop, buildercone, buildertaxable);
			builderflavor = null;
			buildercone = null;
			builderscoop = null;
			buildertaxable = null;

			return order;
		}
		
		//use Ice Cream method to set builder methods to build order
		public static void setFlavor () {
			builderflavor = IceCream.setFlavor(); //call setFlavor in the Ice Cream method
		}
		public static void setConeType () {
			buildercone = IceCream.setConeType(); //call setConeType in the Ice Cream method
		}
		public static void setNumOfScoops () {
			builderscoop = IceCream.setNumOfScoops(); //call setNumOfScoops in Ice Cream method
		}
		public static void setTaxable () {
			buildertaxable = IceCream.setTaxable(); //calll setTaxable in Ice Cream method
		}
	}

	private final String flavor;
	private final String cone;
	private final int scoop;
	public boolean taxable;

	private IceCream(String flavor, int scoop, String cone, boolean taxable) {

		this.flavor = flavor;
		this.scoop = scoop;
		this.cone = cone;
		this.taxable = taxable;
	} 

	public int getNumOfScoops() {
		return this.scoop;
	}

	public String getConeType() {
		return this.cone;
	}

	public String getFlavor() {
		return this.flavor;
	}

	public boolean getTaxable() {
		return this.taxable;
	}

	public String toString() {
		return this.flavor.toLowerCase() + " ice cream with a " + this.cone.toLowerCase() + " cone and " + this.scoop + " scoop(s)";
	}

	public static String setFlavor() {

		Scanner userInput = new Scanner(System.in);
		String choice = "";

		System.out.println("What flavor would you like? (1 = Chocolate, 2 = Vanilla, 3 = Strawberry): ");
		int flavor = Integer.valueOf(userInput.nextLine()); 

		//data validation with enums to make sure the user doesn't mispell the flavor type 
		if (flavor == 1) {
			choice = Flavor.Chocolate.name();
			return choice;
		}
		else if (flavor == 2) {
			choice = Flavor.Vanilla.name();
			return choice;
		}
		else if (flavor == 3) {
			choice = Flavor.Strawberry.name();
			return choice;
		}
		else {
			System.out.println("That is not a listed flavor, please try again." + "\n");
			choice = setFlavor(); //loops back through method if user doesn't enter a listed choice
		}
		return choice;
	} //end setFlavor

	public static int setNumOfScoops() {

		Scanner userInput = new Scanner(System.in);

		System.out.println("How many scoops?: ");
		int scoop = Integer.valueOf(userInput.nextLine()); 

		//data validation, cannot have more than 4 scoops on a single ice cream cone
		if (scoop > 4) {

			System.out.println("The MAXIMUM number of sccops per cone is 4, please choose an amount of 4 or less.");
			scoop = Integer.valueOf(userInput.nextLine()); 

			return scoop;
		}

		return scoop;
	} //end setNumOfScoops

	public static String setConeType() {

		Scanner userInput = new Scanner(System.in);
		String choice = "";

		System.out.println("Would you like a Sugar cone or a Regular cone? (1 = Sugar cone, 2 = Regular cone) ");
		int cone = Integer.valueOf(userInput.nextLine()); 

		//data validation with enums to make sure the user doesn't mispell the flavor type 
		if (cone == 1) {
			choice = ConeType.Sugar.name();
			return choice;
		}
		else if (cone == 2) {
			choice = ConeType.Regular.name();
			return choice;
		}
		else {
			System.out.println("That is not a listed cone type, please try again." + "\n");
			choice = setConeType(); //loops back through method if user doesn't enter a listed choice
	
		}
		return choice;
	}

	public static boolean setTaxable() {

		boolean yesOrNo = null != null;

		Scanner userInput = new Scanner(System.in);

		System.out.println("Is this taxable? (Yes or No): ");
		String taxable = String.valueOf(userInput.nextLine()); 

		//data validation to get a yes or no from the user
		if (taxable .equalsIgnoreCase("Yes")) {
			yesOrNo = true;
		}
		else if (taxable .equalsIgnoreCase("No")) {
			yesOrNo = false;
		}
		else {
			yesOrNo = setTaxable(); //loops back through method if user doesn't enter a listed choice
		}

		return yesOrNo;
	}

}
