package com.Alfonso20180514_Prueba_Animales;

public class Animal {
	
	static String SonidoMasLargo=""; // variable estática
	
	String sonido;
	
	Animal(String sonido){ //Constructor
			this.sonido = sonido;	//llamo a cada animal	
			compararSonido();
		
	}
	
	private void compararSonido() { //método
		if (SonidoMasLargo.length() < sonido.length()){
			SonidoMasLargo = sonido;
		} else;
	}
	
}
