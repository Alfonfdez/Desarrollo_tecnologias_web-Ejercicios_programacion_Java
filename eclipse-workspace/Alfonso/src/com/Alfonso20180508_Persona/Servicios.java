package com.Alfonso20180508_Persona;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class Servicios {
	public Persona getPersonaMayor(Map personas) throws SinDatosException {
		if(personas.isEmpty()) {
			
			throw new SinDatosException();
		
	}else {
		Collection collection = personas.values();
		Iterator<Persona> it = collection.iterator();

		Persona p1 = it.next();
		Persona p2 = it.next();
		
		if(p1.getFechaNacimiento().getTime()< p2.getFechaNacimiento().getTime()) {
			return p1;
		}else {
			return p2;
		}
	}
	}

	public Persona getPrimerNombre(Map personas) throws SinDatosException {
		if(personas.isEmpty()) {
	
				throw new SinDatosException();
			
		}else {
			Collection collection = personas.values();
			Iterator<Persona> it = collection.iterator();

			Persona p1 = it.next();
			Persona p2 = it.next();
			
			if(p1.getNombre().compareTo(p2.getNombre())<0) {
				return p1;
			}else {
				return p2;
			}
		}
		
		
	}
}