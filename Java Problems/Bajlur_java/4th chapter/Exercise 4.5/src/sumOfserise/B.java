package sumOfserise;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner input  = new Scanner ( System.in);
		System.out.print("Enter the value of n: ");
		int n = input.nextInt();
		 ;
		double sum, temp = 0;
		for(int i=1;i<=n;i++){
			temp= temp + (1.0/i);	
		}
		System.out.println("Serise value: "+temp);
		sum = 4*(1-temp);
		System.out.println("Summation value: "+sum);


	}

}