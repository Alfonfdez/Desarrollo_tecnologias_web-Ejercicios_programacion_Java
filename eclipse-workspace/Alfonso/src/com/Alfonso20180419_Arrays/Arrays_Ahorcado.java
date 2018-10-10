package com.Alfonso20180419_Arrays;

import java.util.Arrays;

import java.util.Scanner;

public class Arrays_Ahorcado {

	public static void main(String[] args) {

		String[] palabrasSecretas = { "casa", "gatuno", "bolis" }; // String[0]="casa", String[1]="gatuno", String[2]="bolis"

		int valorAleatorioUnoaTres = (int) Math.floor(Math.random() * palabrasSecretas.length + 1); // Math.floor(Math.random()*(N-M+1)+M) -> Math.floor(Math.random()*(2-0+1)+0)
																									
		String palabraSecreta = palabrasSecretas[valorAleatorioUnoaTres]; // Selección aleatoria entre: String[0]="casa", String[1]="gatuno", String[2]="bolis"

		System.out.println(palabraSecreta);
		
		
		
		char[] palabraSecretaLetras = palabraSecreta.toCharArray(); // La palabra descompuesta en sus letras individuales. Ejemplo "Array" palabra 'casa' -> char[0] = 'c', char[1] = 'a', char[2] = 's', char[3] = 'a'
																	
		char[] letrasConGuiones = new char[palabraSecretaLetras.length]; // Creamos un nuevo "Array" a partir del anterior. Además medimos cuántas letras tiene en total.

		for (int i = 0; i < palabraSecretaLetras.length; i++) {
			letrasConGuiones[i] = '_'; //Sustituimos todo por '_'
		}

		boolean hemosGanado = true;

		while (hemosGanado == true) {

			System.out.println(letrasConGuiones);

			Scanner lector = new Scanner(System.in);

			System.out.println("Introduce tu letra: ");

			char letra = lector.next().charAt(0); // Escogeremos la primera letra de cualquier cosa que escribamos. 'charAt(0)' el 0 sería la primera letra de lo que escribamos
			

			for (int i = 0; i < palabraSecretaLetras.length; i++) {
				if (palabraSecretaLetras[i] == letra) {
					letrasConGuiones[i] = letra; //Si acertamos la letra, quitamos el '_' y ponemos la letra acertada

				}
				
			}
			

			if(Arrays.equals(letrasConGuiones,palabraSecretaLetras)) {
				hemosGanado = false;
				System.out.println("¡Has ganado!");
			}
			

		}

	}

}
