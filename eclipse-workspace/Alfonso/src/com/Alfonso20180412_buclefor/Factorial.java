package com.Alfonso20180412_buclefor;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un número");

		int n = lector.nextInt();
		int r = 1;
		
		if(n>1) {
			
			for(int i=1;i<n;i=i+1) {
				
				r = r*((n+1)-i);

				
			}
			

		}
		
		else {
			
			
		}

		System.out.println(r);
	}

}
