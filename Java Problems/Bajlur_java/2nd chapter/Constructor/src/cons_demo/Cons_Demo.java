package cons_demo;

 class Student{
	private int id;
	private String name;
	private int age;
	
	//default constructor
	Student(){
		System.out.println("\nThis is a default constructor.");
	}
	
	//parameterized constructor
	Student(int id){
		this.id = id;	
	}
	
	//parameterized constructor
	Student(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;		
	}
	
	void display(){
		System.out.println("ID: "+id);
		System.out.println("ID:" +id+ "  Name:" +name+ "  Age:" +age);
	}
}


public class Cons_Demo {
	public static void main(String[] args) {
		Student a,b;
		
		a = new Student(50);
		a.display();
		
		a = new Student(10, "Adnan" , 30);
		a.display();
		
		b = new Student();
		b.display();
		
	}
}
