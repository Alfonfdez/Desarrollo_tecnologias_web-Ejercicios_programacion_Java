package com.Alfonso20180515_Examen_Libreria;

import java.util.ArrayList;
import java.util.Iterator;

public class LibroBO {

	ArrayList<Libro> libros = new ArrayList<Libro>();

	// método añadir nuevo libro: título, ISBN, precio
	public void add(String titulo, String isbn, double precio) {
		Libro libro = new Libro();
		libro.setTitulo(titulo);
		libro.setIsbn(isbn);
		libro.setPrecio(precio);

		libros.add(libro);

	}

	// método eliminar libro por ISBN
	public void remove(String isbn) {
		Iterator<Libro> it = libros.iterator();
		while (it.hasNext()) {
			Libro libro = it.next();
			if (libro.getIsbn().equals(isbn)) {
				it.remove();
			}
		}
	}

	// método modificar libro por ISBN
	public void update(String isbn2, String titulo2, double precio2) throws LasOEstanProhibidasException {
	
	
			Iterator<Libro> it = libros.iterator();
			while (it.hasNext()) {
	
				Libro libro = it.next();
				if(libro.getIsbn().equals(isbn2)) {
					
					if (libro.getTitulo().contains("O") || libro.getTitulo().contains("o")) {
						throw new LasOEstanProhibidasException();
					} 
					
					else {
						
					libro.setTitulo(titulo2);
					libro.setPrecio(precio2);
					
					}
				}
			}
		
		}

	

	// método consulta de los libros introducidos
	public ArrayList<Libro> list(double precio3) {

		return libros;

	}

}
