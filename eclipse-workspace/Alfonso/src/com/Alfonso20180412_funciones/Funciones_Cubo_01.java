package com.Alfonso20180412_funciones;

import java.util.Scanner;

public class Funciones_Cubo_01 {


	public static void main(String[] args) {
		

		
		 Scanner lector = new Scanner(System.in);
		 System.out.println("Introduce el n�mero"); 
		 int numero = lector.nextInt();
		 
		 Funciones_Cubo_01 funciones_cubo_01 = new Funciones_Cubo_01(); //Lo 1� es la 'clase' y lo 2� el 'objeto'
		 funciones_cubo_01.funcion(numero); //Lo 1� es el 'objeto' y lo 2� el 'm�todo'

	}

	public void funcion(int n) {
		int r = n * n * n;
		System.out.println(r);

	}

}
