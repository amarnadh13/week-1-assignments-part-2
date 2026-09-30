package mathematics.shape.threedshape;

import mathematics.shape.BasicThreeDShape;

public class Cylinder extends BasicThreeDShape {
	public Cylinder() {
		shapeName = "Cylinder";
	}
	
	public double calculateVolume() {
		double volume = pi * radius * height;
		return volume;
	}
	
	public double calculateSurfaceArea() {
		double surfaceArea = 2.0 * pi * radius * height;
		return surfaceArea;
	}
}