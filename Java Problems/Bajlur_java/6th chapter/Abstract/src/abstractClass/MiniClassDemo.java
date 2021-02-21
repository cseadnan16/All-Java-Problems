package abstractClass;

abstract class Animal{
	int legs;
	Animal(int legs){
		this.legs = legs;
	}
	
	void sleep(){
		String name = getClass().getSimpleName();
		System.out.println(name + " Sleeping...Don't disturb!");
	}
	
	abstract String getDiets();	
}

class Lion extends Animal{
	Lion(int legs){
		super(legs);
	}
	
	@Override
	String getDiets(){
		return "Meat";
	}
}

class Tiger extends Animal{
	Tiger(int legs){
		super(legs);
	}
	
	@Override
	String getDiets(){
		return "Meat";
	}
}

class Deer extends Animal{
	Deer(int legs){
		super(legs);
	}
	
	@Override
	String getDiets(){
		return "Grass";
	}
} 


class MiniZoo{
	private Animal[] animals;
	
	MiniZoo(Animal[] animals){
		this.animals = animals;
	}
	
	void putThemOnSleep(){
		for(Animal animal: animals){
			animal.sleep();
		}
	}
	
	void printDietsOfAllAnimals(){
		for(Animal animal: animals){
			String diets = animal.getDiets();
			String name = animal.getClass().getSimpleName();
			System.out.println(name + " eats" + diets + ".");
		}
	}
}


public class MiniClassDemo {
	public static void main(String[] args){
		
		Animal[] animals = new Animal[4];
		
		animals[0] = new Deer (4);
		animals[1] = new Lion(4);
		animals[2] = new Tiger(4);
		
		MiniZoo miniZoo = new MiniZoo(animals);
		//miniZoo.putThemOnSleep();
		miniZoo.printDietsOfAllAnimals();
	}
}
