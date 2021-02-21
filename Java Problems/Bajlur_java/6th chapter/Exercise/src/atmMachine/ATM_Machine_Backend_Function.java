package atmMachine;

import java.util.Scanner;
public class ATM_Machine_Backend_Function {
	Scanner input  = new Scanner(System.in);
	
	public static final String accountNumber = "1";
	public static final String Password = "j";
	int choiceCode;
	
	private String accountNo;
	private String password;
	
	public void setLogin(String accountNo, String password){
		this.accountNo = accountNo;
		this.password = password;
	}
	
	public String getAccountNo(){
		return accountNo;
	}
	public String getPassword(){
		return password;
	}
	
	public void Login(){
		if(accountNumber.matches(accountNo) && Password.matches(password)){
			System.out.println("\n\nLogin Successfull.");
			System.out.println("\nMain Menu");
			System.out.println("1: Check Balance");
			System.out.println("2: Withdraw");
			System.out.println("3: Deposite");
			System.out.println("4: Exit");
			
			do{
				System.out.print("Enter choice: ");
				choiceCode = input.nextInt();
				mainMenu(choiceCode);
				System.out.println();  
			}while(choiceCode>=1 && choiceCode<=4);
			
			
		}else{
			System.out.println("\n\nLogin Faild."); 	
		}
	}
	
	public void mainMenu(int choiceCode){
		if(choiceCode == 1){
			System.out.println("Your Balance: $338765.98");
		}else if(choiceCode == 2){
			System.out.println("Withdraw");
		}else if(choiceCode == 3){
			System.out.println("Deposite");
		}else if(choiceCode == 4){
			System.out.println("Successfully Exit!");
		}else{
			System.out.println("\nIncorrect Number, Please Enter the correct number(1-4)");
		}
	}
}
