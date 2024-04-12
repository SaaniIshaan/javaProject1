package packageaugust1;
 
/* Write a program that reads two strings from the user and 
checks whether they are anagrams or not. Anagrams are two strings
that contain the same characters in a different order. */


import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the first String");
		 String x = reader.next();
		
		System.out.println("Enter the Second String");
		String y = reader.next();
		
		char a[] = x.toCharArray();
		char b[] = y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		
		if(result == true)
		{
			System.out.println("Strings are Anagram");
		}
		 
		else
		{
			System.out.println("Strings are not Anagram");
		}
		
		
		
		
		
	}

}
