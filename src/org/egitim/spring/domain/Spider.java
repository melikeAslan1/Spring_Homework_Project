package org.egitim.spring.domain;

public class Spider extends Animal {

	protected Spider(int legs) {
		
		super(legs);
		
		
	}

	@Override
	public void eat() {
		
		System.out.println("yeme gerceklesti");
		
		
	}

}
