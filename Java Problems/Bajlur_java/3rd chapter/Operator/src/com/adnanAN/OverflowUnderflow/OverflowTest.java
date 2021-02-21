package com.adnanAN.OverflowUnderflow;

public class OverflowTest {

	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;
		int b = a + 5;
		int c = a * b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c); // this value not correct
		System.out.println();
		
		// Under flow Test
		int x = 1; 
		int y = 2;
		System.out.println(x/y);
		
	}

}
