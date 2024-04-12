package Day2package;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		 int a = reader.nextInt();
		 
		System.out.println("Enter the second number");
		int b = reader.nextInt();
		
		System.out.println("Enter the third number");
		int c = reader.nextInt();
		 
		int average = ((a+b+c)/3);
		System.out.println("Average of three numbers is:" +average);
		
		reader.close();
	}
}