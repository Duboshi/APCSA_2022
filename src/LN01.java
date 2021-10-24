/*
 * Lecture note 01
 * Introduction to Java Programming
 * 
 * Block comment段落注释
 */

//line comment行内注释

import java.util.Scanner;							//Step 1 of input

public class LN01 {	//class类
	private static Scanner in;						//Step 2 of input

	public static void main(String[] args) {		//method方法（函数）
		System.out.println("Hello World!");			//statement语句
		
		int n;
		//Declaration声明/建立 of an int (type) variables named n
		n = 5 + 3;									//Assignment赋值
		System.out.println(n);
		n = n * 4;									//Assignment
		System.out.println(n);
		
		double x = 5.5;
		double y = 2.2;
		System.out.println(x + y);
		
		//Primitive types: double浮点数/实数/小数, int整型变量（整数），boolean布尔变量（真伪）
		System.out.println(x + y); //+, -, *, /
		n = 8;
		int m = 5;
		
		//Arithmetic operators: + - * / %
		System.out.println(8/5); 					//integer division
		System.out.println(8/5.0);
		System.out.println(8%5); 					//modulus operator, remainder of 8 divided by 5
		System.out.println(8%(-5));					//3
		System.out.println((-8)%5);					//-3, same sign as the dividend, not as divisor
		System.out.println(x%y); 					//round-off error
		
		System.out.println(0.1 + 0.1);
		System.out.println(0.1 + 0.1 + 0.1);		//round-off error
		
		//Assignment operator
		n = 6;
		n *= 3;
		System.out.println(n);		//18. n*=3 means n = n*3. The same applies to +=, -=, /=, %=
		n %= 5;
		System.out.println(n);		//3
		
		//String字符串
		String s1 = "Ai", s2 = "Zeng";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1 + s2);						//concatenation of strings
		System.out.println(1 + 2 + "String");				//3String
		System.out.println("String" + 1 + 2);				//String12
		
		//Escape sequence转义字符 and formatted print格式输出
	    System.out.print("Hello, Senior 3~\n"); 			//escape sequence \n, backslash
	    System.out.println("He said \"Hello, World!\""); 	// escape sequence\"
	    System.out.println("\\^0^/"); 						// escape sequence\\
	        
	    System.out.println("Chapter 01");
	    System.out.println("\tSection a");
	    System.out.println("\t\tParagraph");    			// escape sequence\t
	    System.out.println("\tSection b");
	    
	    int hour = 11, min = 10, snd = 7;
        System.out.println(hour + ":" + min + ":" + snd);
        System.out.printf("%02d:%02d:%02d\n", hour, min, snd);
        System.out.printf("%2d:%2d:%2d\n", hour, min, snd);
        //printf method: %d, %2d, %02d, %f, %2f, %02f
        
        //0x: octal八进制，1 2 3 4 5 6 7 10 11
        double percent;
        int sum = 3600*hour + 60*min + snd;
        System.out.println(sum);
        percent = sum/86400.0;
        System.out.println(percent);
        //Compile-time error, run-time error, logic error
        //System.out.println(5/0);
        
        //input and Scanner.in
		in = new Scanner(System.in);				//Step 3 of input
		System.out.println("What is your name?");
		String name = in.nextLine();				//Step 4 of input
		System.out.println("Hello, " + name);
		System.out.println("What is your height in cm?");
		int h = in.nextInt();
		final double cmPerInch = 2.54;				//constant
		final int inchPerFoot = 12;
		int feet = (int)(h/cmPerInch/12);			//type cast
		int inch = (int)(h/cmPerInch%12);
		System.out.println(feet + " feet " + inch + " inches.");
		
		//void method vs. value method
		System.out.println(sum(2, 5));
		voidsum(2, 5);
		System.out.println(sum(1.1, 2.2));

	}
	
	public static int sum(int a, int b) {			//value method which returns an int
		return a + b;
	}
		   
	public static void voidsum(int a, int b) {		//void method
		System.out.println(a + b);
	}
		   
	public static double sum(double a, double b) {  //value method which returns a double
		return a + b;
	}
	

}