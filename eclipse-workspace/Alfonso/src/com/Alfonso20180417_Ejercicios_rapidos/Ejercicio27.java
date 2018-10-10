package com.Alfonso20180417_Ejercicios_rapidos;

public class Ejercicio27 {

	public static void main(String[] args) {

		Ejercicio27 arrayNumeros = new Ejercicio27();
		arrayNumeros.solucionEjercicio("1_2_3_4_5_6_7_8_9");

	}

	public void solucionEjercicio(String cadena) {
		String[] numeros = cadena.split("_");
		int mayor = 0;
		int n_aux = 0;

		for (int i = 0; i < numeros.length; i++) {
			n_aux = Integer.parseInt(numeros[i]); // Integer.parseInt = convierte la cadena de texto en números
			if (i == 0) {
				mayor = n_aux;
			} else if (mayor < n_aux) {
				mayor = n_aux;
			}
		}
		System.out.println(mayor);

	}

}
