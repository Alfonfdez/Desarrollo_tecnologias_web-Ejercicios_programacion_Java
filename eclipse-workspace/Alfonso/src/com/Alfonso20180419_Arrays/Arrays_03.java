package com.Alfonso20180419_Arrays;

import java.util.Scanner;

public class Arrays_03 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("Ponga un número del 1 al 12, 1 siendo Enero y 12 siendo Diciembre: ");
		int x = lector.nextInt();

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		if (x >= 0 && x <= 12) {
			System.out.println(meses[x - 1]);
		} else {
			System.out.println("El número introducido no es correcto");
		}
	}

}
