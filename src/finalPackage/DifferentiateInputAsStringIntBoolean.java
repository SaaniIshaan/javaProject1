package finalPackage;

import java.util.Scanner;

public class DifferentiateInputAsStringIntBoolean {

	//private static final String regex = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner  sc = new Scanner(System.in);
		System.out.println("Enter a value");
		String str = sc.nextLine();
	
		if(str.equalsIgnoreCase("false") || str.equalsIgnoreCase("true")) {
			System.out.println("The value is boolean");
		}
		else if(str.match(regex)) {
			System.out.println("The value is an int");
		}
		else
		{
			System.out.println("The value is a string");
		}	*/
		
		String input;
		int ch1;
		Scanner one = new Scanner(System.in);
		System.out.println("enter your input");
		input = one.nextLine();
		try {
		ch1 = Integer.parseInt(input);
		System.out.println("integer");
		return;
		}
		catch (NumberFormatException e) {
		}

		if(input.equalsIgnoreCase("true")||input.equalsIgnoreCase("false")){
		System.out.println("boolean");
		return;
		}
		else{
		System.out.println("String");
		return;
		}
		
			
	}
	
}
