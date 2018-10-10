package com.Alfonso20180417_Ejercicios_rapidos;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("Escriba su base");
		int base = lector.nextInt();

		System.out.println("Escriba su exponente");
		int exponente = lector.nextInt();

		int i = 0;
		int resultado = 1;

		while (i < exponente) {
			i++;

			resultado = resultado * base;
		}

		System.out.println(resultado);
	}

}
