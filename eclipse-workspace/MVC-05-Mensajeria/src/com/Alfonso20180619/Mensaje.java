package com.Alfonso20180619;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Mensaje {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String texto;
	
	@OneToOne
	private Usuario remitente;
	
	@OneToOne
	private Usuario destinatarios;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Usuario getRemitente() {
		return remitente;
	}

	public void setRemitente(Usuario remitente) {
		this.remitente = remitente;
	}

	public Usuario getDestinatarios() {
		return destinatarios;
	}

	public void setDestinatarios(Usuario destinatarios) {
		this.destinatarios = destinatarios;
	}
	
	
}
