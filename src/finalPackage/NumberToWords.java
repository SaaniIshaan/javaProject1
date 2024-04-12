package finalPackage;

import java.util.Scanner;

public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number");
		int number = sc.nextInt();
		int input = 0;
		while(number > 0) {
			input = input*10 + number%10;
			number = number/10;	
		}
		int output = 0;
		while(input > 0) {
			output = input % 10;
			input = input/10;
		
			String word;
			switch (output) {
			
			 case 0 :
				 System.out.println("zero");
				 break;
			 case 1 :
				 System.out.println("one");
				 break;
			 case 2 :
				 System.out.println("two");
				 break;
			 case 3 :
				 System.out.println("three");
				 break;
			 case 4 :
				 System.out.println("four");
				 break;
			 case 5 :
				 System.out.println("five");
				 break;
			 case 6 :
				 System.out.println("six");
				 break;
			 case 7:
				 System.out.println("seven");
				 break;
			 case 8 :
				 System.out.println("eight");
				 break;
			 case 9 :
				 System.out.println("nine");
				 break;
			
				  }
			}
	}
		
		
}


