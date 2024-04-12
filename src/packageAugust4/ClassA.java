package packageAugust4;

public class ClassA {

	void sum(int x, int y) {
		System.out.println("sum of two numbers" +(x+y));
	}
	void sum(int x, int y, int z) {
		System.out.println("sum of three numbers" +(x+y+z));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA a = new ClassA();
		
		a.sum(20,30);
		a.sum(30,40,50);
		
		
	}

}
