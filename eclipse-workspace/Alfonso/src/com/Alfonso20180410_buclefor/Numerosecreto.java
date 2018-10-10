package com.Alfonso20180410_buclefor;

import java.util.Scanner;

public class Numerosecreto {
	
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		
		
		for(int i=0;i<3;i=i+1) {
			
				System.out.println("Introduce el número que crees que es el número secreto: ");
				int secreto = lector.nextInt();
				
					if(secreto==3) {
						System.out.println("Ganaste, ¡enhorabuena!");	
						break;
					} else {
						System.out.println("No has acertado");
					}
				
			} 
			
		
		
	}

}
