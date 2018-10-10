package com.Alfonso20180518_Vehiculos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainInsercion {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Vehiculo vehiculo = new Vehiculo();
		Vehiculo vehiculo2 = new Vehiculo();
		Vehiculo vehiculo3 = new Vehiculo();
		
		

		//Set de matrícula
		vehiculo.setMatricula("1234-BBB");
		vehiculo2.setMatricula("5678-BBB");
		vehiculo3.setMatricula("1234-CCC");
		
		//Set de asientos
		vehiculo.setAsientos(5);
		vehiculo2.setAsientos(4);
		vehiculo3.setAsientos(2);
		
		//Set de ruedas
		vehiculo.setRuedas(4);
		vehiculo2.setRuedas(2);
		vehiculo3.setRuedas(3);
		
		//Set de marcas
		vehiculo.setMarca("Opel");
		vehiculo2.setMarca("Citroen");
		vehiculo3.setMarca("Audi");
		
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		Date fecha;
		
		try {
			fecha = s.parse("10-02-2017");
			Date fecha2 = s.parse("10-03-2017");
			Date fecha3 = s.parse("23-04-2017");
			Date fecha4 = s.parse("05-03-2016");
			Date fecha5 = s.parse("15-01-2018");
			Date fecha6 = s.parse("01-12-2005");
			Date fecha7 = s.parse("30-04-2011");
			Date fecha8 = s.parse("28-02-2012");
			Date fecha9 = s.parse("10-06-2013");
			Date fecha10 = s.parse("10-11-2002");
			Date fecha11 = s.parse("20-08-1999");
			Date fecha12 = s.parse("10-03-2000");
			Date fecha13 = s.parse("19-07-2014");
			
			//Lista 1 del coche 1 con varios Siniestros
			List<Siniestro> siniestros = new ArrayList<Siniestro>();
			siniestros.add(new Siniestro(vehiculo, fecha, 1000));
			siniestros.add(new Siniestro(vehiculo, fecha2, 2000));
			siniestros.add(new Siniestro(vehiculo, fecha3, 3000));
			
			//Lista 2 del coche 2 con varios Siniestros
			List<Siniestro> siniestros2 = new ArrayList<Siniestro>();
			siniestros2.add(new Siniestro(vehiculo2, fecha4, 500));
			siniestros2.add(new Siniestro(vehiculo2, fecha5, 5000));
			siniestros2.add(new Siniestro(vehiculo2, fecha6, 900));
			siniestros2.add(new Siniestro(vehiculo2, fecha7, 2300));
			
			//Lista 3 del coche 3 con varios Siniestros
			List<Siniestro> siniestros3 = new ArrayList<Siniestro>();
			siniestros3.add(new Siniestro(vehiculo3, fecha8, 700));
			siniestros3.add(new Siniestro(vehiculo3, fecha9, 200));
			siniestros3.add(new Siniestro(vehiculo3, fecha10, 9000));
			siniestros3.add(new Siniestro(vehiculo3, fecha11, 6300));
			siniestros3.add(new Siniestro(vehiculo3, fecha12, 7400));
			siniestros3.add(new Siniestro(vehiculo3, fecha13, 1250));
			
			
			
		
			//Set de siniestros
			vehiculo.setSiniestros(siniestros);
			vehiculo2.setSiniestros(siniestros2);
			vehiculo3.setSiniestros(siniestros3);
			

			
			session.save(vehiculo);
			session.save(vehiculo2);
			session.save(vehiculo3);
			transaction.commit();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		session.close();

	}

}
