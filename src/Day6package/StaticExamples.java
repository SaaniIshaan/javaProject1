package Day6package;

public class StaticExamples {
	
		static int a=10; //static variable 
		int b = 20;		//non static variable
		
		static void m1()  //static method
		{
			System.out.println("This is m1 - static method");
		}
		
		void m2()	//non static method
		{
			System.out.println("This is m2 - non static method");
		}
		void m3()
		{
			System.out.println("This is m3 method----	non static");
			
			System.out.println(a);
			System.out.println(b);
			m1();
			m2();
		}
		
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static method can access only static stuff
		
			System.out.println(StaticExamples.a);
			StaticExamples.m1();
			
			System.out.println(a);	//incorrect because b is a non static variable
			m1();
			
		//	System.out.println(b);	//incorrect because m2 is a non static method
		//	m2();
			
			StaticExamples se = new StaticExamples();
			//static methods can also access non static stuff through objects
			
			System.out.println(se.b);//non static variable through object
			se.m2();		//non static method through object
			
			se.m3();
	}

}
