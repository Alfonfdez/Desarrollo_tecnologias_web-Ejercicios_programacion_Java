package com.Alfonso20180704.beans;

import com.Alfonso20180704.ITraductor;

public class TraductorEspanol implements ITraductor{
	public void traducir(String txt){
		System.out.println("texto traducido al español");
	}

	@Override
	public void traduceloPlease(String texto) {
		this.traducir(texto);
		
	}


}
