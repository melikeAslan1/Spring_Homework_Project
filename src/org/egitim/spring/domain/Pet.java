package org.egitim.spring.domain;

public interface Pet {
	
	public static final String name = "";
	
	public static String getName() {
		
		return name;
	}
	
	public static void setName (String name) {
		
		this.name=name;
	}
	
	public static void play() {
		
		System.out.println("play metodu calisti");
	}
	

}
