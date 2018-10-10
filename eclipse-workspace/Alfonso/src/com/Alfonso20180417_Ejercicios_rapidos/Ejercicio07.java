package com.Alfonso20180417_Ejercicios_rapidos;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("Escriba el lado 1");
		int x = lector.nextInt();

		System.out.println("Escriba el lado 2");
		int y = lector.nextInt();

		Ejercicio07 superficie = new Ejercicio07();
		superficie.solucionSuperficie(x, y);

	}

	public void solucionSuperficie(int a, int b) {

		int resultado = a * b;
		System.out.println(resultado);

	}

}
