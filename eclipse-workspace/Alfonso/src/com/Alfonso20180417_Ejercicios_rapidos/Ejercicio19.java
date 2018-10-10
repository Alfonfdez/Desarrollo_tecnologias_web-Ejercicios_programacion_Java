package com.Alfonso20180417_Ejercicios_rapidos;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("Escriba su número");
		int x = lector.nextInt();
		int i = 0;

		Ejercicio19 decrecientes = new Ejercicio19();
		decrecientes.solucionEjercicio(x, i);

	}

	public void solucionEjercicio(int a, int i) {
		
		i = a;
		
		while (i > 0) {
			i--;
			if (i % 3 == 0) {
				System.out.println(i);
			} else
				;
		}

	}

}
