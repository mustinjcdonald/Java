package class16;

public abstract class Human {
	private String fName;
	private String lName;
	private String bearID;
	
	public Human(String fName, String lName, String bearID) {
		this.fName = fName;
		this.lName = lName;
		this.bearID = bearID;
	} // end ctor
	
	@Override
	public abstract String toString();
	
	public abstract String doQuiz();

	public String breathe() {
		return this + " breathes.";
	} // end breathe
	
	public String getBearID() {
		return this.bearID;
	} // end getBearID
	
	public String getfName() {
		return this.fName;
	} // end getfName
	
	public String getlName() {
		return this.lName;
	} // end getlName
	
} // end Human