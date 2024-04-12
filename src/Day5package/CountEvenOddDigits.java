package Day5package;

public class CountEvenOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345678;
		int even_count = 0;
		int odd_count = 0;
		
		 while(num>0)		//1234    123	12	1
		 {
			 int rem=num%10;	//1234%10 = 4   3	2	1
			 
			 if(rem%2 ==0)		
			 {
				 even_count++;		//1  2   
			 } 
			 else
			 {
				 odd_count++;		//1  2 
			 }
			num=num/10;		//123   12   1
		 }
		
		 System.out.println("Number of  Even number: " + even_count);
		 System.out.println("Number of Odd number: " + odd_count);
		 
	}

}
