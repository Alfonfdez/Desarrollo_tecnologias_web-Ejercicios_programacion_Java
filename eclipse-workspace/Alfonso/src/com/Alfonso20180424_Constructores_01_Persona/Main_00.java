package com.Alfonso20180424_Constructores_01_Persona; 

public class Main_00 {

	public static void main(String[] args) {

		new Cliente_02_hijo();
		new Cliente_02_hijo();
		new Empleado_02_hijo();
		new Empleado_02_hijo();

		System.out.println(Persona_01_padre.numInstancias);

	}

}

/*
 * Enunciado ejercicio: Desarrolle una clase con el nombre Main, que contenga un
 * método public static void main(String args[]), que al ejecutarse cree dos
 * instancias de empleado y dos de cliente e imprima el total de instancias de
 * persona creadas.
 */