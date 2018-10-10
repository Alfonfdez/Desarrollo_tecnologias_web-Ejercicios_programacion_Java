package com.Alfonso20180417_Ejercicios_rapidos;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("Escriba el largo");
		int x = lector.nextInt();

		System.out.println("Escriba el ancho");
		int y = lector.nextInt();

		System.out.println("Escriba el alto");
		int z = lector.nextInt();

		Ejercicio08 prisma = new Ejercicio08();
		prisma.volumenPrisma(x, y, z);

	}

	public void volumenPrisma(int a, int b, int c) {

		int resultado = a * b * c;
		System.out.println(resultado);

	}

}
