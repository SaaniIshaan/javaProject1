package Day4package;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num = sc.nextInt();
		
	/*	int org_num = num;
		
		int rev = 0;
		
		while(num != 0)
		{
			rev = rev*10 + num%10;   //0 +1234%10 = 4   40+3=43   430+2 = 432  4320+1 = 4321
			num = num/10;    // 1234/10  123/10  12/10  1/10
		}
		if(org_num == rev)
		{
			System.out.println(org_num+ " Palindrome number");
			
		}
		else
		{
			System.out.println(org_num+ "  Not Palindrome number");
			
		}*/
		
		int org_num = num;
		int rev = 0;
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;
		}
		 if(org_num ==rev){
		 System.out.println(org_num + " Palindrome number");
		 
		 }
		 else 
		 {
			 System.out.println(org_num + " not a Palindrome number");
		 }
	}


}
