package com.adnanAN.TypeConversionCasting;

public class NarrowingPrimitiveConversion {

	public static void main(String[] args) {
		double aDouble = 97.04;
		long aLong = (long) aDouble; // explicit type casting
		int aInt = (int) aLong; // explicit type casting
		
		System.out.println("Double value: "+aDouble);
		System.out.println("Long value: "+aLong);
		System.out.println("Int value: "+aInt);
	}

}
