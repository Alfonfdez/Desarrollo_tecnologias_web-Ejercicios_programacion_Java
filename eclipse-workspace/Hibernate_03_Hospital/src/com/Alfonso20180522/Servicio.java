package com.Alfonso20180522;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Servicio {

	public void nuevoPaciente(String nombre, String apellidos, Date fecha_alta) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();
		Paciente p1 = new Paciente();
		p1.setNombre(nombre);
		p1.setApellidos(apellidos);
		p1.setFecha_alta(fecha_alta);
		
				
		session.save(p1);
		transaction.commit();
		session.close();
		
	}
	
	public void eliminarPaciente(int id) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query hqlQuery2 = session.createQuery("delete from Paciente where id=(:condicion)");
		hqlQuery2.setParameter("condicion", id);
		hqlQuery2.executeUpdate();
		
		transaction.commit();
		session.close();
	}
	
	
	public void modificarPaciente(Paciente paciente) {
		
	}
	
	
	public List<Paciente> consultaPaciente() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Query<Paciente> hqlQuery = session.createQuery("FROM  Paciente");

		List<Paciente> pacientes = hqlQuery.list();
		Iterator<Paciente> it = pacientes.iterator();
		
		session.close();
		
		return pacientes;
	}


}
