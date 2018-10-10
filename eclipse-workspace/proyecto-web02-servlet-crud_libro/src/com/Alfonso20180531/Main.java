package com.Alfonso20180531;

import org.hibernate.Session;


public class Main {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Libro libro1 = new Libro();
		
		libro1.setIsbn("1234");
		libro1.setTitulo("hola");
		libro1.setPrecio(500);
		
		Libro libro2 = new Libro();
		
		libro2.setIsbn("5678");
		libro2.setTitulo("adios");
		libro2.setPrecio(1000);
		
		Libro libro3 = new Libro();
		
		libro3.setIsbn("9876");
		libro3.setTitulo("hastapronto");
		libro3.setPrecio(1500);

				
		session.save(libro1);
		session.save(libro2);
		session.save(libro3);
		
		session.close();

	}

}
