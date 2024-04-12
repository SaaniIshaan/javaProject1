package newpackage;

import java.util.Scanner;

public class UppercaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String s = sc.nextLine();
		try {
			
		System.out.println(s.toUpperCase(null));
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException caught");
			e.printStackTrace();
		}	
	}

}
