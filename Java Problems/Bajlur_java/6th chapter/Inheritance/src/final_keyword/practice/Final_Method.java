package final_keyword.practice;

class University{
	String name  = "State Institute"; 
	String Dept = "CSE";
	int sem_fees = 12500;
	
	//create final method
	final void display(){
	System.out.println("University name = "+name);
		System.out.println("Department = "+Dept);
		System.out.println("Semester Fee  = "+ sem_fees + " taka only");
	}
}


//কোন মেথডের আগে final কিওয়ার্ড থাকলে ঐ final মেথড ইনহেরিট হবে, কিন্তু override হবে না।
class Student extends University{
	//Student ক্লাসে  display() মেথড ইনহেরিট হয়েছে, কিন্তু override হবে না। 
	//যার ফলে Student ক্লাসে display2() মেথড ব্যবহার করা হয়েছে।  
	
	String student_name = "Adnan Al Nowshad";
	
	void display2(){
		System.out.println("Student Name = "+student_name);
		super.display();
	}
}


public class Final_Method {
	public static void main(String[] args) {
		Student ob = new Student();
		ob.display();
		System.out.println();
		ob.display2();

	}
}
