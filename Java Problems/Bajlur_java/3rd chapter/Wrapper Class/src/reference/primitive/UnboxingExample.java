package reference.primitive;

public class UnboxingExample {

	public int add(int a, int b){
		return a + b;
	}
	
	public static void main(String[] args) {
		
		AutoboxingExample example = new AutoboxingExample();
		Integer a = 5;
		Integer b = 15; 
		System.out.println("Result = "+example.add(a, b));
		
		String bangla = "আদনান আল নওশাদ"; 
		char ko = 'ক'; 
		double d = 6.023e23;
		float f = 123.4f;
		int hexVal = 0x1a;
		int binVal = 0b11010;
		int under = 2_101_969;
		int under1 = 1__192;
		
		System.out.println("নামঃ  "+bangla);
		System.out.println("নামঃ  "+ko);
		System.out.println("double value = "+d);
		System.out.println("float value = "+f);
		System.out.println("Hexa value = "+hexVal);
		System.out.println("Binary value = "+binVal);
		System.out.println("Underscore value = "+under);
		System.out.println("Underscore value = "+under1);
	}

}
 