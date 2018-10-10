package com.Alfonso20180702;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		PedidoBO pedidoBO = new PedidoBO();
		
		CostePedido costePedido = new CostePedido();
		
		String pagina = "";
		
		String action = request.getParameter("action");
		
		if(action.equals("alta")) {
			
			Pedido pedido = new Pedido();
			
			String tipo = request.getParameter("tipo");
			pedido.setTipo(tipo);
			
			String size = request.getParameter("size");
			pedido.setSize(size);
			
			String codigo = request.getParameter("codigo");
			pedido.setCodigo(codigo);
			
			String entrega = request.getParameter("entrega");
			pedido.setEntrega(entrega);
				
			pedidoBO.alta(pedido);
			
			
			//GUARDAR RESULTADO LÓGICA CosteViaje
			
			costePedido = PedidoUtil.getCosteDelivery(pedido);
			
			request.setAttribute("costePedido", costePedido);
			
			
			pagina = "alta.jsp";
		
		}
		
		else if(action.equals("consulta")) {
			
			ArrayList<Pedido> pedidos = (ArrayList<Pedido>) pedidoBO.consulta();
			request.setAttribute("pedidos", pedidos);
			pagina="consulta.jsp";	
			
		}
		
		else if(action.equals("consulta_modificacion")) {
			
			int id = Integer.parseInt(request.getParameter("id_pedido"));
			
			Pedido pedido = pedidoBO.getPedido(id);
			
			request.setAttribute("pedido", pedido);
			
			pagina = "modificacion.jsp";
			
			
		}
		
		else if(action.equals("modificacion")) {
			
			Pedido pedido = new Pedido();
			
			String tipo = request.getParameter("tipo");
			pedido.setTipo(tipo);
			
			String size = request.getParameter("size");
			pedido.setSize(size);
			
			String codigo = request.getParameter("codigo");
			pedido.setCodigo(codigo);
			
			String entrega = request.getParameter("entrega");
			pedido.setEntrega(entrega);
					
			int id = Integer.parseInt(request.getParameter("id_pedido"));
			pedido.setId(id);
			
				
			pedidoBO.modifica(pedido);
			
			
			pedidoBO.getPedido(id);
			
			request.setAttribute("pedido", pedido);
			
			pagina = "modificacion.jsp";
		}
		
		else if(action.equals("eliminacion")) {
			
			int id = Integer.parseInt(request.getParameter("id_pedido"));
			
			pedidoBO.baja(id);
			
			
			//Iremos a Consulta después de 'Eliminar'
			ArrayList<Pedido> pedidos = (ArrayList<Pedido>) pedidoBO.consulta();
			request.setAttribute("pedidos", pedidos);
			pagina="consulta.jsp";	
			
			
		}
		
	
		request.getRequestDispatcher(pagina).forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
