package com.Alfonso20180416_Funciones;

import java.util.Scanner;

public class Cubo_01 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriba el número");
		int x = lector.nextInt();
		
		Cubo_01 cubo = new Cubo_01();
		cubo.calculocubo(x);
		

	}
	
	public void calculocubo(int y) {
		int r=y*y*y;
		System.out.println(r);
	}

}
