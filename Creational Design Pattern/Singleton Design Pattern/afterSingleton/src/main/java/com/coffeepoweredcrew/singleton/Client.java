package com.coffeepoweredcrew.singleton;

public class Client {

	public static void main(String[] args) {
		EagerRegistry singleton;
		
		
		singleton = EagerRegistry.getInstance();
		EagerRegistry singleton2 = EagerRegistry.getInstance();
		System.out.println(singleton == singleton2);
	}

}
