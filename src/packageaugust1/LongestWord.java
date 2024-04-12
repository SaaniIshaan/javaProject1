package packageaugust1;
import java.util.Scanner;
/*Write a program that reads a string from the user and then finds the longest word in the string. 
The program should print the length of the longest word and the word itself.*/

public class LongestWord {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String findLongstr = " ";
		int size = 0;
		if(sc.hasNext())
		{
			findLongstr = sc.nextLine();
		}
		FindLongestword(findLongstr);
		sc.close();
	
	
	System.out.println("Longest word in string is:"+findLongstr);
	System.out.println("size of the longest word is:"+size);
	}
	
	
	private static void FindLongestword(String findLongstr) {
		String[] splitstr = findLongstr.split(" ");
		String longeststr = null;
			
		int size = 0;
		for(int i =0;i<splitstr.length;i++)	{
			if(splitstr[i].length()>size){
					size = splitstr[i].length();
					longeststr = splitstr[i];
			}
		}			
	}	
		//	System.out.println("Longest word in string is:"+longeststr);
		//	System.out.println("size of the longest word is:"+size);
}