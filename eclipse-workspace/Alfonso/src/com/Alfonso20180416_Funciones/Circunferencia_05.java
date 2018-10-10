package com.Alfonso20180416_Funciones;

import java.util.Scanner;

public class Circunferencia_05 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriba el radio");
		float radio = lector.nextInt();
		
		Circunferencia_05 circunferencia = new Circunferencia_05();
		circunferencia.calculoperimetrocircunferencia(radio);
		circunferencia.calculoareacircunferencia(radio);
	

	}
	
	public void calculoperimetrocircunferencia(float radioper) {
		float perimetro = 2*radioper*3.14f;
		System.out.println(perimetro);
	}
	
	public void calculoareacircunferencia(float radioarea) {
		float area = radioarea*radioarea*3.14f;
		System.out.println(area);
	}

}
