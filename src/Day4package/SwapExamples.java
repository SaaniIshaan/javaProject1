package Day4package;

public class SwapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a = 10;
		int b = 20;
		int c;*/
		
		// Logic 1 - third variable
		
	/*	System.out.println("before swapping a :" +a );
		System.out.println("before swapping b :" +b );
		
		c=a;
		a=b;
		b=c;
	//	a = b;
	//	b = a;
		
		System.out.println("after swapping a :" +a);
		System.out.println("after swapping b :" +b);*/
	 
		
	// logic 2  use (+ & -) without using third variable
		
	//	a = a+b; //10 +20 = 30
	//	b = a-b; //30 - 20 = 10
	//	a = a-b; // 30 - 10 = 20
		
	//	System.out.println("After swapping values are :" +a+" " +b);
		
		// logic 3 use(* and/) without using third variable
		//here a & b values should not be Zero
		
	/*	a = a*b; //10 *20 = 200;
		b = a/b; //200/ 20 =10;
		a = a/b; //200/10 = 20; */
		
	//	System.out.println("After swapping values are :" +a+" " +b);
		
		// Logic4 -bitwise XOR(^)
		
	/*	a = a^b;  //10^20 = 30
		b = a^b;  //30^20 = 10
		a = a^b;  //30^10 = 20*/
		
	//	System.out.println("After swapping values are :" +a+" " +b);
		
		// Logic5 - single statement
		//a = 10   b =20
		
	//	b=a+b-(a=b);
	//System.out.println("After swapping values are :" +a+" " +b);
		
	int a =  15; 
	int b = 20;
	
	a= a+b;  // 15+20 = 35
	b = a-b;	//35-20 = 15
	a = a-b;	//35 - 15 = 20
	
		System.out.println("After swapping value of a is:"  +a);
		System.out.println("After swapping value of b is:"  +b);
	}

}
