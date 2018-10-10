package com.Alfonso20180626;

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

		MalabarBO malabarBO = new MalabarBO();
		
		String pagina = "";
		
		String action = request.getParameter("action");
		
		if(action.equals("alta")) {
			
			Malabar malabar = new Malabar();
			
			String nombre = request.getParameter("nombre");
			malabar.setNombre(nombre);
			
			String descripcion = request.getParameter("descripcion");
			malabar.setDescripcion(descripcion);
			
			String marca = request.getParameter("marca");
			malabar.setMarca(marca);
			
			int stock = Integer.parseInt(request.getParameter("stock"));
			malabar.setStock(stock);
			
			malabarBO.alta(malabar);
		
		}
		
		else if(action.equals("consulta")) {
			
			ArrayList<Malabar> malabares = malabarBO.consulta();
			request.setAttribute("malabares", malabares);
			pagina="consulta.jsp";	
			
		}
		
		else if(action.equals("consulta_modificacion")) {
			
			int id = Integer.parseInt(request.getParameter("id_malabar"));
			
			Malabar malabar = malabarBO.getMalabar(id);
			
			request.setAttribute("malabar", malabar);
			
			pagina = "modificacion.jsp";
			
			
		}
		
		else if(action.equals("modificacion")) {
			
			Malabar malabar = new Malabar();
			
			String nombre = request.getParameter("nombre");
			malabar.setNombre(nombre);
			
			String descripcion = request.getParameter("descripcion");
			malabar.setDescripcion(descripcion);
			
			String marca = request.getParameter("marca");
			malabar.setMarca(marca);
			
			int stock = Integer.parseInt(request.getParameter("stock"));
			malabar.setStock(stock);
			
			int id = Integer.parseInt(request.getParameter("id_malabar"));
			malabar.setId(id);
			
				
			malabarBO.modificacion(malabar);
			
			
			malabarBO.getMalabar(id);
			
			request.setAttribute("malabar", malabar);
			
			pagina = "modificacion.jsp";
		}
		
		else if(action.equals("eliminacion")) {
			
			int id = Integer.parseInt(request.getParameter("id_malabar"));
			
			malabarBO.eliminacion(id);
			
			
			//Iremos a Consulta después de 'Eliminar'
			ArrayList<Malabar> malabares = malabarBO.consulta();
			request.setAttribute("malabares", malabares);
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
