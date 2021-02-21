package practice;

class Shape{
	double area(){
		System.out.print("Shape: ");
		return 0;
	}
}

class Rectangle extends Shape{
	// area
	double height, width;
	Rectangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	
	double area(){
		System.out.print("Rectangle: ");
		return height*width;
	}
}

class Triangle extends Shape{
	//area
	double base, height;
	Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	double area(){
		System.out.print("Triangle: ");
		return 0.5*base*height;
	}
}
public class Practical_2 {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Shape();
		s[1] = new Rectangle(30, 7);
		s[2] = new Triangle(7, 30);
		
		for(int i=0; i<3; i++){
			System.out.println(s[i].area());
		}
	}

}
