package packageaugust1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = sc.nextLine();
		
		char s1[] = s.toCharArray();
		
		for(int i =0; i<=s1.length-1; i++) {
			
		//	System.out.println(s1[i]);
		}
		String rev = "";
		
		for(int i =s1.length-1; i>=0;i--) {
		
//			System.out.println(s1[i]);
			rev=rev+s1[i];

		}
		System.out.println(rev);
	}
}
