package com.Alfonso20180416_Return;

import java.util.Scanner;

public class Cubo_return_01 {


	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriba el número");
		int x = lector.nextInt();
		
		Cubo_return_01 cubo = new  Cubo_return_01();
		int variable = cubo.calculocubo(x); //Añadimos 'int resultado ='
		System.out.println(variable); //Ponemos aqui el 'System.out.println'
	}
	
	
	public int calculocubo(int y) { //Cambiamos 'void' por 'int'
		
		int r=y*y*y;
		return r; //Cambiamos 'System.out.println' por 'return'
	}

	
}
