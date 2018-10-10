package com.Alfonso20180417_Ejercicios_rapidos;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Escriba su número");
		int x = lector.nextInt();
		int i = 0;

		Ejercicio16 divisibles = new Ejercicio16();
		divisibles.solucionEjercicio(x, i);

	}

	public void solucionEjercicio(int a, int i) {

		for (i = 0; i < a; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			} else
				;
		}
	}

}
