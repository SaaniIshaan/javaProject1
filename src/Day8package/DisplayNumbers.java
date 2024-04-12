package Day8package;

public class DisplayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		for(i=0;i<=100;i++) {
				
		System.out.println(i);
		}
		
		
		int num = 8;
		long factorial = 1;
		
	//factorial of 8 = 1*2*3*4*5*6*7*8 or
		//factorial of =	8*7*6*5*4*3*2*1
		
		for(i=1; i<=num;i++) {
		
		factorial = factorial*(i);	
	}
		System.out.println("Factorial of a number is:" +factorial);
}
}



