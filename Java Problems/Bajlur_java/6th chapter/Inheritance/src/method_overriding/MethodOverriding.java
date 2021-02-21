package method_overriding;

class Circle{
	double radius;
	String color;
	
	//create parameterized constructor
	public Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	
	//create default constructor
	Circle(){
		this.radius = 1.0;
		this.color = "RED";
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
}

class Cylinder extends Circle{
	double height;
	
	//Create default constructor 
	public Cylinder(){
		this.height = 5.5;
	}
	
	public Cylinder(double radius, String color, double height){
		super();
		this.height = height;
	}
	
	@Override
	public double getArea(){
		double area = 2 * Math.PI * radius * height + 2 * super.getArea();
		return area;
	}
	
	void display(){
		System.out.println("Area = "+getArea());
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Cylinder ob = new Cylinder(2.1, "Blue", 4.2);
		ob.display();
	}

}
