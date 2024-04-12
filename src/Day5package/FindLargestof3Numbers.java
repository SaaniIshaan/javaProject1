package Day5package;

import java.util.Scanner;

public class FindLargestof3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		
		System.out.println("Enter Third Number:");
		int c = sc.nextInt();
		
		// Approach1 - logic
		
		if(a>b && a>c)
		{
			System.out.println(a+ "is the Largest Number");
			}
		else if(b>a && b>c)
		{
			System.out.println(b+ "is the Largest Number");
		}
		else
		{
			System.out.println(c+ "is the Largest Number");
		}
		
		//Ternary Operators in java
		
		int largest1 = a>b? a:b;			//Largest of a and b
		int largest2 = c>largest1? c:largest1;	//Largest of c and Largest1

		int largest = c>(a>b? a:b)? c:largest1;
		
		System.out.println(largest2+ "is the Largest Number"); */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		
		System.out.println("Enter the third number:");
		int c = sc.nextInt();
		
		if(a>b&& a>c) {
			System.out.println(a+ "is the largest number");
		}
		else if(b>a && b>c) {
			System.out.println(b+ "is the largest number");
		}
		else {
			System.out.println(c+ "is the largest number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

