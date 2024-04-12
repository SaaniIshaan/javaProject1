package packageaugust1;
	
/*Write a program that reads a string from the user and then replaces all the vowels in the string with the letter 'x'. 
The program should then print the new string.*/


import java.util.Scanner;

public class ReplaceVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = in.nextLine();
		
		String newStr = "";
		int len = str.length();
		for(int i =0; i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='A'|| ch=='e'|| ch=='E'|| ch=='i'|| ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				char nextch = 'x';
				newStr = newStr+nextch;
				}
			else
				newStr = newStr+ch;
		}
			System.out.println("New string =" +newStr);
		
	}
}
