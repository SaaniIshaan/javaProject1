package packageaugust1;

import java.util.Scanner;

public class ReverseStringWordWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String s = in.nextLine();
		
		String s2[] = s.split(" ");
		
	//	System.out.println(s2[0]);
		
	//	System.out.println(s2.length);
	
		for(int i =0; i<=s2.length-1; i++){
			
			System.out.println(s2[i] +"");
			}
		
		String rev = "";
		
	
	//	String s3= s.tocharAt();
		
		for(int i=s2.length-1;i>=0;i--) {
		
		rev = rev+s2[i];
		rev = rev + " ";
		
	System.out.println(rev+"");
	
		}
	
	
		}	
}