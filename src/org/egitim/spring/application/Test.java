package org.egitim.spring.application;

import org.egitim.spring.domain.Animal;
import org.egitim.spring.domain.Cat;
import org.egitim.spring.domain.Spider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		Animal animal = (Animal) context.getBean("animal");
				
	    System.out.println(animal);	
		
		animal.walk(5);
		
		Spider spider = (Spider) context.getBean("spider");
		
		spider.eat();
		
		Cat cat = (Cat) context.getBean("cat");
		
		cat.walk(3);
		
		

	}

}
