package com.app;

public class Airtel implements Sim{
	
	@Override
	public void calling() {
		System.out.println("Calling Using Airtel SIM");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing Data using Airtel SIM");
		
	}

}
