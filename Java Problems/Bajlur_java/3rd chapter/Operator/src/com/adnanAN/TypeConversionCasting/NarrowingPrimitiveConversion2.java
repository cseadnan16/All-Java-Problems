package com.adnanAN.TypeConversionCasting;

public class NarrowingPrimitiveConversion2 {

	public static void main(String[] args) {
		long y = 1_233_720_377_5807L;
		System.out.println("Long value: "+y);
		
		int x = (int) y;
		System.out.println("After Narrowing primitive conversion: "+x);
	}

}
