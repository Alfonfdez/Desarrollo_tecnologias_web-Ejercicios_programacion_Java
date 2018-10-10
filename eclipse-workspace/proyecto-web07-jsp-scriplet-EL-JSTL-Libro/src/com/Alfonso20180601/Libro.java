package com.Alfonso20180601;

public class Libro {
	String isbn="";
	String titulo="";
	int precio=0;
	
	
	
	public Libro(String isbn, String titulo, int precio) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.precio = precio;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
