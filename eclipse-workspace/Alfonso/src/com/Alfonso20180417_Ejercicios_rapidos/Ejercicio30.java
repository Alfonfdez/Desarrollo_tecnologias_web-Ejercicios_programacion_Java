package com.Alfonso20180417_Ejercicios_rapidos;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce tu número");
		int numero = lector.nextInt();

		int resultado = 1;

		Ejercicio30 factorial = new Ejercicio30();
		factorial.solucionEjercicio(numero, resultado);

	}

	public void solucionEjercicio(int x, int r) {

		while (x > 1) {
			r = x * r;
			x--;
		}

		System.out.println(r);
	}

}
