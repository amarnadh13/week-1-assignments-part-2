package program;

import static java.lang.System.out;
import java.util.Scanner;

import mathematics.shape.twodshape.Square;
import mathematics.shape.twodshape.Rectangle;
import mathematics.shape.threedshape.Cube;
import mathematics.shape.threedshape.Cylinder;

public class MainProgram {
	public static void main(String[] args) {
		
		Square square = new Square();
		square.setSideLength(13);
		String sShapeName = square.getShapeName();
		double sSideLength = square.getSideLength();
		double sArea = square.calculateArea();
		double sPerimeter = square.calculatePerimeter();
		out.println("Shape Name: " + sShapeName);
		out.println("Side Length: " + sSideLength);
		out.println("Area: " + sArea);
		out.println("Perimeter: " + sPerimeter);
		
		out.println();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setSideLength(9);
		rectangle.setSideWidth(5);
		double rArea = rectangle.calculateArea();
		double rPerimeter = rectangle.calculatePerimeter();
		String rShapeName = rectangle.getShapeName();
		double recSideLength = rectangle.getSideLength();
		double recSideWidth = rectangle.getSideWidth();
		out.println("Shape Name: " + rShapeName);
		out.println("Length: " + recSideLength);
		out.println("Breadth: " + recSideWidth);
		out.println("Area: " + rArea);
		out.println("Perimeter: " + rPerimeter);
		
		out.println();
		
		Cube cube = new Cube();
		cube.setSideLength(9);
		double cVolume = cube.calculateVolume();
		double cSurfaceArea = cube.calculateSurfaceArea();
		String cShapeName = cube.getShapeName();
		double cSideLength = cube.getSideLength();
		out.println("Shape Name: " + cShapeName);
		out.println("Side Length: " + cSideLength);
		out.println("Volume: " + cVolume);
		out.println("Surface Area: " + cSurfaceArea);
		
		out.println();
		
		Cylinder cylinder = new Cylinder();
		cylinder.setHeight(5);
		cylinder.setRadius(3);
		double cyVolume = cylinder.calculateVolume();
		double cySurfaceArea = cylinder.calculateSurfaceArea();
		String cyShapeName = cylinder.getShapeName();
		double cyHeight = cylinder.getHeight();
		double cyRadius = cylinder.getRadius();
		out.println("Shape Name: " + cyShapeName);
		out.println("Height: " + cyHeight);
		out.println("radius: " + cyRadius);
		out.println("Volume: " + cyVolume);
		out.println("Surface Area: " + cySurfaceArea);
		
	}
}