package com.Alfonso20180417_Ejercicios_rapidos;

public class Ejercicio25 {

	public static void main(String[] args) {

		Ejercicio25 arrayNumeros = new Ejercicio25();
		arrayNumeros.solucionEjercicio("1_2_3_4_5_6_7_8_9");

	}

	public void solucionEjercicio(String cadena) {
		String[] numeros = cadena.split("_");
		int i = 0;
		while (i < numeros.length) {
			System.out.println(numeros[i] + "!");
			i++;
		}

	}

}
