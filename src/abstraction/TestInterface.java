package abstraction;

//Interface declaration : by first user
	interface Drawable{
		void draw();
	}

//Implementation:  by second user
	class Rectangle1 implements Drawable{
		public void draw() {
			System.out.println("Drawing Rectangle");
		}
	}

	class Circle1 implements Drawable{
		public void draw() {
			System.out.println("Drawing Circle");
		}
	}

//using Interface by third user

	public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawable r = new Rectangle1();
		r.draw();
		
		Drawable c= new Circle1();
		c.draw();

	}

}
