package com.Alfonso20180412_buclefor;

import java.util.Scanner;

public class Bucles_anidados_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el número");
		int n = lector.nextInt();

		
		for(int i=1; i<10;i=i+1) {
			int r = n*i;
			System.out.println(n+"*"+i+"="+r);
		}
	

	}

}
