package com.Alfonso20180417_Ejercicios_rapidos;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Escriba su número");
		int x = lector.nextInt();
		int i = 1;

		Ejercicio21 divisionExacta = new Ejercicio21();
		divisionExacta.solucionEjercicio(x, i);

	}

	public void solucionEjercicio(int a, int i) {

		while (i < a) {
			i++;
			if (a % i == 0) {
				System.out.println(i);
			} else
				;
		}

	}

}
