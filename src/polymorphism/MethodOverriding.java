package polymorphism;

	class Parent {
		
	void print() {
		System.out.println("Print methods of Parent class");
	}
}

	class subClass1 extends Parent {
		void print() {
		System.out.println("Print methods of subclass1 ");
		}
	}


	class subClass2 extends Parent {
		void print() {
		System.out.println("Print methods of subclass2 ");
		}
	}

	public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Parent a;
	//	a = new Parent();
		
		Parent a = new Parent();
		a.print();
		
		a = new subClass1();
		a.print();
		
		a = new subClass2();
		a.print();
		
		
		
		

	}

}
