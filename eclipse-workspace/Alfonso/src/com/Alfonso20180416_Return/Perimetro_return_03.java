package com.Alfonso20180416_Return;

import java.util.Scanner;


public class Perimetro_return_03 {


	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriba el ancho");
		int ancho = lector.nextInt();
		System.out.println("Escriba el alto");
		int alto = lector.nextInt();
		
		Perimetro_return_03 perimetro = new Perimetro_return_03();
		int resultado = perimetro.calculoperimetro(ancho, alto); //Añadimos 'int resultado ='
		System.out.println(resultado); //Ponemos aqui el 'System.out.println'
	}

	public int calculoperimetro(int x, int y) { //Cambiamos 'void' por 'int'
		int r = x*2+y*2;
		return r; //Cambiamos 'System.out.println' por 'return'
		
	}
}
