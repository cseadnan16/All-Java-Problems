package polymorphism;

class Dog{
	public String getType(){
		System.out.println("Normal Dog");
		return "Normal Dog";
	}
}

class DeshiDog extends Dog{
	@Override
	public String getType(){
		System.out.println("Deshi Dog");
		return "Deshi Dog";
	}
}

class BideshiDog extends Dog{
	@Override
	public String getType(){
		System.out.println("Bideshi Dog");
		return "Bideshi Dog";
	}
	public String getName(){
		System.out.println("Poodle");
		return "Poodle";
	}
}
public class Up_and_Down_Casting {
	public static void main(String[] args) {
		Dog dog1 = new Dog(); // Up Casting
		Dog dog2 = new DeshiDog(); // Up Casting
		Dog dog3 = new BideshiDog();
		
		dog1.getType();
		dog2.getType();
		dog3.getType();
		
		BideshiDog bideshiDog = (BideshiDog) dog3; // Down casting
		bideshiDog.getName();
	}

}
