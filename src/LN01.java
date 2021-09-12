/*
 * Lecture note 01
 * @Author: Dubos
 * Introduction to Java Programming
 */

//comment注释

public class LN01 {	//class类

	public static void main(String[] args) {	//method方法（函数）
		System.out.println("Hello World!");		//statement语句
		
		int n;		//Declaration声明/建立 of an int (type) variables named n
		n = 5 + 3;	//Assignment赋值
		System.out.println(n);
		n = n * 4;	//Assignment
		System.out.println(n);
		
		double x = 5.5;
		double y = 2.2;
		System.out.println(x + y);
		
		//Primitive types: double浮点数/实数/小数, int整型变量（整数）
		System.out.println(x + y); //+, -, *, /
		n = 8;
		int m = 5;
		
		//Arithmetic operators: + - * / %
		System.out.println(8/5); 	//integer division
		System.out.println(8/5.0);
		System.out.println(8%5); 	//modulus operator, remainder of 8 divided by 5
		System.out.println(8%(-5));	//3
		System.out.println((-8)%5);	//-3, same sign as the dividend, not as divisor
		System.out.println(x%y); 	//round-off error
		
		System.out.println(0.1 + 0.1);
		System.out.println(0.1 + 0.1 + 0.1);	//round-off error
		
		//String字符串
		String s1 = "Ai", s2 = "Zeng";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1 + s2);	//concatenation of strings
		
		//Escape sequence and formatted print
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
	}
	
	public static void doSomething() {
		
	}
}