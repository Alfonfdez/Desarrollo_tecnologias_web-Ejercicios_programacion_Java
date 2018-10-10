package com.Alfonso20180508_Excepciones;

public class Main {

	public static void main(String[] args) {
		
		
		Servicios servicio = new Servicios();
		
		try {
			servicio.getPrecioConIva(100);
		} catch (PrecioDemasiadoAltoException e) {
			
			e.printStackTrace();
		}

	}

}


/*
 * 5o) Hacemos una instancia (servicio) de la clase Servicios y llamamos la m�todo "getPrecioConIva":
 * 
	Servicios servicio = new Servicios();
	
	servicio.getPrecioConIva(100);
	
 * 
 */

/*
 * 6o) Nos dar� un error que solventaremos pulsando en la opci�n "Surround with try/catch":
 * 
	try {
			servicio.getPrecioConIva(100);
		} catch (PrecioDemasiadoAltoException e) {
			
			e.printStackTrace();
		}
	
 * 
 */