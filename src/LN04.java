/*
 * Lecture note 04 while loop and for loop
 */

public class LN04 {
	public static void main(String[] args) {
		//countdown with recursion
		countdown(5);
		
		//while(condition) {Statements;}
		//while condition is true, Statements will be executed repeatedly
		countdown1(6);
		
		//1 2 3 4 5 6 7 8 9
		printRow1(1, 9); 
		
		//2 4 6 8 10
		printRow1(2, 5);
		
		//for (initial; condition; update) {Statements;}
		//While condition is true, Statements will be executed repeatedly
		countdown2(4);
		
		//1 2 3 4 5 6 7 8 9
		printRow2(1, 9); 
		
		//2 4 6 8 10
		printRow2(2, 5);
		
		//while {while}
		printTable1(9, 9);
		
		//for {for}
		printTable2(8, 8);		
	}
	
	public static void printRow1(int r, int c) {
		int i = 1;
		while(i<=c) {
			System.out.print(r*i + " ");
			i++;	//meaning i = i+1;
		}
		System.out.println();
	}
	
	public static void printRow2(int r, int c) {
		for(int i=1; i<=c; i++) {
			System.out.print(r*i + " ");
		}
		System.out.println();
	}
	
	public static void printTable1(int r, int c) {
		int i=1;
		while (i<=r) {
			int j=1;
			while (j<=c) {
				System.out.printf("%3d", i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void printTable2(int r, int c) {
		for (int i=1; i<=r; i++) {
			for (int j=1; j<=c; j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
	}
	
	public static void countdown(int n) {
		if(n>0) {
			System.out.println(n);
			countdown(n-1);
		}
		else
			System.out.println("GO!!!");
	}
	
	public static void countdown1(int n) {
		while (n>0) {
			System.out.println(n);
			n--;	//meaning n = n-1;
		}
		System.out.println("GO!!!");
	}

	public static void countdown2(int n) {
		for (int i=n; i>0; i--) {
			System.out.println(i);
		}
		System.out.println("GO!!!");
	}	
}
