package com.Alfonso20180626;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;



public class MalabarBO {
	
	ArrayList<Malabar> malabares = new ArrayList();

	//ALTA
	public void alta (Malabar malabar) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
				
		
		session.save(malabar);
		
		transaction.commit();
		session.close();
		
	}
	
	//CONSULTA
	public ArrayList<Malabar> consulta() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Malabar> hqlQuery = session.createQuery("FROM Malabar");
		
		ArrayList<Malabar> malabares =(ArrayList) hqlQuery.list();
		
		session.close();
		
		return malabares;	
			
	}
	
	//ESCOGER UN MALABAR EN CONCRETO
	public Malabar getMalabar(int id) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Malabar> hqlQuery = session.createQuery("FROM Malabar WHERE id=(:condicion)");
		hqlQuery.setParameter("condicion", id);
		
		Malabar malabar = hqlQuery.uniqueResult();
		
		session.close();
		
		return malabar;
	}
	
	//MODIFICACION
	public void modificacion(Malabar malabar) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
				
		session.update(malabar);
		
		transaction.commit();
		session.close();
		
	}
	
	//ELIMINACION	
	public void eliminacion(int id) {
		
		Malabar malabar = new Malabar();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		
		Query hqlQuery = session.createQuery("DELETE FROM Malabar WHERE id=(:condicion)");
		hqlQuery.setParameter("condicion", id);
		
		hqlQuery.executeUpdate();	
		
		transaction.commit();
		session.close();

	}
	
	
}
