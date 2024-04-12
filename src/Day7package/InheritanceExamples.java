package Day7package;


	class A 	//parent
	{
		int a;
		void display()
		{
			System.out.println(a);
		}
	}
	
	class B	extends A		//child class
	{
		int b;
		void print()
		{
			System.out.println(b);
		}
	}
	
	class C extends B
	{
		int c;
		void show()
		{
			System.out.println(c);
		}
	}
	
	public class InheritanceExamples {
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			A aobj = new A();
			aobj.a = 100;
			aobj.display();
			
			B bobj = new B();
			bobj.a = 10;  //A
			bobj.b = 20;	//B
			
			bobj.display();	//A
			bobj.print();	//B
			
			C cobj = new C();
			cobj.a = 10;
			cobj.b = 20;
			cobj.c = 30;
			
			cobj.display();
			cobj.print();
			cobj.show();
			
	}

}
