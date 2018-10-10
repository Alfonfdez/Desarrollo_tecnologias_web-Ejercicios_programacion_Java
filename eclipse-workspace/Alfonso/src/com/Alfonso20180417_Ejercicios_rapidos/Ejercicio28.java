package com.Alfonso20180417_Ejercicios_rapidos;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce tu número");
		int numeroprimo = lector.nextInt();

		Ejercicio28 primo = new Ejercicio28();
		boolean esPrimo = primo.esPrimo(numeroprimo);
		System.out.println("El número es primo: " + esPrimo);
	}

	public boolean esPrimo(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
