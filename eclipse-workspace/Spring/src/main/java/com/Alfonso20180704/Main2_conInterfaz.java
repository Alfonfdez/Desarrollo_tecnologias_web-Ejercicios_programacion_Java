package com.Alfonso20180704;

import com.Alfonso20180704.beans.TraductorEspanol;
import com.Alfonso20180704.beans.TraductorIngles;

public class Main2_conInterfaz {

	public static void main(String[] args) {
		
		
		ITraductor traductor = new TraductorEspanol();
		ITraductor traductor2 = new TraductorIngles();
		
		TraductorEspanol traductor3 = new TraductorEspanol();
		TraductorIngles traductor4 = new TraductorIngles();		
				
		traductor.traduceloPlease("hola");

	}

}
