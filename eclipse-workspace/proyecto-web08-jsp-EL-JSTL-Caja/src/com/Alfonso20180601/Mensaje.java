package com.Alfonso20180601;

public class Mensaje {

	String nombre="";
	String material="";
	String tamano="";
	String comentario="";
	
	public Mensaje(String nombre, String material, String tamano, String comentario) {
		super();
		this.nombre = nombre;
		this.material = material;
		this.tamano = tamano;
		this.comentario = comentario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
}
