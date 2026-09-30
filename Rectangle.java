package mathematics.shape.twodshape;

import mathematics.shape.BasicTwoDShape;

public class Rectangle extends BasicTwoDShape {
	
	public Rectangle() {
		shapeName = "Rectangle";
	}
	
	public double calculateArea() {
		double area = sideLength * sideWidth;
		return area;
	}
	
	public double calculatePerimeter() {
		double perimeter = 2 * (sideLength + sideWidth);
		return perimeter;
	}
}