package com.jforce.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jforce.model.Personel;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
			
			Personel personel = applicationContext.getBean("personelBean",Personel.class);
			personel.personelInfo();
			
		applicationContext.close();
	}
}
