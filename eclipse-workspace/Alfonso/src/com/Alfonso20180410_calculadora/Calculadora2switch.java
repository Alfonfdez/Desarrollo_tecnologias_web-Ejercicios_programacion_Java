package com.Alfonso20180410_calculadora;

import java.util.Scanner;

public class Calculadora2switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaramos las variables
				Scanner lector = new Scanner(System.in);
				
				System.out.println("Introduce el primer número: ");
				int a = lector.nextInt();
				
				System.out.println("Introduce el segundo número: ");
				int b = lector.nextInt();
				
				System.out.println("Introduce la operación deseada: ");
				String op =lector.next();
				
				
				int resultado = 0;
				
				
				//utilizamos 'switch'
				
				switch(op) {
				
				case "suma":
					resultado = a+b;
				break;
				
				
				case "resta":
					resultado = a-b;
				break;
				
				
				case "multiplicacion":
					resultado = a*b;
				break;
				
				
				case "division":
					resultado = a/b;
				break;
				
				
				default: System.out.println("Operación no detectada");
				
				System.out.println(resultado);
				
				}
				
				

	}

}
