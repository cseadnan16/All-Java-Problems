package practice;

class Person{
	void display(){
		System.out.println("I am a person.");
	}
}

class Teacher extends Person{
	//display
	@Override
	void display(){
		super.display();
		System.out.println("I am a Teacher.");
	}
}

class Student extends Person{
	//display
	@Override
	void display(){
		System.out.println("I am a Student.");
	}
}

public class Practical_1 {
	public static void main(String[] args){
		Person p = new Person();
		p.display();
		
		Teacher t;
		t = new Teacher();
		p = t;
		p.display();
		
		p = new Student();
		p.display();
		
	}
}
