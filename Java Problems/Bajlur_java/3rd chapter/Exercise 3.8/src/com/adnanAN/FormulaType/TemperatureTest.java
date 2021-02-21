package com.adnanAN.FormulaType;

import java.util.Scanner;

public class TemperatureTest {
		
	private static Scanner input;

	public static float CelciusToFahrenheit(float c){		
		float f = ((9*c)/5)+ 32;
		return f;
	}
		
	public static void main(String[] args) {
		input = new Scanner (System.in);
		//TemperatureTest test = new TemperatureTest();
		
		System.out.print("Enter the value of Celcius: ");
		float c = input.nextFloat();
		
		System.out.print("Result: "+TemperatureTest.CelciusToFahrenheit(c));  
	}

}
