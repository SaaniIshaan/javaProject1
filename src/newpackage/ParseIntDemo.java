package newpackage;

import java.util.Scanner;

public class ParseIntDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		 
		String number = sc.nextLine();
		sc.close();
		
		 try {
			 	int num = Integer.parseInt(number);
		
		System.out.println("you entered:" +number);
		
		
	} catch (NumberFormatException e) {
		
		System.out.println("sorry, You need to enter a number");
		e.printStackTrace();
}
	}
}
