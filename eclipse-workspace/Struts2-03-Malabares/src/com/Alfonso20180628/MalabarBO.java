package com.Alfonso20180628;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class MalabarBO {

	//ALTA
	public void alta(Malabar malabar) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(malabar);
		
		transaction.commit();
		session.close();	
	}
	
	//CONSULTA
	public List<Malabar> consulta(){	
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM Malabar");
		
		List<Malabar> malabares  = query.list();
		
		session.close();
		return malabares;	
	}
	
	//COGER 1 MALABAR
	public Malabar getMalabar(Malabar malabar){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Malabar m = session.get(Malabar.class, malabar.getId());
		
		session.close();
		
		return m;
	}
	
	//MODIFICACIÓN
	public void  modifica(Malabar malabar){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.update(malabar);
		
		transaction.commit();
		session.close();
	}
	
	//BAJA
	public void  baja(Malabar malabar){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.remove(malabar);
		
		transaction.commit();
		session.close();	
	}
	
}
