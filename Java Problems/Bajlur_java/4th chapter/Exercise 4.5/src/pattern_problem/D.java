package pattern_problem;

public class D {

	public static void main(String[] args) {
		int i, j, rowCount=1;
		for(i=8;i>=1;i--){
			for(j=1;j<=i;j++){
				System.out.print("  ");
			}
		
			for(j=1;j<=rowCount;j++){
				System.out.print(" #");
			}
			System.out.println();
			rowCount++;
		}	

	}

}
