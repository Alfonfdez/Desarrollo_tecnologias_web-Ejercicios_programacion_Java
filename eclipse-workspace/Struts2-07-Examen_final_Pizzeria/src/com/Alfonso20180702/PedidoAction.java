package com.Alfonso20180702;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class PedidoAction  extends ActionSupport { // Escribimos esta l�nea e importamos: 'extends ActionSupport'{

	private Pedido pedido;

	private List<Pedido> pedidos;
	
	CostePedido costePedido;

	
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
	
	public CostePedido getCostePedido() {
		return costePedido;
	}

	public void setCostePedido(CostePedido costePedido) {
		this.costePedido = costePedido;
	}
	
	
	/*M�TODOS*//*/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\*/
	
	//ALTA Y COSTE PEDIDO
	public String alta() {
		PedidoBO pedidoBO = new PedidoBO();
		pedidoBO.alta(pedido);
		
		//GUARDAR RESULTADO L�GICA CosteViaje
		costePedido = PedidoUtil.getCosteDelivery(pedido);
		
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
	
	//MODIFICACI�N
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
