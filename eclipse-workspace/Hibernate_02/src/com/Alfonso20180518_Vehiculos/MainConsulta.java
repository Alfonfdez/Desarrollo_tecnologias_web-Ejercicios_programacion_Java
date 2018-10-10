package com.Alfonso20180518_Vehiculos;

import org.hibernate.Session;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class MainConsulta {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		Query<Vehiculo> hqlQuery = session.createQuery("FROM vehiculo");


		List<Vehiculo> vehiculos = hqlQuery.list();
		Iterator<Vehiculo> it = vehiculos.iterator();
		System.out.println("1a consulta");
		while (it.hasNext()) {
			Vehiculo v = it.next();
			System.out.println(v.getMatricula());
		}	
		
		/*Query<Vehiculo> hqlQuery2 = session.createQuery("FROM vehiculo ORDER BY ruedas");
			
		List<Vehiculo> vehiculos2 = hqlQuery2.list();
		Iterator<Vehiculo> it2 = vehiculos2.iterator();
		System.out.println("2a consulta");
		while (it.hasNext()) {
			Vehiculo v2 = it2.next();
			System.out.println(v2.getRuedas());	
			
			
		}*/
		
		/*Query<Vehiculo> hqlQuery3 = session.createQuery("FROM vehiculo WHERE ruedas>2 & asientos>2");
		
		List<Vehiculo> vehiculos3 = hqlQuery3.list();
		Iterator<Vehiculo> it3 = vehiculos3.iterator();
		System.out.println("3a consulta");
		while (it.hasNext()) {
			Vehiculo v3 = it3.next();
			System.out.println(v3.getRuedas());	
			
			
		}*/
		
			session.close();

		

	}
}
