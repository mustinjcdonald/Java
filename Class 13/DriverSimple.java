package class13;

public class DriverSimple {

	public static void main(String[] args) {
		Person.PersonBuilder.setfName("Jeff");
		Person.PersonBuilder.setlName("Hill");
		Person.PersonBuilder.setBearID("B010101234");
		Person me = Person.PersonBuilder.build();
		System.out.println(me);
	} // end main
} // end DriverSimple