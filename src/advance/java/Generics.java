package advance.java;

import Day2package.Student;

public class Generics<Anytype> {
	
	private Anytype at;	//instance variable of Generic class
	
	public Generics(Anytype t) {
		at = t;
	}
	Anytype getType() {
	 return at;
	}
	
	void showType() {
		System.out.println("Type of data is:" +at.getClass().getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Generics<String> s = new Generics<String>("Hello Generics");
		
		System.out.println(s.getType());
		s.showType();*/
		
	/*	Generics<Character> c = new Generics<Character>('M');
		
		System.out.println(c.getType());
		c.showType();*/
		
		Generics<String> student = new Generics<String>("Sam");
		System.out.println(student.getType());
		student.showType();
		
		
	}
	
}
