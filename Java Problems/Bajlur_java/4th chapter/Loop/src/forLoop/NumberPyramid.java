package forLoop;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter the number of row: ");
		int row = input.nextInt();
		int i, rowCount = 1;
		
		for(i=row;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
		
			for(int j=1;j<=rowCount;j++){
				System.out.print(rowCount);
			}
			System.out.println();
			rowCount++;
		}	
	}
}
