package static_method;

class Calculator{
	public static int square(int n){
		return n*n;
	}
}

public class CalculatorTest {
	public static void main(String[] args) {
		int number = 2;
		int a = Calculator.square(number);
		System.out.println(a);
	}

}
