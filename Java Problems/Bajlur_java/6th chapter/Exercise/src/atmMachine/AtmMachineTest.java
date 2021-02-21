package atmMachine;

import java.util.Scanner;

public class AtmMachineTest {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter your account No: ");
		String accountNo = input.next();
		
		System.out.print("Enter your password: ");
		String password= input.next();
		
		ATM_Machine_Backend_Function machine = new ATM_Machine_Backend_Function();
		
		machine.setLogin(accountNo, password);
		machine.Login();	
	}
}
