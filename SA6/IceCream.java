package SA5;

import java.util.Scanner;

public class IceCream implements Taxable {

	private final String flavor;
	private final String cone;
	private final int scoop;
	public boolean taxable;

	public IceCream(String flavor, int scoop, String cone, boolean taxable) {
		 
	this.flavor = flavor;
	this.scoop = scoop;
	this.cone = cone;
	this.taxable = taxable;
	 
	 } 
	
	public String toString() {
		
		return this.flavor.toLowerCase() + " ice cream with a " + this.cone.toLowerCase() + " cone and " + this.scoop + " scoop";
	}
	
	public String getFlavor() {
		 
		 	return this.flavor;
	}
	
	public int getNumOfScoops() {
		 
		 	return this.scoop;
	}
	
	public String getConeType() {
		
		 	return this.cone;
	}
	
	public boolean isTaxable() {
		
		return this.taxable;
	}
	
}
