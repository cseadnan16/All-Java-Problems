package com.adnanAN.FormulaType;

class QuadraticEquation{
	int a = 2;
	int b = 6;
	int c = 4;
	
	QuadraticEquation(){
		double r1 = (-b + Math.sqrt(((b*b)-(4*a*c)))) / (2*a);
		System.out.println("r1 = "+r1);
		
		double r2 = (-b - Math.sqrt(((b*b)-(4*a*c)))) / (2*a);
		System.out.println("r2 = "+r2);
	}
	
	void display(){
		
	}
}

public class Equation {

	public static void main(String[] args) {
		QuadraticEquation test = new QuadraticEquation();
		test.display();
	}

}
