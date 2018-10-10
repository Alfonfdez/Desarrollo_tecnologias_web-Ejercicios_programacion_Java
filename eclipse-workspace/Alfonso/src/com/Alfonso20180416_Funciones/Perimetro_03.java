package com.Alfonso20180416_Funciones;

import java.util.Scanner;

public class Perimetro_03 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriba el ancho");
		int ancho = lector.nextInt();
		System.out.println("Escriba el alto");
		int alto = lector.nextInt();
		
		Perimetro_03 perimetro = new Perimetro_03();
		perimetro.calculoperimetro(ancho, alto);

	}

	public void calculoperimetro(int x, int y) {
		int r = x*2+y*2;
		System.out.println(r);
	}
}
