package com.Alfonso20180424_Contructores_04_Animal_Abstracto_Interfaz;

public class Animal_01 implements IAnimal {

	static String sonidoMasLargo = "";
	String sonido;

	Animal_01(String sonido) {
		this.sonido = sonido;
		compararSonido();
	}

	@Override
	public void compararSonido() {
		if (sonidoMasLargo.length() < sonido.length()) {
			sonidoMasLargo = sonido;
		}

	}
}
