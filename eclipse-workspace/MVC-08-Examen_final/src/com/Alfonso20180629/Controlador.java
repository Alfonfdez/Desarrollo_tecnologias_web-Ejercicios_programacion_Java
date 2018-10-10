package com.Alfonso20180629;

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
		
		ViajeBO viajeBO = new ViajeBO();
		
		CosteViaje costeViaje = new CosteViaje();
		
		String pagina = "";
		
		String action = request.getParameter("action");
		
		if(action.equals("altaviaje_costeviaje")) {
			
			Viaje viaje = new Viaje();
			
			int noches = Integer.parseInt(request.getParameter("noches"));
			viaje.setNoches(noches);
			
			String destino = request.getParameter("destino");
			viaje.setDestino(destino);
				
			viajeBO.alta(viaje);
			
			
			//GUARDAR RESULTADO LÓGICA CosteViaje
			
			costeViaje = ViajeUtil.getCosteTrip(viaje);
			
			request.setAttribute("costeViaje", costeViaje);
			
		
		}
		
		else if(action.equals("consulta")) {
			
			ArrayList<Viaje> viajes = (ArrayList<Viaje>) viajeBO.consulta();
			request.setAttribute("viajes", viajes);
			pagina="consulta.jsp";	
			
		}
		
		else if(action.equals("consulta_modificacion")) {
			
			int id = Integer.parseInt(request.getParameter("id_viaje"));
			
			Viaje viaje = viajeBO.getViaje(id);
			
			request.setAttribute("viaje", viaje);
			
			pagina = "modificacion.jsp";
			
			
		}
		
		else if(action.equals("modificacion")) {
			
			Viaje viaje = new Viaje();
			
			int noches = Integer.parseInt(request.getParameter("noches"));
			viaje.setNoches(noches);
			
			String destino = request.getParameter("destino");
			viaje.setDestino(destino);
					
			int id = Integer.parseInt(request.getParameter("id_viaje"));
			viaje.setId(id);
			
				
			viajeBO.modifica(viaje);
			
			
			viajeBO.getViaje(id);
			
			request.setAttribute("viaje", viaje);
			
			pagina = "modificacion.jsp";
		}
		
		else if(action.equals("eliminacion")) {
			
			int id = Integer.parseInt(request.getParameter("id_viaje"));
			
			viajeBO.baja(id);
			
			
			//Iremos a Consulta después de 'Eliminar'
			ArrayList<Viaje> viajes = (ArrayList<Viaje>) viajeBO.consulta();
			request.setAttribute("viajes", viajes);
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
