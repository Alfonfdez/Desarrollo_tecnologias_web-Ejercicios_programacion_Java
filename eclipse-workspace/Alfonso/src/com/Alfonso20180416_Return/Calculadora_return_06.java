package com.Alfonso20180416_Return;

import java.util.Scanner;

public class Calculadora_return_06 {

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
				Calculadora_return_06 calculadora = new Calculadora_return_06();
				int resultado = calculadora.suma(x, y);
				System.out.println(resultado);
				todook = false;
			}
			
			else if(z.equals("-")) {
				Calculadora_return_06 calculadora = new Calculadora_return_06();
				int resultado = calculadora.resta(x, y);
				System.out.println(resultado);
				todook = false;
			}
			
			else if(z.equals("*")) {
				Calculadora_return_06 calculadora = new Calculadora_return_06();
				int resultado = calculadora.multiplicacion(x, y);
				System.out.println(resultado);
				todook = false;
			}
			
			else if(z.equals("/")) {
				Calculadora_return_06 calculadora = new Calculadora_return_06();
				float resultado = calculadora.division(x, y);
				System.out.println(resultado);
				todook = false;
			} else {}
			
		}
		

	}
	
	public int suma(int a, int b) {
		int r = a+b;
		return r;
	}
	
	public int resta(int a, int b) {
		int r = a-b;
		return r;
	}
	
	public int multiplicacion(int a, int b) {
		int r = a*b;
		return r;
	}
	
	public float division(float a, float b) {
		float r = a/b;
		return r;
	}

}
