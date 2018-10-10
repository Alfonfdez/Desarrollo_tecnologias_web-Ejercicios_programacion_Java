package com.Alfonso20180518_Vehiculos;

public class VehiculoSiniestro{

	private Vehiculo vehiculo;
	private int perdida;
	
	//Setters & Getters
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public int getPerdida() {
		return perdida;
	}
	public void setPerdida(int perdida) {
		this.perdida = perdida;
	}
	
	//Constructor
	public VehiculoSiniestro(Vehiculo vehiculo, int perdida) {
		super();
		this.vehiculo = vehiculo;
		this.perdida = perdida;
	}
	
}
