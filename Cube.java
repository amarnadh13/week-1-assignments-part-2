package mathematics.shape.threedshape;

import mathematics.shape.BasicThreeDShape;

public class Cube extends BasicThreeDShape {
	
	public double sideLength;
	
	public double getSideLength () {
		return sideLength;
	}
	
	public void setSideLength(double side) {
		sideLength = side;
	}
	
	public Cube() {
		shapeName = "Cube";
	}
	
	public double calculateVolume() {
		double volume = sideLength * sideLength * sideLength;
		return volume;
	}
	
	public double calculateSurfaceArea() {
		double surfaceArea = 6.0 * sideLength * sideLength;
		return surfaceArea;
	}
}