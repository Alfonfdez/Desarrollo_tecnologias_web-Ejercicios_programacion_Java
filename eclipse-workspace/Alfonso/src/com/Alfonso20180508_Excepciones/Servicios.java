package com.Alfonso20180508_Excepciones;

public class Servicios {
	
	public float getPrecioConIva(float n) throws PrecioDemasiadoAltoException {
		
		float r = n*1.16f;
		
		if(r>100) {
			throw new PrecioDemasiadoAltoException();
		}
		
		return r;
		
	}

	

}

/*
 * 1o) Hacemos la clase "Servicios" con el método "getPrecioConIva":
 * 
 * public float getPrecioConIva(float n) {
 * 
		float r = n*1.16f;
		
		return r;
 * 
 */
 
/*
 * 3o) Creamos la excepción si el precio supera 100 (entre float y return) y hacemos un 'throw' a la clase del error(PrecioDemasiadoAltoException()):
 * 
 * 		if(r>100) {
			throw new PrecioDemasiadoAltoException();
		}
 * 
 */

/*
 * 4o) Nos dará un error que solventaremos clicando en "Add throws declaration" que añadirá la línea "[...] throws PrecioDemasiadoAltoException { ":
 * 
 
 */