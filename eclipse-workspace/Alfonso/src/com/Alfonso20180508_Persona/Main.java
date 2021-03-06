package com.Alfonso20180508_Persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		Servicios servicios = new Servicios();
		try {
			Date fecha1 = s.parse("10-10-1982");
			Date fecha2 = s.parse("10-10-1992");

			Persona p1 = new Persona("El viejo Juan", "1111",fecha1 );
			Persona p2 = new Persona("Roberto", "22222",fecha2 );
			
			Map mapa = new HashMap();
			//mapa.put(p1.getDni(), p1);
			//mapa.put(p2.getDni(), p2);
			
			Persona p = servicios.getPersonaMayor(mapa);
			
			System.out.println("La persona Mayor es: " + p.getNombre());
			
			
			Persona palfabetico = servicios.getPrimerNombre(mapa);
			System.out.println("La persona que alfabeticamente va antes es : " +palfabetico.getNombre());

		} catch (ParseException | SinDatosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}