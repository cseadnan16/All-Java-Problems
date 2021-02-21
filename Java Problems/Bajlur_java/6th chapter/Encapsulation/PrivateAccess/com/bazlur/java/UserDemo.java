package com.bazlur.java;

class User{
	private String name;
	private String emailAddress;
	
	public String getName(){
		return name;
	}	
	public void setName(String name){
		this.name = name;
	}
	
	
	public String getEmailAddress(){
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
	}
}

public class UserDemo {
	public static void main(String[] args) {
		User user = new User();
		
		user.setName("Adnan");
		user.setEmailAddress("adnanan.cse2016@gmail.com");
		
		System.out.println("Name: " + user.getName());
		System.out.println("Email Address: " + user.getEmailAddress());
		
	}

}
