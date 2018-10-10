package com.Alfonso20180412_buclefor;

import java.util.Scanner;

public class Numerosecreto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		
		for(int i=0;i<3;i=i+1) {
			
			System.out.println("Escribe el número que crees que es el número secreto:");
			int secreto=lector.nextInt();
			
			if(secreto==3) {
				System.out.println("has ganado");
				break;
			} 
			
			else {
				System.out.println("has fallado");
			}
			
			
			
		}

	}

}
