package com.Alfonso20180702;

public class PedidoUtil {
	
	/*MÉTODOS DE LÓGICA*/
	
	//COSTE TOTAL
	public static CostePedido getCosteDelivery(Pedido pedido) {
	
		int resultado1 = getCosteTipo(pedido.getTipo()); //Va al COSTE TIPO de abajo
		float resultado2 = getCosteSize(pedido.getSize()); //Va al COSTE SIZE de abajo
		float resultado3 = getCosteCodigo(pedido.getCodigo()); //Va al COSTE CODIGO de abajo
		int resultado4 = getCosteEntrega(pedido.getEntrega()); //Va al COSTE PEDIDO de abajo
		
		float costeTotal = ((resultado1*resultado2)*resultado3)+resultado4;
		
		
		CostePedido costePedido = new CostePedido();
		
		costePedido.setCosteTotal(costeTotal);
		
		return costePedido;
	}

	//COSTE TIPO
	private static int getCosteTipo(String tipo) {
		
		if(tipo.equals("Margarita")) {
			return 6;
		}
		
		else if(tipo.equals("Vegetal")) {
			return 7;
		}
		
		else if(tipo.equals("Carbonara")) {
			return 8;
		}
		
		else if(tipo.equals("Barbacoa")) {
			return 9;
		}
		
		else {
			return 0;
		}
		
	}
	
	//COSTE SIZE
	private static float getCosteSize(String size) {
			
		if(size.equals("Pequena")) {
			return (float) 0.8;
		}
		
		else if(size.equals("Mediana")) {
			return 1;
		}
		
		else if(size.equals("Grande")) {
			return (float) 1.2;
		}
			
		else {
			return 1;
		}
		
	}
	
	//COSTE CODIGO
	private static float getCosteCodigo(String codigo) {
		
		if(codigo.equals("esfamiao")) {
			return (float) 0.6;
		}
		
		else {
			return 1;
		}
		
	}
	
	//COSTE ENTREGA
	private static int getCosteEntrega(String entrega) {
			
		if(entrega.equals("Si")) {
			return 4;
		}
		
		else if(entrega.equals("No")) {
			return 0;
		}
		
		else {
			return 0;
		}
		
	}

}
