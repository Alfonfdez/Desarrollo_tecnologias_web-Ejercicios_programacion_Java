package com.Alfonso20180417_Ejercicios_rapidos;

public class Ejercicio29 {

	public static void main(String[] args) {

		Ejercicio29 arrayNumeros = new Ejercicio29();
		arrayNumeros.solucionEjercicio("1_2_3_4_5_6_7_8_9");

	}

	public void solucionEjercicio(String cadena) {
		String[] numeros = cadena.split("_");

		for (int i = 0; i < numeros.length; i++) {
			int n_aux = Integer.parseInt(numeros[i]);
			boolean is_prime = true;
			for (int j = 2; j < n_aux; j++) {
				if (n_aux % j == 0) {
					is_prime = false;
				}
			}
			if (is_prime) {
				System.out.println(n_aux);
			}
		}
	}
}
