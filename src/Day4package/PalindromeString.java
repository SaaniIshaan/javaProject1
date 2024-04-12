package Day4package;

/*Write a program that reads a string from the user and checks whether it is a palindrome or not.
A palindrome is a string that reads the same backward as forward.*/



import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your String:");
		
		String str = sc.next();
	/*	String org_str = str;
		
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);			
		}
		
			
		if(org_str.equals(rev)){
			System.out.println(org_str+ " is Palindrome");
		} 
		else {
			System.out.println(org_str+ " is not Palindrome");
		}*/
		
		String org_str = str;
		String rev = "";
		
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(org_str.equals(rev)) {
		System.out.println(org_str+ " is a palindrome string");
		}
		else
		{
			System.out.println(org_str+ " is not a palindrome string");
		}
	}	
}
