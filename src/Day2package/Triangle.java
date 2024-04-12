package Day2package;

public class Triangle {

	int base = 4;
	int width = 5;
	int height = 3;
	int area; 
	int perimeter;
	
	 public void calcArea() {
		 
		 area = ((base * height) /2 );
		 System.out.println("area:" +area);
	 }
	  public void calcPerimeter() {
		  
		  perimeter = (base + height + width);
		  System.out.println("perimeter:" +perimeter);
	  }
		  public static void main(String[]arg) {
			Triangle t1 = new Triangle();
			t1.calcArea();
			t1.calcPerimeter();
		 }
	 }

