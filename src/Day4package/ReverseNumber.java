package Day4package;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name? ");
        String name = sc.nextLine();
        
        System.out.println("What is your age? ");
        int age = sc.nextInt();
        
        System.out.println("Your name is:" +name+ " and age is:" +age);
        sc.close(); 
   

    /*	Scanner reader = new Scanner(System.in);
        
		System.out.println("Enter the first number ");
	    int a = reader.nextInt();
		
		System.out.println("Enter the second number ");
	    int b = reader.nextInt();
	    
	   int sum = (a + b);

		System.out.println("sum of the two numbers is: " +sum);
		
		reader.close();*/
		
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter a number ");
		
	//	int num = sc.nextInt(); //1234
		// 1. using Algorithm
		
			
	/*	int rev = 0;
		
		while(num !=0)
		{
			
			rev = rev*10 + num%10;  // 0+1234 % 10 = 4   40+3 = 43  430+2 =432    4320 + 1 =4321
			
			num = num/ 10;		//1234/10 = 123    123/10 = 12   12/10 = 1   1/10 = 0
			
		}
		System.out.println("Reverse number is: " +rev);*/
		
		int num = sc.nextInt(); //1234
		
		//Using StringBuffer class
		
		StringBuffer sb = new StringBuffer();
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse number is: " +rev); 
		
		 
		//Using StringBuilder class
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev1 = sbl.reverse();
		
		System.out.println("Reverse number is: " +rev1); 
		
		
	}

}