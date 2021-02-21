package polymorphism;

class Liquid{
	public void swirl(boolean clockwise){
		System.out.println("Swirling Liquid");
	}
}

class Coffee extends Liquid{
	@Override
	public void swirl(boolean Coffee){
		System.out.println("Swirling Coffee");
	}
}

class Milk extends Liquid{
	@Override
	public void swirl(boolean Milk){
		System.out.println("Swirling Milk");
	}
}

class CoffeeCup{
	private Liquid innerLiquid;
	public void addLiquid(Liquid liquid){
		innerLiquid = liquid;
		innerLiquid.swirl(false);
	}
}

public class MainApp {
	public static void main(String[] args) {
		
		// প্রথমে একটি কফি কাপ তৈরি করতে হবে 
		CoffeeCup coffeeCup = new CoffeeCup();
		
		// এখন আমাদের কতগুলো লিকুইড দরকার
		Liquid genericLiquid = new Liquid();
		Coffee coffee = new Coffee();
		Milk milk = new Milk();
		
		// এখন প্রয়োজন মত কফি কাপে ঢালি
		coffeeCup.addLiquid(genericLiquid);
		coffeeCup.addLiquid(milk);
		coffeeCup.addLiquid(coffee);
		
	}
}





