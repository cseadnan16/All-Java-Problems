package tryBlock;

public class Main {

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		
		int result = 0;
		//result = divide(a, b);
		
		try{
			result = divide(a, b);
		}catch(ArithmeticException e){
			System.out.println("You can't divide " + a + " by "+b);
		}
		
		System.out.println("Result: "+result);
	}
	
	public static int divide(int a, int b){
		return a/b;
	}

}
