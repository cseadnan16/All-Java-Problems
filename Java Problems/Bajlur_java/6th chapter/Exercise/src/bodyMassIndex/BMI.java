package bodyMassIndex;

public class BMI {
	public static final double Meter_Per_foot = 3.2808;
	
	private String name;
	private double weight; // in KG
	private double height; // in meter
	
	//constructor
	public BMI(String name, double weight, double height){
		this.name = name;
		this.weight = weight;
		this.height = height/Meter_Per_foot;
	}
	
	public double getBMI(){
		return weight/(height*height);
	}
	
	public String getStatus(){
		double bmi = getBMI();
		String status = null; 
		
		if(bmi<18.5){
			status = "Underweight";
		}else if(bmi<25){
			status = "Normal";
		}else if(bmi>=25 || bmi<=29.9){
			status = "Overweight";
		}else{
			status = "Obesity";
		}
		return status;
	}
	
	public String getName(){
		return name;
	}
}
