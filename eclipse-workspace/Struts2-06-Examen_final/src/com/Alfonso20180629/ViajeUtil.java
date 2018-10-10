package com.Alfonso20180629;

public class ViajeUtil {

	/*MÉTODOS DE LÓGICA*/
	
	//COSTE TOTAL
	public static CosteViaje getCosteTrip(Viaje viaje) {
	
		int resultado1 = getCosteHotel(viaje.getNoches()); //Va al COSTE HOTEL de abajo
		int resultado2 = getCosteAvion(viaje.getDestino()); //Va al COSTE AVIÓN de abajo
		int resultado3 = getCosteAlquilerCoche(viaje.getNoches()); //Va al COSTE ALQUILER COCHE de abajo
		
		int costeTotal = resultado1+resultado2+resultado3;
		
		CosteViaje costeViaje = new CosteViaje();
		
		costeViaje.setCosteHotel(resultado1);
		costeViaje.setCosteAvion(resultado2);
		costeViaje.setCosteAlquilerCoche(resultado3);
		costeViaje.setCosteTotal(costeTotal);
		
		return costeViaje;
	}

	//COSTE HOTEL
	private static int getCosteHotel(int noches) {
		
		return noches*140;
		
	}
	
	//COSTE AVIÓN
	private static int getCosteAvion(String destino) {
			
		if(destino.equals("oviedo")) {
			return 15;
		}
		
		else if(destino.equals("tokyo")) {
			return 700;
		}
		
		else if(destino.equals("madrid")) {
			return 90;
		}
		
		else if(destino.equals("barcelona")) {
			return 90;
		}
		
		else {
			return 0;
		}
		
	}
	
	//COSTE ALQUILER COCHE
	private static int getCosteAlquilerCoche(int noches) {

		int alquiler = noches*40;
		
		if(noches>=7) {
			alquiler = alquiler-50;
		}
		
		else if(noches>=3) {
			alquiler = alquiler-20;
		}
		
		//Menos de 3 noches no hay descuento en el alquiler		
		return alquiler;
	}
	
	
}
