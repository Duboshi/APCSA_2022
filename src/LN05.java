/*
 * Lecture note 05
 * Array, for-each loop
 */

import java.util.Arrays;

public class LN05 {
	public static void main(String[] args) {
		//Array, elements, declaration
		int[] a = new int[5];
		//declaration of an array named a with 4 int elements

		//type[] name = new type[length];

		//the index of an array start from 0, ends at length-1.
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		//Array traversal: looping through all elements of an array
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");	
		}
		System.out.println();

		int[] b = a;
		a[0] = 2;
		printArray(a);
		printArray(b);
		//a and b are alias of the same array
		//Now a is {2, 2, 3, 4, 5}, b refers to the same array

		int[] c = {3, 2, 3, 4, 5};
		//c = {4, 2, 3, 4, 5};
		//arrays constants can only used in initializers

		int[] d = new int[6];
		for (int i=0; i<d.length; i++) {
			d[i] = (i+1)*(i+1);
		}
		printArray(d);
		//Enhanced for loop (for-each loop)
		printArray2(d);
		//Now d is {1, 4, 9, 16, 25}

		//Complete search in an Array
		//now b is {2, 2, 3, 4, 5}
		//Using for loop
		System.out.println(searchFor(b, 2));	//return 2, since 2 appears for 2 times in b
		//Using enhanced for (for-each) loop
		System.out.println(searchFor(b, 3));	//return 1, since 1 appears for 1 time in b
		
		//Complete search in an array: return the max value in array or 2D array
		//Array using for loop
		System.out.println(maxIn(c));				//c is {3,2,3,4,5}, return 5
		//Array using enhanced-for (for-each) loop
		System.out.println(maxIn2(d));				//d is {1,4,9,16,25,36}, return 46

		//Enhanced for loop cannot change the array elements
		//now c is {3,2,3,4,5}
		increByOne(c);
		printArray(c);	//{4,3,4,5,6}, each elements has increased
		increByOne2(c);
		printArray(c);	//{4,3,4,5,6} no change
		
		//2D Array
		int[][] mat1 = new int[2][5];
		for(int i=0; i<mat1.length; i++)
			for(int j=0; j<mat1[0].length; j++)
				mat1[i][j] = 5*i + (j+1);
		printArray(mat1);
		printArray2(mat1);
		printArray(mat1[0]);
		printArray(mat1[1]);
		
		int[][] mat2 = {{1,2,3},{4,5,6},{4,5,6}};
		printArray(mat2);
		
		//Complete search in a 2D Array
		//using for loop
		System.out.println(searchFor(mat2, 5));		//return 2
		//using enhanced for (for-each) loop
		System.out.println(searchFor2(mat2, 3));	//return 1
		
		//2D array traversal using for loop
		System.out.println(maxIn(mat1));			//return 10
		//2D array traversal using enhanced-for (for-each) loop
		System.out.println(maxIn2(mat2));			//return 6		
	}

	public static void printArray(int[] arr) {
		System.out.print(arr + ": ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}	
		System.out.println();
		//System.out.print("\n");
	}

	public static void printArray2(int[] arr) {
		System.out.print(arr + ": ");
		//Enhanced for loop (for-each loop)
		for (int n:arr) 
			System.out.print(n + " ");
		System.out.println();
	}

	public static void printArray(int[][] mat) {
		System.out.println(mat + ": ");
		for(int i=0; i<mat.length; i++) {
		//i is index of rows, m.length is number of rows
			for(int j=0; j<mat[0].length; j++)
			//j is index of columns, m[0].length is number of columns
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}	
	}
	
	public static void printArray2(int[][] mat) {
		System.out.println(mat + ": ");
		for(int[] row:mat) {
			for(int num:row)
				System.out.print(num + " ");
			System.out.println();
		}	
	}
	
	public static int searchFor(int[] arr, int n) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == n)
				count++;
		}
		return count;
	}
	
	public static int searchFor2(int[] arr, int n) {
		int count = 0;
		for(int num:arr)
			if (num == n)
				count++;
		return count;
	}
	
	public static int searchFor(int[][] mat, int n) {
		int count = 0;
		for(int i=0; i<mat.length; i++)
			for(int j=0; j<mat.length; j++)
				if(mat[i][j] == n)
					count++;
		return count;
	}
	
	public static int searchFor2(int[][] mat, int n) {
		int count = 0;
		for(int[] row:mat)
			for(int num:row)
				if(num == n)
					count++;
		return count;
	}
	
	public static int maxIn(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}
	
	public static int maxIn2(int[] arr) {
		int max = arr[0];
		for(int num:arr)
			if (num > max)
				max = num;
		return max;
	}
	
	public static int maxIn(int[][] mat) {
		int max = mat[0][0];
		for(int i=0; i<mat.length; i++)
			for(int j=0; j<mat[0].length; j++)
				if (mat[i][j] > max)
					max = mat[i][j];
		return max;
	}
	
	public static int maxIn2(int[][] mat) {
		int max = mat[0][0];
		for(int[] row:mat)
			for(int num:row)
				if (num > max)
					max = num;
		return max;
	}
	
	public static void increByOne(int[] arr) {
		for(int i=0; i<arr.length; i++)
			arr[i]++;
 	}
	
	public static void increByOne2(int[] arr) {
		for(int num:arr)
			num++;
//		for(int i=0; i<arr.length; i++) {
//			int num = arr[i];
//			num++;
//		}
		
		//for-each loop (enhanced for loop) cannot be
		//used to change array elements
		
 	}
}





