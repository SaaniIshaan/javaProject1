package packageaugust1;

/*Write a program that reads a string from the user and then converts it to title case. 
Title case means that the first letter of each word in the string is capitalized.*/


import java.util.Scanner;

public class TitleCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		
		String str = in.nextLine();
		
		
		String replaceString = str.replaceAll("\\s+"," ").trim();
		System.out.println(replaceString.split(" "));
		
		String[]words = replaceString.split(" ");
		for(String word:words) {
			System.out.println(word.substring(0,1).toUpperCase()+word.substring(1,word.length())+" ");
			
			
		}
		
	}

}
