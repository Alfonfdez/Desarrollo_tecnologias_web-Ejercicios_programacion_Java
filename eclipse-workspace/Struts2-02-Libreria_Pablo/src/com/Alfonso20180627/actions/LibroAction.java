package com.Alfonso20180627.actions;

import java.util.List;

import com.Alfonso20180627.BO.LibroBO;
import com.Alfonso20180627.entity.Libro;
import com.opensymphony.xwork2.ActionSupport;

public class LibroAction extends ActionSupport{
	
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
	
	
	//MÉTODOS
	
	//ALTA
	public String alta() {
		LibroBO libroBO = new LibroBO();
		libroBO.alta(libro);
		return SUCCESS;
	}
	
	//1a MODIFICACIÓN
	public String inicioModificacionLibro() {
		LibroBO libroBO = new LibroBO();
		libro = libroBO.getLibro(libro);
		return SUCCESS;
		
	}
	
	//2a MODIFICACIÓN
	public String modificaomuere() {
		LibroBO libroBO = new LibroBO();
		libroBO.actualizaOMuere(libro);
		return SUCCESS;
	}
	
	//BORRAR
	public String borraRecorcholis() {
		LibroBO libroBO = new LibroBO();
		libroBO.borra(libro);
		return SUCCESS;
	}
	
	//CONSULTA
	public String consulta() {
		LibroBO libroBO = new LibroBO();
		libros = libroBO.list();
		return SUCCESS;
	}
	
	
}
