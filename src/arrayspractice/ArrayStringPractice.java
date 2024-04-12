package arrayspractice;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	double[]arr = {4.5, 9.65, 68.4,14.45,0.16};
		long W[] = new long [arr.length];
		double F[] = new double [arr.length];
		for( int i = 0; i< arr.length; i++) {
			W[i] = (long)arr[i];
			F[i] = 	arr[i]-W[i]	;
			System.out.println(W[i]+ " " +F[i]);
		}*/
		
		String[]name = {"Sam", "Maya","Joe","Ronit","Nihir"};
		int[]num = {92, 82, 85, 91, 94};
		int n = name.length;
		for(int i = 0;i < n-1; i++) {
			for(int j= 0; j< n-1; j++) {
				if(num[j]>num [j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					
					String T = name[j];
					name[j] = name[j+1];
					name[j+1] = T;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(name[i]+ " " + num[i]);
		}
		
	/*	int []arr1 = {81,82,83};
		int arr2[] = {91,92,93,94};
		int[]arr3 = new int [arr1.length + arr2.length];
		int k = 0;
		for (int i = 0; i< arr1.length; i++) {
			arr3[k++] = arr1[i];
			}
		for(int i = 0; i< arr2.length;i++) {
			arr3[k++] = arr2[i];
			}		
		for(int i = 0; i< arr3.length;i++) {
			System.out.println(arr3[i]);
			}	*/	
		int[]arr4 = {81,82,83,91,92,93};
		int evencount = 0;
		int oddcount = 0;
		for(int i =0; i<arr4.length; i++) {
			if(arr4[i]% 2 ==0) {
				evencount++;
			}
			else {
				oddcount++;
				}
			}
		int arr5[] = new int[evencount],j = 0;
		int arr6[] = new int[oddcount],K = 0;
		for(int i = 0; i<arr4.length; i++) {
			if(arr4[i]%2 ==0) {
				arr5[j++] = arr4[i];
				}
			else {
				arr6[K++] = arr4[i];
			}
		}
		System.out.println("Even array is:" +Arrays.toString(arr5));
		System.out.println("Odd array is:" +Arrays.toString(arr6));
	}		
}