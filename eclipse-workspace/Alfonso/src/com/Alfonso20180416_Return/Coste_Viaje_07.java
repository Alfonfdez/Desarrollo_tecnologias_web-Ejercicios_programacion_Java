package com.Alfonso20180416_Return;

import java.util.Scanner;

public class Coste_Viaje_07 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduzca el número de noches: ");
		int numNoches = lector.nextInt();
		
		System.out.println("Introduzca el destino: ");
		String destino = lector.next();

		
		Coste_Viaje_07 costeViaje = new Coste_Viaje_07();
		
		int resultado1 = costeViaje.costeHotel(numNoches);
		
		int resultado2 = costeViaje.costeAvion(destino);
		
		int resultado3 = costeViaje.costeAlquilerCoche(numNoches);
		
		
		int sumaCostes = resultado1+resultado2+resultado3;
		System.out.println("Coste total: "+sumaCostes);


	}
	

	public int costeHotel(int x) {
		int resultado = x*140;
		return resultado;
	}
	
	
	public int costeAvion(String destino) {
		
		
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
			
			else return 0;
			
	}
		
	
	
	public int costeAlquilerCoche(int x) {
		
		if(x>=7) {
			int resultado = x*40-50;
			return resultado;
		} 
		
		else if(x>=3) {
			int resultado = x*40-20;
			return resultado;
		} 
		
		else {
			int resultado = x*40;
			return resultado;
		}
		
	}
	
	
	
}
