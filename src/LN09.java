/*
 * Lecture note 09 Class and Object
 * With BankAccount
 */

public class LN09 {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		BankAccount c = new BankAccount("888888", 100);
		//Class: BankAccount
		//An object对象 is an instance实例 of a class.
		//(The words object and instance are interchangeable.)
		BankAccount f = c;
		//f and c are alias别名（不同的名字） references referring to the same object.
		
		System.out.println(b.getBalance(""));
		System.out.println(c.getBalance("888888"));
		
		b.deposit(5);
		System.out.println(b.getBalance(""));
		
		b.withdraw("", 8);
		System.out.println(b.getBalance(""));
		
		System.out.println(BankAccount.PENALTY);
		System.out.println(b.PENALTY);

		BankAccount.showPENALTY();
		b.showPENALTY();
		
		//toString
		System.out.println(b);
		System.out.println(c);
		
		BankAccount[] arr = new BankAccount [5];
		for (int i=0; i<=3; i++) {
			arr[i] = new BankAccount("123456", 20);
		}
		arr[4] = null;
		
//		for (int i=0; i<5; i++) {
//			System.out.println(arr[i].getBalance("123456"));
//		}
		//a[4].getBalance("123456") will cause a NullPointerException
		
		//Passing primitive types as parameter
		int m = 1, n = 2;
		changeNot(m, n);		//100 200
		System.out.println(m);	//1
		System.out.println(n);	//2
		
		//Passing objects as parameters
		BankAccount M = new BankAccount("123456", 1);
		BankAccount N = new BankAccount("123456", 2);
		changeYes(M, 100);
		changeYes(N, 200);
		System.out.println(M);
		System.out.println(N);
	}
	
	public static void changeYes(BankAccount a, double x) {
		//BankAccount a = M; creates alias for BankAccount M
		a.deposit(x);
		System.out.println(a);
	}
	
	public static void changeNot(int a, int b) {
		a = 100;
		System.out.println(a);
		b = 200;
		System.out.println(b);
	}
}
