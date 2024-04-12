package Day3package;

import java.util.Scanner;

//Q16. Write a method that will remove given character from the String?
public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a word");
		 String str = sc.nextLine();
		 
		 System.out.println("which caracter you want to remove");
		 
		 String ch = sc.nextLine();
		 
		 System.out.println(str.replace(ch, ""));
	}

}
