package com.Alfonso20180424_Constructores_02_Animal;

public class Animal_01 {

	static String sonidoMasLargo = "";
	String sonido;

	Animal_01(String sonido) {

		this.sonido = sonido;
		compararSonido();

	}

	private void compararSonido() {
		if (sonidoMasLargo.length() < sonido.length()) {
			sonidoMasLargo = sonido;
		}

	}

}
