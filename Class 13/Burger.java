package class13;

import java.util.ArrayList;

public class Burger {

	public static class BurgerBuilder {
		private static int builderOrderNumber = 1;
		private static BunStyle builderBun;
		private static PattyStyle builderPatty;
		private static ArrayList<Topping> builderToppings = new ArrayList();
		
		public static Burger build() {
			Burger order = new Burger(builderOrderNumber, builderBun, builderPatty, builderToppings);
			// increment the order number, this should be maintained to not allow duplicate order numbers
			builderOrderNumber++;
			// reset all other static variable values, the toppings ArrayList contents will carry over
			// if not reset the way this is built
			builderBun = null;
			builderPatty = null;
			builderToppings = new ArrayList();
			return order;
		} // end build
		
		public static void setBun(BunStyle incBun) {
			builderBun = incBun;
		} // end setBun
		
		public static void setPatty(PattyStyle incPatty) {
			builderPatty = incPatty;
		} // end setPatty
		
		public static void addTopping(Topping incTopping) {
			builderToppings.add(incTopping);
		} // end addTopping
	} // end BurgerBuilder
	
	private final int orderNumber;
	private final BunStyle bun;
	private final PattyStyle patty;
	private final ArrayList<Topping> toppings;
	
	// notice the private ctor, forces the use of the static nested builder class
	private Burger(int incOrderNumber, BunStyle incBun, PattyStyle incPatty, ArrayList<Topping> incToppings) {
		this.orderNumber = incOrderNumber;
		this.bun = incBun;
		this.patty = incPatty;
		this.toppings = incToppings;
	} // end ctor
	
	@Override
	public String toString() {
		String order = "The burger for order number " + this.orderNumber + " has a " + this.bun + 
				" bun and a " + this.patty + " patty and ";
		String toppingList = "";
		if (this.toppings.size() > 0) {
			for (Topping eachOne: toppings) {
				toppingList += eachOne + ", ";
			} // end for
			toppingList = toppingList.substring(0, toppingList.length() - 2); // cut off last comma
			toppingList += ".";
		} else {
			toppingList = "has no toppings.";
		} // end else
		return order + toppingList;
	} // end toString
} // end Burger