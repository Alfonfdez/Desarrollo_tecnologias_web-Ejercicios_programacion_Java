package com.Alfonso20180629;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class ViajeAction extends ActionSupport { // Escribimos esta línea e importamos: 'extends ActionSupport'

	
	private Viaje viaje;

	private List<Viaje> viajes;
	
	CosteViaje costeViaje;
	
	

	//SETTERS AND GETTERS
	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	public List<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}
	
	public CosteViaje getCosteViaje() {
		return costeViaje;
	}

	public void setCosteViaje(CosteViaje costeViaje) {
		this.costeViaje = costeViaje;
	}
	
	
	//MÉTODOS
	
	//ALTA & COSTE VIAJE
	public String altaviaje_costeviaje() {
		
		ViajeBO viajeBO = new ViajeBO();
		viajeBO.alta(viaje);
		
		//GUARDAR RESULTADO LÓGICA CosteViaje
		costeViaje = ViajeUtil.getCosteTrip(viaje);
		
		return SUCCESS;
	}
	
	//CONSULTA
	public String consulta() {
		ViajeBO viajeBO = new ViajeBO();

		viajes = viajeBO.consulta();
		return SUCCESS;
	}

	//1 SOLO VIAJE
	public String muestraViaje() {
		ViajeBO viajeBO = new ViajeBO();
		viaje = viajeBO.getViaje(viaje);
		return SUCCESS;
	}

	//MODIFICACIÓN
	public String modificacion() {
		ViajeBO viajeBO = new ViajeBO();
		viajeBO.modifica(viaje);
		return SUCCESS;
	}

	//BAJA
	public String baja() {
		ViajeBO viajeBO = new ViajeBO();
		viajeBO.baja(viaje);
		return SUCCESS;
	}
	
	
}
