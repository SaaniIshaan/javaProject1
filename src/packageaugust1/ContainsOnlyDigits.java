package packageaugust1;

/*Write a program that reads a string from the user and 
then checks whether it contains only digits or not. The program should print "true" if 
the string contains only digits and "false" otherwise.*/


import java.util.Scanner;

public class ContainsOnlyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Scanner sc = new Scanner(System.in);
		
	//	System.out.println("Enter a String");
		
	/*	String value = sc.nextLine();
		
		
		boolean isDigitFound = false;
		
		char[] chars = value.toCharArray();
		for(char ch:chars) {
			if(Character.isDigit(ch)) {
				isDigitFound = true;
				break;
			}
		}
		
		if(isDigitFound) {
			System.out.println("\n the string contains a digits");
		}
		else {
			System.out.println("\n the string doesn't contain a digits");
		}*/
		
	/*	String value = sc.next();
		boolean isDigitFound =false;
		char[] a = value.toCharArray();
		for(char b :a) {
			if(Character.isDigit(b)) {
				isDigitFound = true;
				break;
			}
		}
		if(isDigitFound) {
			System.out.println("\n the string contains a digit");
		}
		else {
			System.out.println("\n the string does not contain a digit");
		}*/
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = input.nextLine();
		
		input.close();
		
		if(s1.matches("\\d+")) {
			System.out.println("String contains only digits");
		}
		else {
			System.out.println("String does not contain only digits");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
