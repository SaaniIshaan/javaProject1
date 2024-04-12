package Day7package;

	class Parent
	{
		int a;
		void display()
		{
			System.out.println(a);
		}
	}

	class Child1 extends Parent
	{
		int x;
		void show()
		{
			System.out.println(x);
		}
	}

	class Child2 extends Parent
	{ 
		int y;
		void print()
		{
			System.out.println(y);
		}
	}

	class Child3 extends Parent
	{
		int z;
		void run()
		{
			System.out.println(z);
		}
	}

	
	
	public class HierarchyInheritance { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 c1 = new Child1();
		c1.a = 100;
		c1.x = 10;
		c1.display();
		c1.show();
		
		Child2 c2 = new Child2();
		c2.a = 50;
		c2.y = 20;
		c2.display();
		c2.print();
		
		Child3 c3 = new Child3();
		c3.a = 60;
		c3.z = 30;
		c3.display();
		c3.run();
		

	}

}
