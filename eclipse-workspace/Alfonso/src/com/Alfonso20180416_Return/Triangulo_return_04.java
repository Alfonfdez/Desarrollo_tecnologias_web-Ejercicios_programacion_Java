package com.Alfonso20180416_Return;

import java.util.Scanner;


public class Triangulo_return_04 {


	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriba el número de la base");
		int base = lector.nextInt();
		System.out.println("Escriba el número de la altura");
		int altura = lector.nextInt();
		
		Triangulo_return_04 areatriangulo = new Triangulo_return_04();
		float resultado = areatriangulo.calculoareatriangulo(base, altura);
		System.out.println(resultado);
	
	
	}
	
	public float calculoareatriangulo(int x, int y) {
		float r = (x*y)/2;
		return r;
	}
	
}
