package inputDemo;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = src.nextInt();
		System.out.print("Enter a number: ");
		int b = src.nextInt();
		
		int result = a+b;
		
		System.out.println("The result: "+result); 
	}

}
