package finalPackage;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter the elements in an Array");
			int m = sc.nextInt();
			int []arr = new int  [m];
			
			for (int i=0; i<m; i++) {
				System.out.println("Enter the next elements");
				arr[i] = sc.nextInt();
			}
			int low =0;
			int high = arr.length-1;
			quickSort(arr,low,high);
			displayArray(arr); 
			
			
			System.out.println("Before:");
			displayArray(arr);
			
			QuickSort qs = new QuickSort();
			quickSort(arr,low,high);
			
			System.out.println("\nAfter:");
			displayArray(arr);
			
			quickSort(arr,low,high);
			
	}	
			private static void displayArray(int[] arr) {
		// TODO Auto-generated method stub
				System.out.println("elements before sorting");
	}
			public static void quickSort(int[]arr , int low, int high) {
			if(arr== null || arr.length==0)
			return;
			if(low >= high)
			return;
			int middle = low + (high - low)/2;
			int pivot = arr[middle];
			int i = low, j = high;
			while(i<=j) {
				while(arr[i]< pivot) {
					i++;
				}
				while(arr[j]> pivot) {
					j--;
					
				}
				if(i<=j) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				}
				if(low<j) {
					quickSort(arr,low,j);
					if(high>i) {
						quickSort(arr,high,i);
					}
				}
			
			
			
	}	
			
}		
}			
	
	

