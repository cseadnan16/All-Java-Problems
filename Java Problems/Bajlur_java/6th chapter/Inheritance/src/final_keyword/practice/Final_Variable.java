package final_keyword.practice;

class versity{
	final String name  = "State Institute"; //final variable
	final String Dept; //blank final variable
	static final int sem_fees; // static blank final variable
	
	
	//Blank final variable কে এক্সেস করতে  constructor ব্যবহার করতে হবে।
	versity() //constructor
	{
		Dept = "CSE";
	}
	
	// Static Blank final variable কে এক্সেস করতে  Static Block ব্যবহার করতে হবে।
	static // Static Block
	{
		sem_fees = 12500;
	}
	
	void display(){
		System.out.println("University name = "+name);
		System.out.println("Department = "+Dept);
		System.out.println("Semester Fee  = "+ sem_fees + " taka only");
	}
}

public class Final_Variable {
	public static void main(String[] args){
		versity ob = new versity();
		ob.display();
	}
}
