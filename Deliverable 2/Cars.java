package Project;

public class Cars {
	private final String make;
	private final String model;
	private final String price;
	
	public Cars(String incfName, String inclName, String incEmail) {
		this.make = incfName;
		this.model = inclName;
		this.price = incEmail;
	} // end ctor
	
	
	public String HTMLCars() {
		return "<select>"
				+ "<option>" + this.make + this.model + this.price + "</option>"
				+ "<option>" + this.make + this.model + this.price + "</option>"
				+ "<option>" + this.make + this.model + this.price + "</option>"
				+ "<option>" + this.make + this.model + this.price + "</option>"
				+"<option>" + this.make + this.model + this.price + "</option>"
				+ "</select>";
	} // end toHTML
} // end Account