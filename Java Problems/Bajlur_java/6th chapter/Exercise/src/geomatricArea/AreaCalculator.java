package geomatricArea;

public class AreaCalculator {
	public static final double PI = 3.1416;
	
	public double getArea(double radius){
		
		return PI*(radius*radius); // area of a circle
	}
	
	public double getArea(int length, int width){
		
		return length*width*1.0; // area of a rectangle
	}
	
	public double getArea(int base, double height){
		
		return 0.5*base*height; // area of triangle
	}
	
	public double getArea(double radius, double height){
		
		return (2*PI*radius*height)+(2*PI*radius*radius); // area of a cylinder
	}	
}

