package com.Alfonso20180412_funciones;

import java.util.Scanner;

public class Funciones_Triangulo_04 {

	
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe el número de la base");
		int base = lector.nextInt();
		System.out.println("Escribe el número de la altura");
		int altura = lector.nextInt();
		
		Funciones_Triangulo_04 triangulo = new Funciones_Triangulo_04();
		triangulo.calculoTriangulo(base, altura);
		

	}
	
	
	public void calculoTriangulo (int bas, int alt) {
		
		int r = (bas*alt)/2;
		System.out.println(r);
		
		
	}
	
	
	

}
