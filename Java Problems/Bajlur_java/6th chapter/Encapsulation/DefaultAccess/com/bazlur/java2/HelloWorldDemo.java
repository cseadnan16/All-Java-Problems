package com.bazlur.java2;

import com.bazlur.java.HelloWorld;

public class HelloWorldDemo {

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		String version = hello.version;
		System.out.println(version);
		
		hello.getRandomInt();

	}

}

