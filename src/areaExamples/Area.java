package areaExamples;

public class Area extends Shape {

	@Override
	void RectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		
		System.out.println("The area of rectangle is :" +length*breadth);
	}

	@Override
	void SquareArea(int side) {
		// TODO Auto-generated method stub
		
		System.out.println("The area of Square is :" +side*side);
	}

	@Override
	void CircleArea(int radius) {
		// TODO Auto-generated method stub
		
		System.out.println("The area of circle is :" +3.14 *(radius*radius));
	}
	}


