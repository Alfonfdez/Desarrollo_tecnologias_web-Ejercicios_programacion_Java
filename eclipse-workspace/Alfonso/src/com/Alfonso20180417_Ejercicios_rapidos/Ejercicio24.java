package com.Alfonso20180417_Ejercicios_rapidos;

public class Ejercicio24 {

	public static void main(String[] args) {

		Ejercicio24 arrayNumeros = new Ejercicio24();
		arrayNumeros.solucionEjercicio("1_2_3_4_5_6_7_8_9");

	}

	public void solucionEjercicio(String cadena) {
		String[] numeros = cadena.split("_");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + "!");
		}
	}

}
