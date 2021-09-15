/*
 * Lecture note 02
 * Boolean, Logic, If-else statements
 */

public class LN02 {

	public static void main(String[] args) {
		
		//Relational operators
		boolean b = 5>0;
		p(b);
		p(0 < 5);
		p(0 >= 0);
		p(0 <= 0);
		p(5 == 10 / 2);				// arithmetic > relational
		p(5 != 0);
		p(0.3 == 0.1 + 0.1 + 0.1);	//false, round-off error
		
		p("Ai".equals("Zeng"));		//false
		p("Ai".compareTo("Zeng"));	//-25
		
		//Logical operators
		boolean t = true;
		boolean f = false;
		p(t || 5/0==2); //t or 5<0, after "true or" are dead code
		p(f && 5/0==2); //f and 5>0, after "false and" are dead code
		p(!t);	//not true
		
		p(!(t && f));	//true,
		p(!t && f);		//false, indicating: Logic! > Relational &&, ||
		
		//De Morgan's Law
		//1. !(a&&b) == !a || !b
		//2. !(a||b) == !a && !b
		
		//Operator precedence
		//Logic! > Arithmetic*/% > Arithmetic+- > Relational > Logic && || > Assignment
		int n = 6;
		p(!t || 3*(n/=2)==9);	//(not true) or (true), the result is true
		
		//if-else
		//Final Exam: A90, B80, C70, D60
		grade1(93);	//A
		grade2(93);	//A
		grade3(93);	//A
		grade4(93);	//A B C D
	}
	
	public static void p(Boolean b) {
		System.out.println(b);
	}
	
	public static void p(int n) {
		System.out.println(n);
	}
	
	public static void p(double x) {
		System.out.println(x);
	}
	
	public static void p(String s) {
		System.out.println(s);
	}
	
	public static void grade1 (int n) {
		//This is the standard solution
		if (n>=90) {
			System.out.println("A");
		} else {
			if (n>=80) {
				System.out.println("B");
			} else {
				if (n>=70) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			}
		}
	}
	
	public static void grade2 (int n) {
		//The braces {} are optional for branches that have only one statement.
		//grade2 is exactly the same as grade1, with braces {} omitted, 
		//since every branch has only one statement.
		if (n>=90)
			System.out.println("A");
		else
			if (n>=80)
				System.out.println("B");
			else
				if (n>=70)
					System.out.println("C");
				else
					System.out.println("D");
	}
	
	public static void grade3 (int n) {
		//grade3 is also the same as grade1, but with poor coding style.
		//grade3 may be used in the AP Exam as a challenge to the students.
		//In cases like this, every "else" corresponds to the "if" that is closest to it.
		if (n>=90) {
			System.out.println("A");
		} else if (n>=80) {
			System.out.println("B");
		} else if (n>=70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
	
	public static void grade4 (int n) {
		//grade4 is not the intended solution for n
		if (n>=90)
			System.out.println("A");
		if (n>=80)
			System.out.println("B");
		if (n>=70)
			System.out.println("C");
		if (n>=60)
			System.out.println("D");
	}

}
