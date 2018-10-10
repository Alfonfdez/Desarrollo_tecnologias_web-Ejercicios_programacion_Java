package com.Alfonso20180611;

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
		
		Invitado invitado = new Invitado();
		InvitadosBO invitadosBO = new InvitadosBO();
		
		String pagina ="";
		String action = request.getParameter("action");
		
		if(action.equals("alta")) {
			String nombre = request.getParameter("nombre");
			invitado.setNombre(nombre);
			
			invitadosBO.altaInvitado(invitado);
		} 
		
		else if(action.equals("baja")) {
			String nombre = request.getParameter("nombre");
			invitado.setNombre(nombre);
			
			invitadosBO.bajaInvitado(invitado);
		} 
		
		else if(action.equals("consulta")) {
			ArrayList<Invitado> invitados = invitadosBO.consulta();
			request.setAttribute("invitados", invitados);
			pagina="Consulta.jsp";			
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
