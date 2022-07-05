/*
 * With Lecture note 09 (Class and Object)
 */

public class BankAccount {
	//variables
	private String password;
	private double balance;
	public static final double PENALTY = 10.0;

	//constructors: default constructor
	public BankAccount() {
		password = "";
		balance = 0;
	}
	
	//constructors: value constructor
	public BankAccount(String p, double b) {
		password = p;
		balance = b;
	}	
	
	//methods: accessor
	public double getBalance(String p1) {
		if(p1.equals(this.password))
			return this.balance;
		
		return -987654321;
	}
	
	//methods: mutator
	public void deposit(double x) {
		this.balance += x;
	}
	
	//methods: mutator
	public void withdraw(String s,double x) {
		if(s.equals(this.password)) {
			this.balance -= x;
			if (this.balance < 0.0)
				this.balance -= PENALTY;
		} else {
			System.out.println("INCORRECT PASSWORD.");
		}
	}
	
	public String toString() {
		return this.password + " " + this.balance;
	}
	
	//Static method
	public static void showPENALTY() {
		System.out.println(PENALTY);
	}
}






