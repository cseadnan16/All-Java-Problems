package max_min;

import java.util.Scanner;

public class DigitCount {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = input.nextInt();
		int[] array = new int[n];
		
		System.out.print("Please enter the array element: ");
		for(int i=0;i<array.length;i++){
			array[i] = input.nextInt();
		}
		
		System.out.print("Choice your any digit: ");
		int k = input.nextInt();
		int count = 0;
		for(int i= 0;i<array.length;i++){
			if(k==array[i]){
				count++;
			}
		}
		
		System.out.print("Choice your digit's number: "+count);
	}
}
