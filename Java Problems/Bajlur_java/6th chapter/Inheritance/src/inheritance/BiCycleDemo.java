package inheritance;

class Bicycle{
	public int cadence;
	public int gear;
	public int speed;
	
	//Have four method in this Bicycle class
	public void setCadence(int cadence){
		this.cadence = cadence;
	}
	
	public void setGear(int gear){
		this.gear = gear;
	}
	
	public void applyBrake(int speed){
		this.speed -= speed;
	}
	
	public void speedUp(int increment){
		speed += increment;
	}
}

// Here MountainBike is a subclass/childClass/ Derived Class
// And Bicycle is a Super Class/ Parent Class/ Base Class
class MountainBike extends Bicycle{
	public int seatHeight;
	
	public void setHeight(int newValue){
		seatHeight = newValue;
	}
}

public class BiCycleDemo {

	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike();
		mountainBike.setHeight(4);
		mountainBike.setGear(4);
		System.out.println(mountainBike.seatHeight);
	}

}
