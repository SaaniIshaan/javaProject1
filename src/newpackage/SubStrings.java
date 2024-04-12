package newpackage;

import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String s = sc.nextLine();
	
		for(int i =0;i<s.length();i++) {
		System.out.println(s.charAt(i));
		}
		System.out.println(s.length());
		
		 try {
			 
			 System.out.println(s.charAt(30));
			 
		 }
		 catch(StringIndexOutOfBoundsException e) {
			 
			 System.out.println("Exception occured........");
			 e.printStackTrace();
		 }
		 sc.close();
	}

}
