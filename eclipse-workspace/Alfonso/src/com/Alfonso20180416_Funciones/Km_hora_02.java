package com.Alfonso20180416_Funciones;

import java.util.Scanner;

public class Km_hora_02 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriba los km/h");
		int km = lector.nextInt();
		
		Km_hora_02 kmhora = new Km_hora_02();
		kmhora.mhora(km);


	}
	
	public void mhora(int m) {
	int r = m*1000;
	System.out.println(r);
	}
	
}
