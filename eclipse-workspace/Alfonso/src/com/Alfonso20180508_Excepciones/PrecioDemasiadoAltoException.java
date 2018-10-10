package com.Alfonso20180508_Excepciones;

import java.io.PrintStream;

public class PrecioDemasiadoAltoException extends Exception {

	@Override
	public void printStackTrace(PrintStream s) {
		
		super.printStackTrace(s);
		System.out.println("El precio es demasiado alto");
	}

}

/*
 * 2o) Hacemos la clase "PrecioDemasiadoAltoException" que tiene como 'Padre' "Exception":
 * 
 *Escribimos 'print' y pulsamos 'Cntrl + Space' y pulsamos en "printStackTrace(PrintStream s)":
 *
 *@Override
	public void printStackTrace() {
	// TODO Auto-generated method stub
		super.printStackTrace();
	}
 *
 *Después escribiremos nuestro mensaje de error
 *
 */