package com.adnanAN.TypeConversionCasting;

public class WideningPrimitiveConversation {
	public static void main(String[] args){
		int anInt = 100;
		long aLong = anInt; // no explicit casting 
		float aFloat = aLong; // no explicit casting 
		
		System.out.println("Int value: "+anInt);
		System.out.println("Long value: "+aLong);
		System.out.println("Float value: "+aFloat);
	}
}
