package com.Alfonso20180628;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class PedidoAction  extends ActionSupport { // Escribimos esta línea e importamos: 'extends ActionSupport'{

	private Pedido pedido;

	private List<Pedido> pedidos;

	
	//SETTERS & GETTERS
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	
	/*MÉTODOS*//*/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\*/
	
	//ALTA
	public String alta() {
		PedidoBO pedidoBO = new PedidoBO();
		pedidoBO.alta(pedido);
		return SUCCESS;
	}
	
	//CONSULTA
	public String consulta() {
		PedidoBO pedidoBO = new PedidoBO();
		pedidos = pedidoBO.consulta();
		return SUCCESS;
	}
	
	//1 SOLO PEDIDO
	public String muestraPedido() {
		PedidoBO pedidoBO = new PedidoBO();
		pedido = pedidoBO.getPedido(pedido);
		return SUCCESS;
	}
	
	//MODIFICACIÓN
	public String modificacion() {
		PedidoBO pedidoBO = new PedidoBO();
		pedidoBO.modifica(pedido);
		return SUCCESS;
	}

	//BAJA
	public String baja() {
		PedidoBO pedidoBO = new PedidoBO();
		pedidoBO.baja(pedido);
		return SUCCESS;
	}
}
