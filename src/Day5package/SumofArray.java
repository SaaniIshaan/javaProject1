package Day5package;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,2,7,9,6};	//n-5   n-1 = 4
		
		int sum =0;
		
		for(int i=0; i<a.length; i++)	//a.length = 5
		{
			sum = sum+a[i];			//5+2+7=9+6
		}
		
		System.out.println("Sum of Array elements:" +sum);
		
		
		//Enhanced for loop
		
	/*	for(int value:a)
		{
		sum = sum+value;
		}
		
		
		
		System.out.println("Sum of Array elements:" +sum); */
		
	}

}
