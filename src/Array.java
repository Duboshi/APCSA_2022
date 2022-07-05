public class Array {
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
		
		//print the sum of all elements of arr1
		int sum = 0;
		for(int i=0; i<arr1.length; i++) {
			sum += arr1[i];		
			//sum = sum + arr1[i]; 
		}
		System.out.println(sum);
		
		//print the max value in arr1
		int zuida = arr1[0];
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] > zuida) {
				zuida = arr1[i];
			}	
		}
		System.out.println(zuida);
		
		//print the sum of even-index elements
		sum = 0;
		for(int i=0; i<arr1.length; i=i+2) {
			sum = sum + arr1[i];
		}
		System.out.println(sum);
		//1,3,5,7,9 = 25
	}
}