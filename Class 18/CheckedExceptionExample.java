package class18;

public class CheckedExceptionExample {

	public static int doCalculation(int a, int b) throws RangeCheck {
		if (a < 0 || b < 0) {
			throw new RangeCheck("Arguments must be greater than zero!");
		} // end if
		return a/b;
	} // end doCalculation
	
	public static void main(String[] args) {
		try {
			System.out.println(doCalculation(15, -5));
		} catch (RangeCheck e) {
			System.out.println("Oops." + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Oops." + e.getMessage());
		} catch (Exception e) {
			System.out.println("Oops." + e.getMessage());
		} // end catch
		System.out.println("All is operating normally.");
	} // end main

} // end class CheckedExceptionExample