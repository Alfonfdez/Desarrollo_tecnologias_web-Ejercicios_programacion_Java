package com.Alfonso20180628;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class MalabarAction extends ActionSupport { // Escribimos esta línea e importamos: 'extends ActionSupport'

	private Malabar malabar;

	private List<Malabar> malabares;

	
	//SETTERS & GETTERS
	public Malabar getMalabar() {
		return malabar;
	}

	public void setMalabar(Malabar malabar) {
		this.malabar = malabar;
	}

	public List<Malabar> getMalabares() {
		return malabares;
	}

	public void setMalabares(List<Malabar> malabares) {
		this.malabares = malabares;
	}
	
	/*MÉTODOS*//*/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\*/
	
	//ALTA
	public String alta() {
		MalabarBO malabarBO = new MalabarBO();
		malabarBO.alta(malabar);
		return SUCCESS;
	}
	
	//CONSULTA
	public String consulta() {
		MalabarBO malabarBO = new MalabarBO();
		malabares = malabarBO.consulta();
		return SUCCESS;
	}
	
	//1 SOLO MALABAR
	public String muestraMalabar() {
		MalabarBO malabarBO = new MalabarBO();
		malabar = malabarBO.getMalabar(malabar);
		return SUCCESS;
	}
	
	//MODIFICACIÓN
	public String modificacion() {
		MalabarBO malabarBO = new MalabarBO();
		malabarBO.modifica(malabar);
		return SUCCESS;
	}

	//BAJA
	public String baja() {
		MalabarBO malabarBO = new MalabarBO();
		malabarBO.baja(malabar);
		return SUCCESS;
	}
	
}
