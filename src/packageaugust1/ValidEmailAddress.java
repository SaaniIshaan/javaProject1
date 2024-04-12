package packageaugust1;

/*Write a program that reads a string from the user and then checks whether it is a valid email address or not. 
The program should print "true" if the string is a valid email address and "false" otherwise.*/


import java.util.Scanner;

public class ValidEmailAddress {

	static String regex ="^[a-zA-Z0-9._%+-]+@[a-zA-z0-9._]+\\.[a-zA-Z]{2,6}$";
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your email address");
		
		String email;
		email = in.next();
		
		boolean result = true;
		
		if(email.matches(regex)) {
			System.out.println("\n email ID is valid");
			System.out.println("Validation result is true");
		}
		else {
			result = false;
			
			System.out.println("\n email ID is not valid");
			System.out.println("Validation result is false");
		}
		
		}
		
		
	}


