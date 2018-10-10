package com.Alfonso20180515_Examen_Libreria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		LibroBO servicio = new LibroBO();

		Scanner lector = new Scanner(System.in);

		boolean accesolibreria = true;

		while (accesolibreria == true) {

			System.out.println("¿Qué operación desea realizar?");
			System.out.println("1 - Añadir un nuevo libro");
			System.out.println("2 - Eliminar un nuevo libro");// Escribir el ISBN para eliminar libro
			System.out.println("3 - Modificar un libro");// Escribir el ISBN para modificar libro. Se modifica título y
															// precio
			System.out.println("4 - Mostrar el catálogo de libros");// Pedir después el precio a
																	// partir
																	// del cual se mostrarán los
																	// libros
			System.out.println("5 - Para salir del programa");

			int opcion = lector.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("Introduzca su título");
				String titulo = lector.next();

				System.out.println("Introduzca su ISBN (Consiste en 13 dígitos 'EAN13'. Ejemplo: 0123456789012)");
				String isbn = lector.next();

				System.out.println("Introduzca su precio");
				double precio = lector.nextInt();

				servicio.add(titulo, isbn, precio);

				break;

			case 2:

				System.out.println("Introduzca el ISBN del libro que quiere eliminar");
				String isbn1 = lector.next();

				servicio.remove(isbn1);

				break;

			case 3:

				System.out.println("Introduzca el ISBN del libro que quiere modificar");
				String isbn2 = lector.next();
				
				System.out.println("Introduzca el nuevo título");
				String titulo2 = lector.next();

				System.out.println("Introduzca el nuevo precio");
				double precio2 = lector.nextInt();

				try {
					servicio.update(isbn2, titulo2, precio2);
				} catch (LasOEstanProhibidasException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 4:

				System.out.println(
						"Introduzca el precio a partir del cual se mostrarán aquellos libros superiores a este precio");
				double precio3 = lector.nextInt();

				ArrayList<Libro> libros = servicio.list(precio3);

				Iterator<Libro> it = libros.iterator();

				while (it.hasNext()) {
					Libro libro = it.next();
					if (libro.getPrecio() > precio3) {
						System.out.println("Nombre: " + libro.getTitulo() + " - ISBN: " + libro.getIsbn()
								+ " - Precio: " + libro.getPrecio());
					}

				}

				break;

			case 5:

				boolean salirprograma = true;

				while (salirprograma == true) {

					System.out.println("¿Está seguro de que quiere salir del programa de la librería? (Y/N)");

					String salir = lector.next().toUpperCase();

					if (salir.equals("Y")) {
						accesolibreria = false;
						salirprograma = false;
					}

					else if (salir.equals("N")) {
						salirprograma = false;
					}

					else {

					}

				} // Fin del bucle 'while' de 'salirprograma'

				break;

			default:

				System.out.println("Opción no especificada");

				break;

			}

		}

	}

}

// Fin del bucle 'while'
