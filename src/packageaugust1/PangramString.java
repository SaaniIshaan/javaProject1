package packageaugust1;
/*Write a program that reads a string from the user and then checks whether it is a pangram or not.
A pangram is a string that contains all the letters of the alphabet.*/

import java.util.Scanner;

public class PangramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		/*String str = s.nextLine().toLowerCase().trim();
		
		boolean isPangram = true;
		
		for(char ch ='a'; ch<='z';ch++) {
				if(!str.contains(Character.toString(ch)))
				{
					isPangram =false;
					break;
				}
		}
		if(isPangram) {
			System.out.println("String is Pangram");
		}
		else
		{
			System.out.println("String is not Pangram");
		}*/
		
		String str = s.next();
		boolean isPangram = true;
		
		for(char ch='a';ch<='z';ch++) {
			if(!str.contains(Character.toString(ch)))
			{
				isPangram = false;
				break;
			}
		}
		if(isPangram) {
			System.out.println("String is Pangram");
			}
		else {
			System.out.println("String is not Pangram");
		}
		}
	}


