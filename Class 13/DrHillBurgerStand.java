package class13;

import java.util.Scanner;

public class DrHillBurgerStand {
	public static void main(String[] args) {
		System.out.println("Dr. Hill's Burger Stand");
		chooseBun();
		choosePatty();
		chooseToppings();
		Burger customerOrder = Burger.BurgerBuilder.build();
		System.out.println(customerOrder);		
	} // end main
	
	
	private static void chooseBun() {
		Scanner input = new Scanner(System.in);
		System.out.println("What bun would you like? (1 = Regular, 2 = Gluten Free): ");
		switch (input.nextInt()) {
			case 1: Burger.BurgerBuilder.setBun(BunStyle.REGULAR); break;
			default: Burger.BurgerBuilder.setBun(BunStyle.GLUTEN_FREE);
		} // end switch
	} // end chooseBun
	
	private static void choosePatty() {
		Scanner input = new Scanner(System.in);
		System.out.println("What patty would you like? (1 = Beef, 2 = Vegetarian): ");
		switch (input.nextInt()) {
			case 1: Burger.BurgerBuilder.setPatty(PattyStyle.BEEF); break;
			default: Burger.BurgerBuilder.setPatty(PattyStyle.VEGETARIAN);
		} // end switch
	} // end choosePatty
	
	private static void chooseToppings() {
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("What topping would you like?");
			System.out.println("1 = cheese");
			System.out.println("2 = ketchup");
			System.out.println("3 = mustard");
			System.out.println("4 = mayonnaise");
			System.out.println("5 = lettuce");
			System.out.println("6 = tomato");
			System.out.println("7 = onion");
			System.out.println("8 = pickle");
			System.out.println("0 = none or no additional toppings");
			switch (input.nextInt()) {
				case 1: Burger.BurgerBuilder.addTopping(Topping.CHEESE); break;
				case 2: Burger.BurgerBuilder.addTopping(Topping.KETCHUP); break;
				case 3: Burger.BurgerBuilder.addTopping(Topping.MUSTARD); break;
				case 4: Burger.BurgerBuilder.addTopping(Topping.MAYONNAISE); break;
				case 5: Burger.BurgerBuilder.addTopping(Topping.LETTUCE); break;
				case 6: Burger.BurgerBuilder.addTopping(Topping.TOMATO); break;
				case 7: Burger.BurgerBuilder.addTopping(Topping.ONION); break;
				case 8: Burger.BurgerBuilder.addTopping(Topping.PICKLE); break;
				default: return;
			} // end switch
		} // end while
	} // end chooseToppings 
	
} // end DrHillBurgerStand