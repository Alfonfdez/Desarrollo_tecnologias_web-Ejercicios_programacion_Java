package com.Alfonso20180704.beans;

import com.Alfonso20180704.ITraductor;

public class TraductorIngles implements ITraductor {
	
	public void translate(String txt){
		System.out.println("texto traducido al español");
	}

	@Override
	public void traduceloPlease(String texto) {
		this.translate(texto);
		
	}
}
