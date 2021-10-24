package org.egitim.spring.domain;

public abstract class Animal {
	
	protected int legs;
	
	String name;
	
	

	protected Animal(int legs) {
		super();
		this.legs = legs;
	}

	public abstract void eat();
	
	public void walk(int legs) {
		
		System.out.println(legs + "bacakla yurume yapildi.");
		
		
	}
	
	
	

}
