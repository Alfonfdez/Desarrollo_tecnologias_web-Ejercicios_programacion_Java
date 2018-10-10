package com.Alfonso20180518_Vehiculos;

import org.hibernate.Session;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class MainConsulta {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		// 1) Listar las matrículas de todos los vehículos.
		Query<Vehiculo> hqlQuery1 = session.createQuery("FROM Vehiculo");

		List<Vehiculo> vehiculos1 = hqlQuery1.list();
		Iterator<Vehiculo> it1 = vehiculos1.iterator();
		System.out.println("");
		System.out.println("1a consulta: Listar las matrículas de todos los vehículos.");
		System.out.println("");
		while (it1.hasNext()) {
			Vehiculo v1 = it1.next();
			System.out.println("Matricula: "+v1.getMatricula()+" - Asientos: "+v1.getAsientos()+" - Ruedas: "+v1.getRuedas()+" - Marca: "+v1.getMarca());
			System.out.println("");
		}	
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		
		
		// 2) Listar la matrícula y la marca de todos los vehículos ordenados por número de ruedas.
		Query<Vehiculo> hqlQuery2 = session.createQuery("FROM Vehiculo ORDER BY ruedas");
			
		List<Vehiculo> vehiculos2 = hqlQuery2.list();
		Iterator<Vehiculo> it2 = vehiculos2.iterator();
		System.out.println("");
		System.out.println("2a consulta: Listar la matrícula y la marca de todos los vehículos ordenados por número de ruedas.");
		System.out.println("");
		while (it2.hasNext()) {
			Vehiculo v2 = it2.next();
			System.out.println("Matricula: "+v2.getMatricula()+" - Asientos: "+v2.getAsientos()+" - Ruedas: "+v2.getRuedas()+" - Marca: "+v2.getMarca());
			System.out.println("");
		}	
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		
		
		// 3) Listar la matrícula de todos los vehículos que tengan más de dos asientos y más de dos ruedas.
		Query<Vehiculo> hqlQuery3 = session.createQuery("FROM Vehiculo WHERE ruedas>2 AND asientos>2");
		
		List<Vehiculo> vehiculos3 = hqlQuery3.list();
		Iterator<Vehiculo> it3 = vehiculos3.iterator();
		System.out.println("");
		System.out.println("3a consulta: Listar la matrícula de todos los vehículos que tengan más de dos asientos y más de dos ruedas.");
		System.out.println("");
		while (it3.hasNext()) {
			Vehiculo v3 = it3.next();
			System.out.println("Matricula: "+v3.getMatricula()+" - Asientos: "+v3.getAsientos()+" - Ruedas: "+v3.getRuedas()+" - Marca: "+v3.getMarca());
			System.out.println("");
		}	
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		
		
		// 4) Listar la matrícula de todos los vehículos que tengan más de dos asientos o más de dos ruedas.
		Query<Vehiculo> hqlQuery4 = session.createQuery("FROM Vehiculo WHERE ruedas>2 OR asientos>2");
				
		List<Vehiculo> vehiculos4 = hqlQuery4.list();
		Iterator<Vehiculo> it4 = vehiculos4.iterator();
		System.out.println("");
		System.out.println("4a consulta: Listar la matrícula de todos los vehículos que tengan más de dos asientos o más de dos ruedas.");
		System.out.println("");
		while (it4.hasNext()) {
			Vehiculo v4 = it4.next();
			System.out.println("Matricula: "+v4.getMatricula()+" - Asientos: "+v4.getAsientos()+" - Ruedas: "+v4.getRuedas()+" - Marca: "+v4.getMarca());
			System.out.println("");
		}	
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		
		
		// 5) Listar la matrícula de todos los vehículos que tengan una matrícula de menos de seis caracteres (where length(v.matricula)<?).
		Query<Vehiculo> hqlQuery5 = session.createQuery("FROM Vehiculo WHERE length(matricula)<6");
				
		List<Vehiculo> vehiculos5 = hqlQuery5.list();
		Iterator<Vehiculo> it5 = vehiculos5.iterator();
		System.out.println("");
		System.out.println("5a consulta: Listar la matrícula de todos los vehículos que tengan una matrícula de menos de seis caracteres");
		System.out.println("");
		while (it5.hasNext()) {
			Vehiculo v5 = it5.next();
			System.out.println("Matricula: "+v5.getMatricula()+" - Asientos: "+v5.getAsientos()+" - Ruedas: "+v5.getRuedas()+" - Marca: "+v5.getMarca());
			System.out.println("");
		}	
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		
		
		// 6) Listar la matrícula de todos los vehículos que hayan tenido un siniestro con perdida mayor de 1000 euros.
		Query<Vehiculo> hqlQuery6 = session.createQuery("SELECT v FROM Vehiculo v JOIN v.siniestros s WHERE s.perdida>1000");
				
		List<Vehiculo> vehiculos6 = hqlQuery6.list();
		Iterator<Vehiculo> it6 = vehiculos6.iterator();
		System.out.println("");
		System.out.println("6a consulta: Listar la matrícula de todos los vehículos que hayan tenido un siniestro con perdida mayor de 1000 euros.");
		System.out.println("");
		while (it6.hasNext()) {
			Vehiculo v6 = it6.next();
			System.out.println("Matricula: "+v6.getMatricula()+" - Asientos: "+v6.getAsientos()+" - Ruedas: "+v6.getRuedas()+" - Marca: "+v6.getMarca());
			System.out.println("");
		}	
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		
		
		/* 7) Listar la matrícula de todos los vehículos que hayan tenido un siniestro con perdida mayor de 1000 euros. Mostrar a cuanto ascendió la pérdida. 
		Almacenar el resultado de la consulta en:
			b) Una lista de beans VehiculoSiniestro, que tendrán cada uno dos propiedades, Vehiculo e Integer. Habrá que crear la clase VehiculoSiniestro con su correspondiente constructor.
			select new com.pablomonteserin.main.VehiculoSiniestro(v, s.perdida)...*/
		Query<VehiculoSiniestro> hqlQuery7 = session.createQuery("SELECT new com.Alfonso20180518_Vehiculos.VehiculoSiniestro (v, s.perdida) FROM Vehiculo v JOIN v.siniestros s WHERE s.perdida>1000");
						
		List<VehiculoSiniestro> vehiculos7 = hqlQuery7.list();
		Iterator<VehiculoSiniestro> it7 = vehiculos7.iterator();
		System.out.println("");
		System.out.println("7a consulta: Listar la matrícula de todos los vehículos que hayan tenido un siniestro con perdida mayor de 1000 euros. Mostrar a cuanto ascendió la pérdida.");
		System.out.println("");
		while (it7.hasNext()) {
			VehiculoSiniestro v7 = it7.next();
			System.out.println("Matricula: "+v7.getVehiculo().getMatricula()+" - Asientos: "+v7.getVehiculo().getAsientos()+" - Ruedas: "+v7.getVehiculo().getRuedas()+" - Marca: "+v7.getVehiculo().getMarca()+" - Perdida: "+v7.getPerdida());
			System.out.println("");
		}	
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		
		
		
		session.close();

		

	}
}
