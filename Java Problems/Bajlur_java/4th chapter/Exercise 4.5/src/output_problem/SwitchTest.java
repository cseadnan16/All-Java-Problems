package output_problem;

public class SwitchTest {

	public static void main(String[] args) {
		SwitchTest ms = new SwitchTest();
		ms.docalculate();
	
	}
	
	public void docalculate(){
		int number = 1; 
		switch(number){
			default:
				System.out.println("This is the default output.");
				break;
			case 1: 
				System.out.println("ONE");
				break;
			case 2: 
				System.out.println("Two");
				break;
		}
	}

}
