 
package democons;

public class Student{
	private int id;
	private String name;
	private int age;
	
        //Default Constructor
	public Student(){
	}
	
        //Parameterised Constructor
	public Student(int a){
		id = a;
                System.out.println("This is a Constructor  method."+id);
	}
	
        //Parameterised Constructor
	public Student(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
                System.out.println("ID:" +id+ " Name:" +name+ " Age:" +age);
	}
}


/*public class Cons_Class {
    
    // declare constructor method
    Cons_Class(int a, int b){ 
        int sum = a+b;
        System.out.println("This is a Constructor  method."+sum);
    }
    
    // create overloading method
    Cons_Class(float a, float b, float c){ 
        float sum = a+b+c;
        System.out.println("Sum value = "+sum);
    }    
}*/