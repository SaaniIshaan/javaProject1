package packageaugust1;

/*Write a program that reads a string from the user and then finds the longest word in the string. 
The program should print the length of the longest word and the word itself.*/



import java.util.Scanner;

public class LongestWordInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = reader.nextLine();
		
		str += " ";
//		str = str + " " same above
		String word =  "", lword = "";
		int len = str.length();
		
		for(int i =0; i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
				word+=ch;
				System.out.println(word);
			}
			else  
				{	
				if(word.length()>lword.length())
				{
					lword=word;
					word ="";
				}
				else word ="";
			}
		}
			System.out.println("Longest word is :" +lword);
			System.out.println("Length of longest word is :" +lword.length());*/
			
			Scanner reader = new Scanner(System.in);
			System.out.println("enter your String");
			String str = reader.nextLine();
			
			str += " ";
			String word = "", lword= "";
			int len = str.length();
			
			for(int i =0; i<len;i++) {
				char ch = str.charAt(i);
				if(ch!=' ')
				{
					word+=ch;
					System.out.println(word);
				}
				else {
					if(word.length()>lword.length()) {
						lword = word;
						word = "";
					}
					else word ="";
					
				}
				
			}
			System.out.println("Longest word is:" +lword);
			System.out.println("Length of the longest word is:" +lword.length());
			
			
			}
			
		}
		
		
		


