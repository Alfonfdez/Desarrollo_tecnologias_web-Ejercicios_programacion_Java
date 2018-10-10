package com.Alfonso20180417_Ejercicios_rapidos;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("Escriba su número");
		int x = lector.nextInt();
		int i = 0;

		Ejercicio18 decrecientes = new Ejercicio18();
		decrecientes.solucionEjercicio(x, i);

	}

	public void solucionEjercicio(int a, int i) {

		for (i = a; i > 0; i--) {
			if (i % 3 == 0) {
				System.out.println(i);
			} else
				;

		}

	}

}
