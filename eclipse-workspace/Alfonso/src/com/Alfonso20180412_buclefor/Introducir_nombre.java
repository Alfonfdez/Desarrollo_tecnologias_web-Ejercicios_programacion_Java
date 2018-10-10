package com.Alfonso20180412_buclefor;

import java.util.Scanner;

public class Introducir_nombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		


		boolean todoOk = false;
		
		while(todoOk==false) {
			
			System.out.println("Introduce tu nombre:");
			
			Scanner lector = new Scanner(System.in);
			
			String nombre = lector.nextLine();

	
			if(nombre.equals("")) {
				
				System.out.println("Vamos mal");
				}
				
				else {
				
				System.out.println("¿Es correcto el nombre introducido?");
				String respuesta = lector.next();
				
				
					if(respuesta.equals("si")) {
						System.out.println("Puedes seguir con el examen");
						todoOk=true;
					} 
					
					else {
						System.out.println("Error");
					
					}
				
				}
				
			}
			
		}

	
	

}
