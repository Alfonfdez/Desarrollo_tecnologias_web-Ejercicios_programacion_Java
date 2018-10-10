package com.Alfonso20180518_Vehiculos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

	@Entity
	public class Siniestro {
		

		
		public Siniestro(Vehiculo vehiculo, Date fecha, int perdida) { //constructor
			super();
			this.vehiculo = vehiculo;
			this.fecha = fecha;
			this.perdida = perdida;
		}



		public Siniestro() {
			super();
			// TODO Auto-generated constructor stub
		}



		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
	    
		@ManyToOne
		private Vehiculo vehiculo;//IMPORTANTE - Relaciona el siniestro con vehiculo

		private Date fecha;
		private int perdida;
		/*private int id_vehiculo;    no lo pondríamos porque lo crea directamente*/
	

}