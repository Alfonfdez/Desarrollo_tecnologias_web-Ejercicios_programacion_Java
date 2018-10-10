package com.Alfonso20180417_Ejercicios_rapidos;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("Escriba el numero 1");
		int x = lector.nextInt();

		System.out.println("Escriba el numero 2");
		int y = lector.nextInt();

		Ejercicio06 suma = new Ejercicio06();
		suma.solucionSuma(x, y);

	}

	public void solucionSuma(int a, int b) {

		int resultado = a + b;
		System.out.println(resultado);

	}

}
