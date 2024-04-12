package advance.java;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = x;							// wide type casting(int to double)
		System.out.println("int value is:" +x);
		System.out.println(" double value is:" +y);
	
	double data = 4.8;
	int num = (int)data;
	
	System.out.println("int value is:" +data);		// narrow type casting(double to int)
	System.out.println(" double value is:" +num);
	
	// here the int keyword inside the parenthesis indicates that the data variable is converted 
//		into int type.
	
	
	int no = 15;
	System.out.println("int value is:" +no);
	
	// used valueOf()method to convert the int type variable to string (int to string)
	
	String str = String.valueOf(no);
	
	System.out.println("String value is:" +str);
	
	
	String line = "10";
	System.out.println("String value is:" +line);
	
	int number = Integer.parseInt(line);
	
	System.out.println("int value is:" +number);
	
	// if the string variable cannot be converted into the integer variable then an exception 
	//	named NumberFormatexception occurs.
	}	
	
}
