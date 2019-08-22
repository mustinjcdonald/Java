package class13;

public class Person {
	
	public static class PersonBuilder {
		private static String builderfName;
		private static String builderlName;
		private static String builderBearID;
		
		public static Person build() {
			return new Person(builderfName, builderlName, builderBearID);
		} // end build
		
		public static void setfName(String incfName) {
			builderfName = incfName;
		} // end setfName

		public static void setlName(String inclName) {
			builderlName = inclName;
		} // end setfName

		public static void setBearID(String incBearID) {
			builderBearID = incBearID;
		} // end setfName
	} // end PersonBuilder
	
	private final String fName;
	private final String lName;
	private final String bearID;
	
	private Person(String incfName, String inclName, String incBearID) {
		this.fName = incfName;
		this.lName = inclName;
		this.bearID = incBearID;
	} // end ctor
	
	@Override
	public String toString() {
		return this.fName + " " + this.lName + " ID: " + this.bearID;
	} // end toString
} // end Person