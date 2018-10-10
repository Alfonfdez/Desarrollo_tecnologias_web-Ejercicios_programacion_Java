package com.Alfonso20180704;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Alfonso20180704.beans.TraductorEspanol;
import com.Alfonso20180704.beans.TraductorIngles;

public class Main3_conSpring {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		ITraductor traductor = (ITraductor) context.getBean("traductor");
	
		
		traductor.traduceloPlease("hola");

	}

}
