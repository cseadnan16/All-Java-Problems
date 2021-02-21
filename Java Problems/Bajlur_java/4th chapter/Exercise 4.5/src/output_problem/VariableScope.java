package output_problem;

public class VariableScope {

	public static void main(String[] args) {
		int x = 10;
		if(x>10){
			int y = 5;
			System.out.println(y);
		}else{
			int a = 12;
			System.out.println(a);
		}	
	}
}
