package mathematics.shape.twodshape;

import mathematics.shape.BasicTwoDShape;

public class Square extends BasicTwoDShape {
	
	public Square() {
		shapeName = "Square";
	}
	
	public double calculateArea() {
		double area = sideLength * sideLength;
		return area;
	}
	
	public double calculatePerimeter() {
		double perimeter = 4 * sideLength;
		return perimeter;
	}
}