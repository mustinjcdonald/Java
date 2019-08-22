package class22;

public class Account {
	private final String fName;
	private final String lName;
	private final String email;
	
	public Account(String incfName, String inclName, String incEmail) {
		this.fName = incfName;
		this.lName = inclName;
		this.email = incEmail;
	} // end ctor
	
	@Override
	public String toString() {
		return "{\"fname\":\"" + this.fName + "\", \"lname\":\"" 
				+ this.lName + "\", \"email\":\"" + this.email + "\"}";
	} // end toString
	
	public String toHTML() {
		return "<tr><td>First name: </td><td>" + this.fName + "</td></tr>"
				+ "<tr><td>Last name: </td><td>" + this.lName + "</td></tr>"
				+ "<tr><td>Email: </td><td>" + this.email + "</td></tr>";
	} // end toHTML
} // end Account