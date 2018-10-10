package com.Alfonso20180611;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class InvitadosBO {
	
	ArrayList<Invitado> invitados = new ArrayList<Invitado>();
	
	public void altaInvitado(Invitado invitado) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(invitado);
		transaction.commit();
		session.close();
	}

	public void bajaInvitado(Invitado invitado) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Query hqlQuery = session.createQuery("DELETE FROM Invitado WHERE nombre=(:condicion)");
		hqlQuery.setParameter("condicion", invitado.getNombre());
		hqlQuery.executeUpdate();	
		transaction.commit();
		session.close();

	}
	
	public ArrayList<Invitado> consulta() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Invitado> hqlQuery = session.createQuery("FROM Invitado");
		ArrayList<Invitado> invitados =(ArrayList) hqlQuery.list();
		session.close();
		return invitados;

	}

}
