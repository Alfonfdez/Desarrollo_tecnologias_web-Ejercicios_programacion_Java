package com.Alfonso20180522;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainInsercion {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();

		Servicio servicio = new Servicio();

		Scanner lector = new Scanner(System.in);

		boolean salirprograma = false;

		while (salirprograma == false) {

			System.out.println("¿Qué deseas hacer?");
			System.out.println("1 - Insertar un nuevo paciente");
			System.out.println("2 - Eliminar un paciente");
			System.out.println("3 - Modificar los datos de un paciente");
			System.out.println("4 - Mostrar todos los pacientes almacenados");
			System.out.println("5 - Salir del programa");

			int opcion = lector.nextInt();

			switch (opcion) {

				case 1:
	
					System.out.println("Introduce su nombre");
					String nombre = lector.next();
	
					System.out.println("Introduce su apellido");
					String apellidos = lector.next();
	
					SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
					System.out.println("Introduce su fecha de alta (dd-MM-yyyy)");
					Date fecha_alta;
	
					try {
						fecha_alta = s.parse(lector.next());
						servicio.nuevoPaciente(nombre, apellidos, fecha_alta);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	
				break;
				
	
				case 2:
	
					System.out.println("Introduce su ID");
					int id = lector.nextInt();
	
					servicio.eliminarPaciente(id);
	
				break;
				
	
				case 3:
	
					System.out.println("Introduce su ID");
					int id2 = lector.nextInt();
	
					servicio.eliminarPaciente(id2);
	
					System.out.println("Introduce su nombre");
					String nombre2 = lector.next();
	
					System.out.println("Introduce su apellido");
					String apellidos2 = lector.next();
	
					SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yyyy");
					System.out.println("Introduce su fecha de alta (dd-MM-yyyy)");
					Date fecha_alta2;
	
					try {
						fecha_alta2 = s1.parse(lector.next());
	
						Paciente paciente = new Paciente();
						paciente.setNombre(nombre2);
						paciente.setApellidos(apellidos2);
						paciente.setFecha_alta(fecha_alta2);
	
						servicio.modificarPaciente(paciente);
	
						session.save(paciente);
						transaction.commit();
						session.close();
	
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	
				break;
				
	
				case 4:
	
					List<Paciente> pacientes = servicio.consultaPaciente();
					Iterator<Paciente> it = pacientes.iterator();
	
				break;
				
	
				case 5:
	
					salirprograma = true;
					
				break;
				
	
				default:
	
					System.out.println("Opción no especificada");
	
				break;

			}

		}

	}

}
