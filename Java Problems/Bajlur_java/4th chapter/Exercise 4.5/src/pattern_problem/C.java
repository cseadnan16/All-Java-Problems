package pattern_problem;

public class C {

	public static void main(String[] args) {
		int i, j, rowCount=8;
		for(i=1;i<=8;i++){
			for(j=1;j<=i;j++){
				System.out.print("  ");
			}
		
			for(j=rowCount;j>=1;j--){
				System.out.print(" #");
			}
			System.out.println();
			rowCount--;
		}
	}
}
