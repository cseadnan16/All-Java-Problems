package super_keyword.practice;

class vehicle{
	private String color;
	private double weight;
	
	// এইখানে  vehicle হলো একটি কন্সট্রাক্টর, সাব ক্লাসে(car) vehicle কন্সট্রাক্টরটি ইনহেরিট হবে, কিন্তু ওভাররিড হবে না ।
	vehicle(String color, double weight){
		this.color = color;
		this.weight = weight;
	}
	
	void display(){
		System.out.println("Color: "+color);
		System.out.println("Weight: "+weight);
	}
}

class car extends vehicle{
	int gear;
	car(String color, double weight, int gear){
		super(color, weight);
		this.gear = gear;
	}
	
	void display(){
		super.display();
		System.out.println("Gear: "+gear);
	}
}



public class Testing_4 {
	public static void main(String[] args) {
		car Toyota_Allion = new car("Perl", 530, 40);
		Toyota_Allion.display();
	}
}

