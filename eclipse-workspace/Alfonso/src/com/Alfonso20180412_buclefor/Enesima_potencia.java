package com.Alfonso20180412_buclefor;

import java.util.Scanner;

public class Enesima_potencia {public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
	
		System.out.println("escribe el número base");
		int base = lector.nextInt();
		
		System.out.println("escribe el número exponente (nº veces que se eleva la base)");
		int exponente = lector.nextInt();
		

		
		int resultado=1;
		
		for(int i=0; i<exponente; i=i+1) {

			resultado = base*resultado;	
		}
		
		System.out.println(resultado);

	}



}
