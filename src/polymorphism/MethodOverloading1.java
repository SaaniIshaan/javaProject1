package polymorphism;

// Java program for MethodOverloading

	class MultiplyFun {
		// Method with 2 parameter
		
		static int Multiply(int a, int b)
		{
			return a * b;
		}
		
		// Method with the same name but 2 double parameter
		static double Multiply(double a, double b)
		{
			return a * b;
		}
		
		
	}

	public class MethodOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MultiplyFun.Multiply(2,5));
		System.out.println(MultiplyFun.Multiply(20.5,55.4));
	}

}
