package abstraction;
	
	abstract class Shape{
		abstract void draw();
	}
	//in real scenario, implementation is provided by others i.e. unknown by end user 	
	class Rectangle extends Shape{
		void draw() {
			System.out.println("Drawing Rectangle");		
		}
	}
	class Circle extends Shape{
		void draw() {
			System.out.println("Drawing Circle");		
		}
	}

	public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape r = new Rectangle();
		r.draw();
		
		Shape c = new Circle();
		c.draw();
	}

}
