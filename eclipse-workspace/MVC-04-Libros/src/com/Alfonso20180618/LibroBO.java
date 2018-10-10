package com.Alfonso20180618;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class LibroBO {

	ArrayList<Libro> libros = new ArrayList<Libro>();
	
	
	//ALTA LIBRO
	public void alta(Libro libro) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(libro);
		
		transaction.commit();
		session.close();
		
	}
	
	//BAJA LIBRO
	public void baja(int id) {
		
		Libro libro = new Libro();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		
		Query hqlQuery = session.createQuery("DELETE FROM Libro WHERE id=(:condicion)");
		hqlQuery.setParameter("condicion", id);
		
		hqlQuery.executeUpdate();	
		transaction.commit();
		session.close();

	}
	
	//CONSULTA LIBROS
	public ArrayList<Libro> consulta(){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Libro> hqlQuery = session.createQuery("FROM Libro");
		
		ArrayList<Libro> libros =(ArrayList) hqlQuery.list();
		
		session.close();		
		
		return libros;
		
	}
	
	//MODIFICACION DE UN LIBRO
	public void modificacion(int id, String titulo, float precio) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
				
		Libro libro = new Libro();
		
		libro.setId(id);
		libro.setTitulo(titulo);
		libro.setPrecio(precio);

		session.update(libro);
		transaction.commit();
		session.close();
		
	}
	
}
