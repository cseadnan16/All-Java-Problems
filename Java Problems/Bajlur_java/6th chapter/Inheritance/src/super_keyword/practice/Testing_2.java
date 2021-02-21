package super_keyword.practice;

class M{
	void display(){
		System.out.println("Display inside A Class.");
	}
}

class N extends M{
	// display() 
	//ইনহেরিট করার কারনে  M ক্লাসের display() মেথড  N ক্লাসে অভাররিড হয়েছে, কিন্তু এইটা ইনভিজিবল। 
	//এই ইনভিজিবল মানকে ভিজিবল করতে  N ক্লাসে super কিওয়ার্ড ব্যবহার করতে হয়।   
	
	void display(){
		super.display();
		System.out.println("Display inside B Class.");
	}
	
}

public class Testing_2 {
	public static void main(String[] args){
		N object = new N();
		object.display();
	}
}

