package Day2package;

public class Rectangle {
   int length;
   int breadth;
   int area;
    
   public void calcArea() {
	   area =(length * breadth);
   }
   
    public static void main(String[]arg) {
    	Rectangle r1 = new Rectangle();
    	Rectangle r2 = new Rectangle();
    	
    	System.out.println("Length is:" +r1.length);
    	System.out.println("Breadth is:" +r1.breadth);
    	System.out.println("Area is:" +r1.area);
    	System.out.println("Length is:" +r2.length);
    	System.out.println("Breadth is:" +r2.breadth);
    	System.out.println("Area is:" +r2.area);
    	System.out.println();

    	r1.length = 4;
    	r1.breadth = 5;
    	r2.length = 5;
    	r2.breadth = 8;
    	
    	System.out.println("Length is:" +r1.length);
    	System.out.println("Breadth is:" +r1.breadth);
    	System.out.println("Area is:" +r1.area);
    	System.out.println("Length is:" +r2.length);
    	System.out.println("Breadth is:" +r2.breadth);
    	System.out.println("Area is:" +r2.area);
    	System.out.println();
    	 
    	r1.calcArea();
    	r2.calcArea();
    	
    	System.out.println("Area of the rectangle is:" +r1.area);
    	System.out.println("Area of the rectangle is:" +r2.area);
    }
    	
    	
    }
    	
    

