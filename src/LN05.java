/*
 * Lecture note 05 1D Array, for-each loop
 */

import java.util.Arrays;

public class LN05 {
	public static void main(String[] args) {
		//Array, elements, declaration
		
		//type[] name = new type[length];
		int[] a = new int[5];
		//declaration of an array named a with 5 int elements

		//the index of an array start from 0, ends at length-1.
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		//https://www.luogu.com.cn/problem/P1428

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
	}

	public static void printArray(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}	
		System.out.println();
		//System.out.print("\n");
	}

	public static void printArray2(int[] arr) {
		//Enhanced for loop (for-each loop)
		for (int n:arr) 
			System.out.print(n + " ");
		System.out.println();
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