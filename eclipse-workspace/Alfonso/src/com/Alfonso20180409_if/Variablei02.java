package com.Alfonso20180409_if;

public class Variablei02 {
	
	public static void main(String[] args) {
		
		//declaro la variable
		int i = 5;
		
		//positivo o negativo
		if (i>0) {
			System.out.println("positivo");	
		} else {
			System.out.println("negativo");	
		}
		
		//par o impar
		if (i%2==0) {
			System.out.println("par");	
		} else {
			System.out.println("impar");	
		}
		
		//múltiplo de 10 o de 5
		if (i%10==0) {
			System.out.println("múltiplo de 10 y de 5");	
		} else if (i%5==0){
			System.out.println("no múltiplo de 10 pero sí de 5");	
		} else {
			System.out.println("no múltiplo de 10 ni de 5");
		}
		
		//mayor de 100 o menor de 100
		if (i>100) {
			System.out.println("mayor de 100");	
		} else {
			System.out.println("menor de 100");	
		}		
			
		
		
	}

}
