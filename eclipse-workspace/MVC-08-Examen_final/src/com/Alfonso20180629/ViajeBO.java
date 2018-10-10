package com.Alfonso20180629;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class ViajeBO {
	
	ArrayList<Viaje> viajes = new ArrayList();

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
	
	//ESCOGER 1 VIAJE EN CONCRETO
	public Viaje getViaje(int id) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Viaje> hqlQuery = session.createQuery("FROM Viaje WHERE id=(:condicion)");
		hqlQuery.setParameter("condicion", id);
		
		Viaje viaje = hqlQuery.uniqueResult();
		
		session.close();
		
		return viaje;
	}
	
	
	//MODIFICACIÓN
	public void modifica(Viaje viaje){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.update(viaje);
		
		transaction.commit();
		session.close();
		
	}
	
	//BAJA	
	public void baja(int id) {
		
		Viaje viaje = new Viaje();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		
		Query hqlQuery = session.createQuery("DELETE FROM Viaje WHERE id=(:condicion)");
		hqlQuery.setParameter("condicion", id);
		
		hqlQuery.executeUpdate();	
		
		transaction.commit();
		session.close();

	}
	
}