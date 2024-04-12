package polymorphism;

	class MultiplyFun1 {
		
		// Method with 2 parameter
		static int Multiply(int a, int b)
		{
			return a *b;
		}
		//Method with the same name but 3 parameter	
	static int Multiply(int a, int b, int c)
	{
		return a*b*c;
	}

	}

	public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MultiplyFun1.Multiply(2,4));
		
		System.out.println(MultiplyFun1.Multiply(2,4,6));
	}

}
