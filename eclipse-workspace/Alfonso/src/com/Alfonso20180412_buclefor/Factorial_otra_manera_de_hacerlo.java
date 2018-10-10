package com.Alfonso20180412_buclefor;

import java.util.Scanner;

public class Factorial_otra_manera_de_hacerlo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un número");
		Scanner lector = new Scanner(System.in);
		int n = lector.nextInt();
		int r = n;
		
		while(n>1) {
			n--; // n menos 1 y así sucesivamente
			r = r*n;
			
		}
		
		System.out.println(r);
		
		
		
		
		
		
	}

}
