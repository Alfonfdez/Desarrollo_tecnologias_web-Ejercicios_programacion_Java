package com.Alfonso20180416_Funciones;

import java.util.Scanner;

public class Triangulo_04 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriba el número de la base");
		int base = lector.nextInt();
		System.out.println("Escriba el número de la altura");
		int altura = lector.nextInt();
		
		Triangulo_04 areatriangulo = new Triangulo_04();
		areatriangulo.calculoareatriangulo(base, altura);


	}

	public void calculoareatriangulo(int x, int y) {
		int r = (x*y)/2;
		System.out.println(r);
	}
}
