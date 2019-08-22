package hw4;

public abstract class BankAccount {
	private String ownerfName;
	private String ownerlName;
	private double balance;
	
	public BankAccount(String incOwnerfName, String incOwnerlName) {
		this.ownerfName = incOwnerfName;
		this.ownerlName = incOwnerlName;
		this.balance = 0.0;
	} // end ctor
	
	public abstract String toString();
	
	public void deposit(double amount) {
		this.balance += amount;
	} // end deposit
	
	public void withdrawal(double amount) {
		this.balance -= amount;
	} // end withdrawal
	
	public String getOwnerfName() {
		return this.ownerfName;
	} // end getOwnerfName
	
	public String getOwnerlName() {
		return this.ownerlName;
	} // end getOwnerlName
	
	public double getBalance() {
		return this.balance;
	} // end getBalance
	
} // end BankAccount