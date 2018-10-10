package com.Alfonso20180503_Depositos;

public class Deposito implements Comparable<Deposito> {

	private String nombre;
	private int largo;
	private int ancho;
	private int alto;

	public Deposito(String nombre, int largo, int ancho, int alto) { // Hacemos "Alt+Shift+S" -> "Generate constructors
																		// using fields"
		super();														//generamos un Constructor
		this.nombre = nombre;
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override // lo puedo escribir poniendo 'equals' y "cntrl + espacio"
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Deposito deposito2 = (Deposito) obj;
		int volumen1 = largo * ancho * alto;
		int volumen2 = deposito2.alto * deposito2.ancho * deposito2.largo;
		if (volumen1 == volumen2)
			return true;
		return false;

	}

	@Override // lo puedo escribir haciendo "cntrl + espacio" y ·'hashcode'
	public int hashCode() {
		// TODO Auto-generated method stub

		return super.hashCode();
	}

	// Hacemos "Alt+Shift+S" -> "Generate getters and setters"
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
	public int compareTo(Deposito d2) {
		// TODO Auto-generated method stub
		int vol1 = largo * ancho * alto;
		int vol2 = d2.largo * d2.ancho * d2.alto;
		if (vol1 == vol2)
			return 0;
		else if (vol1 > vol2)
			return 1;
		else
			return -1;
	}

}
