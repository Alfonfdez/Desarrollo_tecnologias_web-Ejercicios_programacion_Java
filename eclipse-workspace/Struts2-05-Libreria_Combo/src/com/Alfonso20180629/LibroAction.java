package com.Alfonso20180629;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class LibroAction extends ActionSupport { // Escribimos esta línea e importamos: 'extends ActionSupport'

	private Libro libro;

	private List<Libro> libros;


	//SETTERS & GETTERS
	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
	
	
	//ALTA
	public String alta() {
		LibroBO libroBO = new LibroBO();
		libroBO.alta(libro);
		return SUCCESS;
	}
	
	//CONSULTA
	public String consulta() {
		LibroBO libroBO = new LibroBO();

		libros = libroBO.consulta();
		return SUCCESS;
	}

	//1 SOLO LIBRO
	public String muestraLibro() {
		LibroBO libroBO = new LibroBO();
		libro = libroBO.getLibro(libro);
		return SUCCESS;
	}

	//MODIFICACIÓN
	public String modificacion() {
		LibroBO libroBO = new LibroBO();
		libroBO.modifica(libro);
		return SUCCESS;
	}

	//BAJA
	public String baja() {
		LibroBO libroBO = new LibroBO();
		libroBO.baja(libro);
		return SUCCESS;
	}
	

}
