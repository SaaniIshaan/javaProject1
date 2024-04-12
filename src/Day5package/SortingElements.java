package Day5package;

import java.util.Arrays;

public class SortingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach1
		
		int a[] = {30,50,20,10,60};
		System.out.println("Array element before sorting:" +Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array element after sorting:" +Arrays.toString(a));
		
		//Approach2
		
	/*	int a[]= {30,50,20,10,60};
		System.out.println("Array element before sorting:" +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array element after sorting:" +Arrays.toString(a));
		
		//Reverse Descending order
		
		Integer a[]= {30,50,20,10,60};
		System.out.println("Array element before sorting:" +Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array element after sorting:" +Arrays.toString(a));
		*/
		
		
	}	

}
