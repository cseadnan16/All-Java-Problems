package com.adnanAN.FormulaType;

import java.util.Scanner;

public class BodyMassIndex {

	private static Scanner input;
 
	float BodyMassTest(float weight, float height){
		float BMI = weight/(height*height);	
		return BMI;
	}
	
	public static void main(String[] args) {
		
		input = new Scanner (System.in);
		
		System.out.print("Enter the value of weight: ");
		float w = input.nextFloat();
		
		System.out.print("Enter the value of height: ");
		float h = input.nextFloat();
		
		BodyMassIndex test = new BodyMassIndex();
		System.out.println("Result = "+test.BodyMassTest(w, h));		
	}

}
