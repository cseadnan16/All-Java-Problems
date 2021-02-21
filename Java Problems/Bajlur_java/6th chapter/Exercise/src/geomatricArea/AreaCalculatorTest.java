package geomatricArea;

public class AreaCalculatorTest {
	public static void main(String[] args) {
		AreaCalculator calculator = new AreaCalculator();
		
		System.out.printf("Area of Circle: %.2f\n", calculator.getArea(3));
		System.out.printf("Area of Rectangle: %.2f\n", calculator.getArea(3, 6));
		System.out.printf("Area of Triangle: %.2f\n", calculator.getArea(5, 8.6));
		System.out.printf("Area of Cylinder: %.2f\n", calculator.getArea(9, 4.7));
	}
}
