package Day5package;

public class CountSumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =1234;
		int  sum = 0;
		
		 while(num>0)
		 {
			 sum = sum+num%10;	//4	+ 3 +2 + 1
			 
			 num = num/10;     //123  12  1
		 }
		 System.out.println("Sum of digits in a number :" +sum);
	}
}			
	
	
	
	
	
	
	
	
	
	
	