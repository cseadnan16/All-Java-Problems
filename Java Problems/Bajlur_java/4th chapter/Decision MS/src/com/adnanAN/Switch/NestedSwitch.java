package com.adnanAN.Switch;

//import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		int count = 1;
		String status = "Active";
		
		switch(count){
			case 1:
				switch(status){
					case "Active":
						System.out.println("System active");
						break;
					case "Closed":
						System.out.println("System closed");
						break;
					default:
						System.out.println("System error");
						break;
				}
				break;
			default:
				break;
		}
		
	}
}
