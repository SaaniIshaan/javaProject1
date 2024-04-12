package practiceday1;

import java.util.Scanner;

public class PracticeBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		if(num1 == num2) 
			System.out.printf("%d == %d\n",num1, num2);
	
		if(num1 != num2) 
			System.out.printf("%d != %d\n",num1, num2);
		
		if(num1 < num2) 
			System.out.printf("%d < %d\n",num1, num2);
		
		if(num1 > num2) 
		System.out.printf("%d > %d\n",num1, num2);
	
		if(num1 >= num2) 
			System.out.printf("%d >= %d\n",num1, num2);
	
		if(num1 <= num2) 
			System.out.printf("%d <= %d\n",num1, num2);*/
		
		// sum of digits
	/*	int num = 12345;
		int sum = 0;
		while(num>0) {
			sum = sum+num%10; //4,3,2,1
			num = num/10;	//123,12,1
		}
		System.out.println("Sum of digits is:" +sum);
		//sum of array
	/*	 int []a = { 2,3,5,6,7,8};
		
		for(int i= 0; i <a.length; i++) {
		int sum1 = 0;
		sum1 = sum1 + a[i];
		System.out.println("sum of the array elements is:" +sum1);
		
		}*/
		// for count letters, spaces,numbers,other characters
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String test = sc.nextLine();
		
	
		char[]ch = test.toCharArray();
		
		int letter = 0; 
		int space =0; 
		int number = 0;
		int other = 0;
		for (int i =0; i<test.length();i++){
			
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if
			(Character.isSpaceChar(ch[i])) {
				space++;
		}
			else if(Character.isDigit(ch[i])) {
				number++;
			}
			else {
				other++;
			}
		}
		System.out.println("letter is:" +letter);
		System.out.println("space is:" +space);
		System.out.println("number is:" +number);
		System.out.println("other is:" +other); 
		
	}
}