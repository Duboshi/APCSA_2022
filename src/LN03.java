/*
 * Lecture note 03 Value method
 * 
 * value method vs. void method, return type, 
 * method overloading, recursion
 */

public class LN03 {
	public static void main(String[] args) {
		//void method: printAbs that returns nothing
		//value method: abs that returns int
		printAbs(-5);					//void method
		//System.out.println(printAbs(-6));
		abs(-10);						//the result will not be printed
		System.out.println(abs(-8));	//value method
		
		//void method: isPos that prints true/false
		//value method: boolPos that returns boolean
		isPos(-5);
		System.out.println(boolPos(8));
		System.out.println(boolPos(8.8));
		
		//Recursion: a method invokes itself
		abs(abs(-6));						//nothing will be printed
		System.out.println(abs(abs(-6)));	//6 will be printed
		System.out.println(factorial(5));
		countDown(5);
		countUp(5);
	}
	
	//printAbs is a void method that returns nothing
	//void means the method does not return anything
	public static void printAbs(int n) {
		if(n>=0)
			System.out.println(n);
		else
			System.out.println(-n);
	}
	
	//abs is a value method that returns int
	//int is the return type of method abs
	public static int abs(int n) {
		if(n>=0)
			return n;
		else
			return -n;
	}
	
	public static void isPos(int n) {
		System.out.println(n>0);
	}
	
	//Method overloading方法重载:
	//the following three methods with the same name but different
	//parameters are overloaded methods
	
	//we cannot have two methods with identical name and parameter list
	//but different return types.
	public static boolean boolPos(int n) {
		return n>0;
	}
	
//	public static boolean boolPos(int m) {
//		return m>0;
//	}
	
//	public static int boolPos(int n) {
//		return n;
//	}
	
	public static boolean boolPos(double a) {
		return a>0;
	}
	
	public static boolean boolPos(int n, int m) {
		return n>0 && m>0;
	}
	
	//for n>=0
	public static int factorial(int n) {
		if(n>0)
			return n * factorial(n-1);
		else
			return 1;
	}
	
	//for n>=1
	public static void countDown(int n) {
		if(n>0) {
			System.out.println(n);
			countDown(n-1);
		}
		else
			System.out.println("GO!!!");
	}
	
	public static void countUp(int n) {
		if(n>0) {
			countUp(n-1);
			System.out.println(n);
		}
		else
			System.out.println("GO!!!");
	}
}
