package com.Alfonso20180629;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ViajeBO {

	//ALTA
	public void alta(Viaje viaje) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(viaje);
		
		transaction.commit();
		session.close();
	}
	
	//CONSULTA
	public List<Viaje> consulta(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM Viaje");
		
		List<Viaje> viajes  = query.list();
		
		session.close();
		return viajes;
	}
	
	//COGER 1 VIAJE
	public Viaje  getViaje(Viaje viaje){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Viaje v = session.get(Viaje.class, viaje.getId());
		
		session.close();
		
		return v;
	}
	
	//MODIFICACIÓN
	public void  modifica(Viaje viaje){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.update(viaje);
		
		transaction.commit();
		session.close();
		
	}
	
	//BAJA
	public void  baja(Viaje viaje){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.remove(viaje);
		
		transaction.commit();
		session.close();
		
	}
	
}
