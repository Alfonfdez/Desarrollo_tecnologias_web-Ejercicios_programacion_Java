package com.Alfonso20180503_Depositos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deposito d1 = new Deposito("d1",3,3,4);
		Deposito d2 = new Deposito("d2",4,3,3);
		Deposito d3 = new Deposito("d3",5,3,3);
		Deposito d4 = new Deposito("d4",6,3,3);
		Deposito d5 = new Deposito("d5",7,3,3);
	
		
		List <Deposito> depositos = new ArrayList<Deposito>(); //Haremos "cntrl + shift + O" y aņadiremos interfaz
		depositos.add(d1);
		depositos.add(d2);
		depositos.add(d3);
		depositos.add(d4);
		depositos.add(d5);
		
		Collections.sort(depositos); //para ordenar la lista
		
		
		Iterator<Deposito> it = depositos.iterator(); //Haremos "cntrl + shift + O" y aņadiremos interfaz
		while(it.hasNext()) {
			Deposito d = it.next();
			System.out.println(d.getNombre());
		}
		
		if(d1.equals(d2)) {
			System.out.println("son iguales");
		} else {
			System.out.println("son diferentes");
		}

	}
	
}
