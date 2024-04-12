package advance.java;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =5;
		double b = 5.5;
		
		//converts into wrapper objects
		Integer aobj = Integer.valueOf(a);	//used valueOf()method to convert primitive type  
		Double bobj = Double.valueOf(b);	// into objects
		
		if (aobj instanceof Integer) {
			System.out.println("An object of Integer is Created");
		}	
		
		//used instanceof operator to check whether the generated objects are of 
		//Integer or Double type or not	
		
		if (bobj instanceof Double) {
			System.out.println("An object of Double is Created");
			
		}
		int c = 6;
		Integer aob = c;
							// auto boxing process
		double d = 6.5;
		Double bob = d;
	
	
	//create objects of wrapper class
	
	Integer aobj1 = Integer.valueOf(22);  
	Double bobj1 = Double.valueOf(4.55);
	
	//converts into primitive types
	int i= 	aobj1.intValue();
	double j = bobj1.doubleValue();
	
	System.out.println("The value of i :" +i);
	System.out.println("The value of j :" +j);
	
	Integer aobj11 = Integer.valueOf(2);  
	Double bobj11 = Double.valueOf(4.5);
	
	int k = aobj11;			//unboxing
	double l = bobj11;
	
	//note : primitive types are more efficient than corresponding objects. 
	//error
	ArrayList<Integer>list = new ArrayList<>();
												//while working with collections
	//runs perfectly
	ArrayList<Integer>list1 = new ArrayList<>();
	
	//generates an error
//	 int a1 = null;
	 
	 //runs perfectly
	 Integer b1 = null;
}	
}
