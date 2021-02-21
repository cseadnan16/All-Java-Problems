package array2D;

public class Array2D {

	public static void main(String[] args) {
		//A 12x8, in [row] [col];
		int[][] myArray = new int[12][8];
		int numRows = myArray.length; //12
		int numCols = myArray[0].length; //8
		System.out.println("Rows Length: "+numRows);
		System.out.println("Columns Length: "+numCols);
		System.out.println(myArray[11].length);
		
		//Fill the array
		for(int row = 0; row<numRows;++row){
			for(int col = 0; col<numCols;++col){
				myArray[row][col] = row * numCols + col;
			}
		}
		
		//print the array
		for(int row = 0; row<numRows;++row){
			for(int col = 0; col<numCols;++col){
				System.out.printf("%3d", myArray[row][col]+1);
			}
			System.out.println();
		}
	}

}
