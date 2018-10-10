package com.Alfonso20180417_Ejercicios_rapidos;

public class Ejercicio26 {

	public static void main(String[] args) {

		Ejercicio26 arrayNumeros = new Ejercicio26();
		arrayNumeros.solucionEjercicio("1_2_3_4_5_6_7_8_9");

	}

	public void solucionEjercicio(String cadena) {
		String [] numeros = cadena.split("_");
		int i =0;
		int mayor = 0;
		int n_aux=0;
		while(i<numeros.length) {
			n_aux = Integer.parseInt(numeros[i]); //Integer.parseInt = convierte la cadena de texto en números
			if(i==0) {
				mayor = n_aux;
			}
			else if(mayor < n_aux){
				mayor = n_aux;
			}
			i++;
		}
		System.out.println(mayor);
	}

}
