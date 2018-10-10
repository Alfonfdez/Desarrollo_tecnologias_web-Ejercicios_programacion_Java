package com.Alfonso20180603_Prueba_CRUD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Servicio servicio = new Servicio();

		Scanner lector = new Scanner(System.in);

		boolean dentroPrograma = false;

		while (dentroPrograma == false) {

			System.out.println("¿Qué operación desea realizar?");
			System.out.println("1 - Añadir alumno");
			System.out.println("2 - Eliminar alumno");
			System.out.println("3 - Modificar alumno");
			System.out.println("4 - Consultar alumnos");
			System.out.println("5 - Salir del programa");
			
			int opcion = lector.nextInt();

			if (opcion == 1) {
				
				System.out.println("Inserte el nombre del alumno");
				String nombre = lector.next();
				System.out.println("Inserte la edad del alumno");
				int edad = lector.nextInt();
				
				servicio.nuevoAlumno(nombre, edad);
				
			} else if (opcion == 2) {
				
				System.out.println("Elimine el alumno por su nombre");
				String nombre = lector.next();
				
				servicio.eliminarAlumno(nombre);
				
			} else if (opcion == 3) {
				
				System.out.println("Modifique el alumno por su nombre");
				String nombre = lector.next();
				
				
				System.out.println("Inserte el nombre del nuevo alumno");
				String nombre2 = lector.next();
				System.out.println("Inserte la edad del nuevo alumno");
				int edad2 = lector.nextInt();
				
				servicio.modificarAlumno(nombre, nombre2, edad2);
				
			} else if (opcion == 4) {
				
				ArrayList<Alumno> alumnos = servicio.getAlumno();

				Iterator<Alumno> it = alumnos.iterator();

				while (it.hasNext()) {
					Alumno alumno = it.next();
					System.out.println("Nombre: " + alumno.getNombre() + " - Edad: " + alumno.getEdad());
				}

			} else if (opcion == 5) {
				dentroPrograma=true;
			}

		}

	}

}
