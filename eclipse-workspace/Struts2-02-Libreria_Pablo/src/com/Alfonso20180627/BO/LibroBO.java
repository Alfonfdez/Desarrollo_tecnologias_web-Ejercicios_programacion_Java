package com.Alfonso20180627.BO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.Alfonso20180627.entity.Libro;
import com.Alfonso20180627.utils.HibernateUtil;

public class LibroBO {
	
	//ALTA
	public void alta(Libro libro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(libro);
		
		transaction.commit();
		session.close();
	}
	
	//BORRAR
	public void borra(Libro libro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.remove(libro);
		
		transaction.commit();
		session.close();
	}
	
	//ACTUALIZAR
	public void actualizaOMuere(Libro libro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(libro);
		
		transaction.commit();
		session.close();

	}
	
	//LISTA DE LIBROS
	public List<Libro> list(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query hqlQuery = session.createQuery("FROM  Libro");
		List<Libro> libros = hqlQuery.list();
		
		session.close();
		return libros;
	}
	
	//COGER 1 SOLO LIBRO
	public Libro getLibro(Libro libro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String queryString = "FROM Libro where id=(:condicion)";
		Query<Libro> hqlQuery = session.createQuery(queryString);
		hqlQuery.setParameter("condicion", libro.getId());
		libro = hqlQuery.uniqueResult();
		session.close();
		return libro;
	}
	
}
