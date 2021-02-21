package arraySorting;

public class Sorting_2 {

	public static void main(String[] args) {
		int[] Array = {2, 4, 99, 5, 0, 87, 1, 10, 19};
		System.out.print("Unsorted list: ");
		for(int i:Array){
			System.out.print(i+" ");
		}
		System.out.println();
		
		sortedFunc(Array);
		avg(Array);
		median(Array);
	}
	
	public static void sortedFunc(int A[]){
		int n = A.length;
		for(int i=1;i<n;i++){
			int temp = A[i];
			int j = i-1;
			while(j>=0 && A[j]>temp){
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = temp;
		}
		System.out.print("Sorted list : ");
		for(int i:A)System.out.print(i+" ");
		System.out.println();
	}
	
	public static void avg(int A[]){
		int sum = 0;
		for(int i:A) sum = sum+i;		
		double average = sum/A.length;
		System.out.println("Average: "+average);
	}
	
	public static void median(int A[]){
		int item, item1, item2;
		double median;
		if(A.length%2==1){
			 item = A.length/2;
			 median = A[item];
			 System.out.println("Item: "+item);
			 System.out.println("Median value: "+median);
		}else if(A.length%2==0){
			item1 = A.length/2;
			item2 = item1-1;
			item = A[item1] + A[item2];
			median = item/2.0;
			//System.out.println("Item: "+item);
			System.out.println("Median value: "+median);
		}
		
	}

}
