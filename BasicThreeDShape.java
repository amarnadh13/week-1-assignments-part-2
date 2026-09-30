package mathematics.shape;

import mathematics.shape.BasicShape;

public class BasicThreeDShape extends BasicShape {
	public double radius;
	public double height;
	public double pi = 3.141592653589793;
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double rad) {
		radius = rad;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double hgt) {
		height = hgt;
	}
	
	public double calculateVolume() {
		return 0.0;
	}
	
	public double calculateSurfaceArea() {
		return 0.0;
	}
}