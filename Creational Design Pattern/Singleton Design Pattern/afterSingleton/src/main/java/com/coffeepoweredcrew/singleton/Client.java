package com.coffeepoweredcrew.singleton;

public class Client {

	public static void main(String[] args) {
		EagerRegistry singleton;
		
		
		singleton = EagerRegistry.getInstance();
		EagerRegistry singleton2 = EagerRegistry.getInstance();
		System.out.println(singleton == singleton2);
		
		LazyRegistryWithDCL lazysingleton1=LazyRegistryWithDCL.getInstance();
		
		LazyRegistryWithDCL lazysingleton2=LazyRegistryWithDCL.getInstance();
		
		System.out.println(lazysingleton1 == lazysingleton2);
		
		LazyRegistryIODH lazyRegistryIODH1= LazyRegistryIODH.getInstance();
		
		LazyRegistryIODH lazyRegistryIODH2= LazyRegistryIODH.getInstance();
		
		System.out.println(lazyRegistryIODH1 == lazyRegistryIODH2);
		
	}

}
