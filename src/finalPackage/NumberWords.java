package finalPackage;

import java.util.Scanner;

public class NumberWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,23,45,4,3,23};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		int counter = 0;
		for(int i=0;i<a.length; i++) {
			if (a[i]==n) {
				counter++;
			}	
		}
		System.out.println("occurance of the number " +n+ " are " +counter);
	}

}
