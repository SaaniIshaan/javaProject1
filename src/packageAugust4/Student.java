package packageAugust4;

public class Student {

	public void StudentName(String name) {
		
	
		System.out.println(name);
	}

	public void StudentName() {
		
	
		System.out.println("unknown");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		
		s.StudentName();
		s.StudentName("Sam");

	}

}
