package com.nitisoft.docker;

public class HelloWorldPing {
	
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 100; i++){
			System.out.println("Nitisoft Hello World Ping " + i );
			Thread.sleep(1000);
		}
	}
}
