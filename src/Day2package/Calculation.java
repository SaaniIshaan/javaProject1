package Day2package;

public class Calculation {

	int x = 10;
	int y = 20;
	
 	void sum()  //case1     not taking parameters and also not returned any value
	{
		System.out.println(x+y);
	}
	
	 int sum1()  // case2     not taking parameters but returning values
	 {
		 return (x+y);
	}
	
	void sum2(int a, int b)    //case 3 taking parameters, but not returning any value
	 {
		 System.out.println(a+b);
	 }
		
	
	 int sum3(int a, int b)   //case 4  method is taking parameters and also returning a value
	 {
		 return(a+b);
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Calculation cal = new Calculation();
		 cal.sum();   //case 1
		 	 
		 
		 int res = cal.sum1();  //case 2
		 System.out.print(res);    //or
		 System.out.println(cal.sum1());  
		 
		 cal.sum2(100, 200);   //    case 3
		 
		 System.out.println(cal.sum3(100, 200));    //case 4
		 
	}

}
