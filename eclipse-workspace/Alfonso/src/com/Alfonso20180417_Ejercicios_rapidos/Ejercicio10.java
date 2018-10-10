package com.Alfonso20180417_Ejercicios_rapidos;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("Escriba el número 1");
		int x = lector.nextInt();

		System.out.println("Escriba el número 2");
		int y = lector.nextInt();

		Ejercicio10 numeros = new Ejercicio10();
		numeros.solucionMayorMenor(x, y);

	}

	public void solucionMayorMenor(int a, int b) {

		if (a > b) {
			System.out.println(a);
		} else if (a < b) {
			System.out.println(b);
		} else
			System.out.println("Son iguales");

	}

}
