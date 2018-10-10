package com.Alfonso20180430_alta_baja_modificacion_consulta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Servicio servicio = new Servicio();

		Scanner lector = new Scanner(System.in);

		while (true) {

			System.out.println("¿Qué deseas hacer?");
			System.out.println("1 - Insertar un nuevo alumno");
			System.out.println("2 - Eliminar un alumno");
			System.out.println("3 - Modificar los datos de un alumno");
			System.out.println("4 - Mostrar todos los alumnos almacenados");

			int opcion = lector.nextInt();

			if (opcion == 1) {
				System.out.println("Introduce su nombre");
				String nombre = lector.next();
				System.out.println("Introduce su edad");
				int edad = lector.nextInt();
				servicio.nuevoAlumno(nombre, edad);

			} else if (opcion == 2) {
				System.out.println("Introduce su nombre");
				String nombre = lector.next();

				servicio.eliminarAlumno(nombre);

			} else if (opcion == 3) {
				System.out.println("Introduce su nombre para modificarlo");
				String nombre1 = lector.next();

				System.out.println("Introduce el nuevo nombre");
				String nombre2 = lector.next();

				System.out.println("Introduce la edad");
				int edad2 = lector.nextInt();
				servicio.modificarAlumno(nombre1, nombre2, edad2);

			} else if (opcion == 4) {
				ArrayList<Alumno> alumnos = servicio.getAlumno();

				Iterator<Alumno> it = alumnos.iterator();

				while (it.hasNext()) {
					Alumno alumno = it.next();
					System.out.println("Nombre: " + alumno.getNombre() + " - Edad: " + alumno.getEdad());
				}
			} else
				;
		}

	}

}
