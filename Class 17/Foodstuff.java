package class17;

public class Foodstuff extends Product implements Taxable {

	public Foodstuff(String incName, double incPrice) {
		super(incName, incPrice);
	} // end ctor

	@Override
	public double calcSalesTax() {
		return this.getPrice() * Taxable.SALESTAXRATE;
	} // end calcSalesTax
} // end Foodstuff