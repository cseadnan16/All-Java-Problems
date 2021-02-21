package setter_getter;

class Person{
	private String name;
	private int age;
	private String nationalID;
	
	public void setName(String name){
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
	
	public void setNationalID(String nationalID){
		this.nationalID = nationalID;
	}
	public String getNationalID(){
		return nationalID;
	}
}


public class PersonTest {
	public static void main(String[] args) {
		Person a = new Person();
		
		a.setName("Adnan Al Nowshad"); 
		System.out.println("Name: "+a.getName());
		
		a.setAge(29);
		System.out.println("Age: "+a.getAge());
		
		a.setNationalID("0123445678999986");
		System.out.println("National ID: "+a.getNationalID());		
	}

}
