package bodyMassIndex;

public class BMI_Test {
	public static void main(String[] args) {
		BMI bmi = new BMI("Adnan", 67, 5.6);
		//System.out.println("The BMI for " + bmi.getName() + " is (" + bmi.getBMI() + ") " + bmi.getStatus());
		System.out.printf("The BMI for %s is (%.3f) %s", bmi.getName(), bmi.getBMI(), bmi.getStatus());
	}

}
