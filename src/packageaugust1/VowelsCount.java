package packageaugust1;

/*Write a program that reads a string from the user and then counts the number of vowels in the string.
The program should print the number of vowels.*/


import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Sentence");
		
		String sentence = s.nextLine();
		
		int count = 0;
		
		for(int i =0; i<sentence.length();i++) {
			
			char ch = sentence.charAt(i);
			
		if(ch=='a'|| ch=='A'||ch=='e'||ch=='E' ||ch =='i'||ch=='I'|| ch=='o'||ch=='O'|| ch =='u'||ch=='U') {
			count++;
		}
		}
		
		System.out.println("Total number of Vowels is:" +count);
		
	}
		
		//	String replace_sentence = sentence.replaceAll("[AEIOUaeiou]", "x");
		//
		//		System.out.println(replace_sentence);
				
//	s.close();		
				
		
		
		
		
		
		
	
}
