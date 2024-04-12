package packageaugust1;

/*Write a program that reads a string from the user and then removes all the white spaces from the string.
The program should then print the new string.*/


import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str = sc.nextLine();
		
		System.out.println("Before removing the white spaces string is;" +str);
		
		str = str.replaceAll("\\s", "");
		
		System.out.println("After removing the white spaces string is;" +str);
		
		
		
		
	}

}
