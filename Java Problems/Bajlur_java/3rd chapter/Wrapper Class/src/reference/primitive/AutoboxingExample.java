package reference.primitive;

public class AutoboxingExample {

	public Integer add(Integer a, Integer b){
		return a + b;
	}
	
	public static void main(String[] args) {
		
		AutoboxingExample example = new AutoboxingExample();
		int a = 5;
		int b = 15;
		
		System.out.println("Result = "+example.add(a, b));
	}

}
