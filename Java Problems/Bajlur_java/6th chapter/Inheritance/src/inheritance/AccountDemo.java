package inheritance;

class Account{
	private String name;
	private long amount;
	
	//Create constructor method
	public Account(String name, long amount){
		this.name = name;
		this.amount = amount;
	}
	
	public String getName(){
		return name;
	}
	public long getAmount(){
		return amount;
	}
	
	void display(){
		System.out.println("Name: "+name);
		System.out.println("Amount: "+ amount);
	}
}

class SavingAccount extends Account{
	//Create constructor method
	public SavingAccount(String name, long amount){
		super(name, amount);
	}
	void display(){
		super.display();
	}
}

public class AccountDemo {
	public static void main(String[] args) {
		SavingAccount b = new SavingAccount("City Bank", 425790);
		b.display();	
	}

}
