package abstractClass;

abstract class A{
	int aValue;
	public A(int aValue){
		this.aValue = aValue;
		System.out.println("Inside abstract class Value: "+ aValue);
	}
}

class B extends A{
	public B(int aValue){
		super(aValue);
		System.out.println("Inside sub class Value: "+ aValue);
	}
	
}
public class Practice {

	public static void main(String[] args) {
		new B(45);
	}

}
