package com.Alfonso20180410_calculadora;

import java.util.Scanner;

public class Calculadora {

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
				 
				if(op.equals("suma")) {
					resultado = a+b;
				}  else if(op.equals("resta")) {
					resultado = a-b;
				}  else if(op.equals("multiplicacion")) {
					resultado = a*b;
				}  else if(op.equals("division")){
					resultado = a/b;
				}  else {
					System.out.println("Operación no detectada");
				}
				
				
				System.out.println(resultado);
				
				

	}

}
