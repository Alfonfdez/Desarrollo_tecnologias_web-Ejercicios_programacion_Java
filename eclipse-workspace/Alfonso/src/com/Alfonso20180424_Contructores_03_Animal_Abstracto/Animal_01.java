package com.Alfonso20180424_Contructores_03_Animal_Abstracto;

public abstract class Animal_01 {

	static String sonidoMasLargo ="";
	String sonido;

	Animal_01() {
		establecerSonido();
		compararSonido();

	}
	
	abstract void establecerSonido();
	void compararSonido() {
		if(sonidoMasLargo.length() < sonido.length()) {
			sonidoMasLargo = sonido;
		}
	}
}
