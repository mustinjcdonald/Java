package class13;

public class Driver {
	public static void main(String[] args) {
		Burger.BurgerBuilder.setBun(BunStyle.REGULAR);
		Burger.BurgerBuilder.setPatty(PattyStyle.BEEF);
		Burger.BurgerBuilder.addTopping(Topping.CHEESE);
		Burger.BurgerBuilder.addTopping(Topping.KETCHUP);
		Burger.BurgerBuilder.addTopping(Topping.LETTUCE);
		Burger.BurgerBuilder.addTopping(Topping.MAYONNAISE);
		Burger.BurgerBuilder.addTopping(Topping.MUSTARD);
		Burger.BurgerBuilder.addTopping(Topping.ONION);
		Burger.BurgerBuilder.addTopping(Topping.PICKLE);
		Burger.BurgerBuilder.addTopping(Topping.TOMATO);
		Burger customerOrderOne = Burger.BurgerBuilder.build();
		System.out.println(customerOrderOne);

		Burger.BurgerBuilder.setBun(BunStyle.GLUTEN_FREE);
		Burger.BurgerBuilder.setPatty(PattyStyle.VEGETARIAN);
		Burger.BurgerBuilder.addTopping(Topping.LETTUCE);
		Burger customerOrderTwo = Burger.BurgerBuilder.build();
		System.out.println(customerOrderTwo);
	} // end main
} // end class Driver