package super_keyword.practice;

class construct{
	construct(){
		System.out.println("A's Constructor.");
	}
}

class X extends construct{
	X(){
		super();
		System.out.println("X's Constructor.");
	}
}

public class Testing_3 {
	public static void main(String[] args) {
		X object = new X();
	}

}
