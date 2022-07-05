/*
 * Lecture note 08 ArrayList
 * return value of add(), set(), remove(),
 */

import java.util.*;

public class LN08 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(0);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		printList(nums);
		System.out.println();
		
		ArrayList<Integer> nums1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		nums1.add(0, 999);
		printList(nums1);
		System.out.println();
		//999, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		
		nums1.set(0, 888);
		printList(nums1);
		System.out.println();
		//888, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		
		nums1.remove(0);
		printList(nums1);
		System.out.println();
		//1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		
		System.out.println(nums1.get(8));	//9
		System.out.println(nums1.size());	//10
		System.out.println();
		
		ArrayList<Integer> nums2 = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4));
		//1, 1, 2, 2, 3, 3, 4, 4
		
		remDups(nums2);
		System.out.println();
		//1, 2, 3, 4
		
	}
	
	public static void printList(ArrayList l) {
		for (int i=0; i<l.size(); i++)
			System.out.printf("l.get(%d) = %d, l.size() = %d\n", i, l.get(i), l.size());		
	}
	
	//remove duplicate consecutive elements
	//{1, 1, 2, 2, 3, 3, 4, 4} => {1, 2, 3, 4}
	//{1, 2, 3, 4, 1, 2, 3, 4} => no change
	public static void remDups(ArrayList<Integer> nums) {
		for(int i=0; i<nums.size()-1; i++) {
			if (i+1<nums.size() && nums.get(i).equals(nums.get(i+1))) {
				nums.remove(i);
			}
		System.out.printf("l.get(%d) = %d, l.size() = %d\n", i, nums.get(i), nums.size());
		}
	}	
	
	
	
	
	
	
	
	
	
}