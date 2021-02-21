package adnanAN;

public class PersonTest {

	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person("Adnan Al Nowshad", 29, "01718880440");
		
		a.setNmae("Mona");
		a.setAge(25);
		a.setPhoneNumber("01677751980");
		
		a.display();
		b.display();

	}

}
