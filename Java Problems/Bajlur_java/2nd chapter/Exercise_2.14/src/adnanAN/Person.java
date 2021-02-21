package adnanAN;

public class Person {
	private String name;
	private int age;
	private String phoneNumber;
	
	//default constructor
	Person(){
		
	}
	
	//parameterized constructor
	Person(String name, int age, String phoneNumber){
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	//setter and getter method
	public void setNmae(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber(String phoneNumber){
		return phoneNumber;
	}
	
	void display(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println();
	}
}
