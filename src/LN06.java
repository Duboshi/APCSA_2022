/*
 * Lecture note 06 2D array
 */

public class LN06 {

	public static void main(String[] args) {
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
	

}
