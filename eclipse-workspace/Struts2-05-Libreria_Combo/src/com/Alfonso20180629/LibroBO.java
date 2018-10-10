package com.Alfonso20180629;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class LibroBO {

	//ALTA
	public void alta(Libro libro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(libro);
		
		transaction.commit();
		session.close();
	}
	
	//CONSULTA
	public List<Libro> consulta(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM Libro");
		
		List<Libro> libros  = query.list();
		
		session.close();
		return libros;
	}
	
	//COGER 1 LIBRO
	public Libro  getLibro(Libro libro){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Libro l = session.get(Libro.class, libro.getId());
		
		session.close();
		
		return l;
	}
	
	//MODIFICACIÓN
	public void  modifica(Libro libro){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.update(libro);
		
		transaction.commit();
		session.close();
		
	}
	
	//BAJA
	public void  baja(Libro libro){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.remove(libro);
		
		transaction.commit();
		session.close();
		
	}
	
}
