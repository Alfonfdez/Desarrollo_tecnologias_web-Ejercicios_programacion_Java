package com.Alfonso20180503_Equals_CompareTo_Depositos;

import java.util.Objects;

public class Deposito implements Comparable<Deposito> { //Método CompareTo, añadimos la interfaz "implements Comparable<Deposito>"

	private String nombre;
	private int largo, ancho, alto;

	public Deposito(String nombre, int largo, int ancho, int alto) {
		super();
		this.nombre = nombre;
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Deposito)) return false;
		Deposito deposito = (Deposito)obj;

		int producto1 = largo * ancho * alto;
		int producto2 = deposito.getLargo() * deposito.getAncho() * deposito.getAlto();

		if (producto1 == producto2)
			return true;
		else
			return false;
	}

	public int hashCode() {
		int producto = largo * ancho * alto;
		return Objects.hash(producto);

	}

	@Override
	public int compareTo(Deposito o) {
		Deposito deposito = (Deposito)o;
		int producto1 = largo * ancho * alto;
		int producto2 = deposito.getLargo() * deposito.getAncho() * deposito.getAlto();
		
		if(producto1>producto2) return 1;
		else if (producto1<producto2) return -1;
		else return 0;
	}

}