package com.Alfonso20180614;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class PacienteBO {
	
	ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	
	//INGRESO
	public void ingreso(Paciente paciente){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
				
		
		session.save(paciente);
		
		transaction.commit();
		session.close();
		
	}
	
	//BAJA
	public void baja(int id) {
		
		Paciente paciente = new Paciente();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		
		Query hqlQuery = session.createQuery("DELETE FROM Paciente WHERE id=(:condicion)"); //"DELETE FROM Paciente p WHERE p.id=(:condicion)"
		hqlQuery.setParameter("condicion", id);
		
		hqlQuery.executeUpdate();	
		transaction.commit();
		session.close();

	}

	
	//ESCOGER UN PACIENTE EN CONCRETO
	public Paciente getPaciente(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Paciente> hqlQuery = session.createQuery("FROM Paciente WHERE id=(:condicion)");
		hqlQuery.setParameter("condicion", id);
		
		Paciente paciente = hqlQuery.uniqueResult();
		
		session.close();
		return paciente;
	}
	
	//MODIFICACION
	public void modificacion(Paciente paciente) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
				
		session.update(paciente);
		transaction.commit();
		session.close();
		
	}
	
	//CONSULTA
	public ArrayList<Paciente> consulta() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Paciente> hqlQuery = session.createQuery("FROM Paciente");
		
		ArrayList<Paciente> pacientes =(ArrayList) hqlQuery.list();
		
		session.close();
		
		return pacientes;	
			
	}
	
	
}
