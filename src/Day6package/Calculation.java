package Day6package;

public class Calculation {

	int a;
	int b;
	int c;
	 
	 int sum (int a,int b,int c)
	 {
		 return(a+b+c);
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation cal = new Calculation();
		 int x =10;
		 int y = 20;
		 int z = 30;
		 			
		int sum = cal.sum(x,y,z);
		
		System.out.println(+sum);
	}

}
