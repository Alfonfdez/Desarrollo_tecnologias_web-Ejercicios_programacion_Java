package com.Alfonso20180417_Ejercicios_rapidos;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("Escriba el largo");
		int x = lector.nextInt();

		System.out.println("Escriba el ancho");
		int y = lector.nextInt();

		System.out.println("Escriba el alto");
		int z = lector.nextInt();

		Ejercicio09 prisma = new Ejercicio09();
		int resultado = prisma.volumenPrisma(x, y, z);

		System.out.println(resultado);

	}

	public int volumenPrisma(int a, int b, int c) {

		return a * b * c;

	}

}
