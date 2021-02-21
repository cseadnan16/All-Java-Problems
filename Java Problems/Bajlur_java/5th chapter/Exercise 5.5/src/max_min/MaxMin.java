package max_min;

import java.util.Scanner;

public class MaxMin {

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
		
		int max = max(array);
		int min = min(array,max);
		System.out.println("Maximum value: "+max);
		System.out.println("Minimum value: "+min);
	}
	
	public static int max(int[] array){
		int i, max;
		for(i=0,max=0;i<array.length;i++){
			if(array[i]>max){
				max = array[i];
			}else{
				max = max;
			}
		}	
		return max;
	}
		
	public static int min(int[] array, int max){
		int i, min;
		for(i=0,min=max;i<array.length;i++){
			if(array[i]<min){
				min = array[i];
			}else{
				min = min;
			}
		}
		return min;
	}

}
