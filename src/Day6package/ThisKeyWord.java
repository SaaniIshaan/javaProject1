package Day6package;

public class ThisKeyWord {
	
		int a;	// instance variables or class variables
		int b;
		
		void getValues(int a, int b)	// method variables or external variables
		{
			this.a = a;
			this.b = b;
		}
		void printValues()
		{
			System.out.println(a);
			System.out.println(b);
		}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyWord th = new ThisKeyWord();
		th.getValues(10,20);
		th.printValues();
		
		
		
	}

}
