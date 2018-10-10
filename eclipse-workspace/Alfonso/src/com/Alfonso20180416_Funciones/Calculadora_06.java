package com.Alfonso20180416_Funciones;

import java.util.Scanner;

public class Calculadora_06 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriba el primer número");
		int x = lector.nextInt();
		System.out.println("Escriba el segundo número");
		int y = lector.nextInt();

		boolean todook = true;
		
		while(todook == true) {
			
			System.out.println("Escriba la operación que desea realizar");
			String z = lector.next();
			
			
			if(z.equals("+")) {
				Calculadora_06 calculadora = new Calculadora_06();
				calculadora.suma(x, y);
				todook = false;
			}
			
			else if(z.equals("-")) {
				Calculadora_06 calculadora = new Calculadora_06();
				calculadora.resta(x, y);
				todook = false;
			}
			
			else if(z.equals("*")) {
				Calculadora_06 calculadora = new Calculadora_06();
				calculadora.multiplicacion(x, y);
				todook = false;
			}
			
			else if(z.equals("/")) {
				Calculadora_06 calculadora = new Calculadora_06();
				calculadora.division(x, y);
				todook = false;
			} else {}
			
		}
		

	}
	
	public void suma(int a, int b) {
		int r = a+b;
		System.out.println(r);
	}
	
	public void resta(int a, int b) {
		int r = a-b;
		System.out.println(r);
	}
	
	public void multiplicacion(int a, int b) {
		int r = a*b;
		System.out.println(r);
	}
	
	public void division(float a, float b) {
		float r = a/b;
		System.out.println(r);
	}

}
