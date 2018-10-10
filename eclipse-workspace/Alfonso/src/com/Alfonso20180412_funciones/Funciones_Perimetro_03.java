package com.Alfonso20180412_funciones;

import java.util.Scanner;

public class Funciones_Perimetro_03 {
		

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el alto");
		int alto = lector.nextInt();
		System.out.println("Introduce el ancho");
		int ancho = lector.nextInt();
		
		Funciones_Perimetro_03 perimetro = new Funciones_Perimetro_03();
		perimetro.calculoPerimetro(alto, ancho);
				

	}
	
	public void calculoPerimetro(int alt, int anch) {
		
		int r = 2*alt + 2*anch;
		System.out.println(r);
		
	}
	


}
