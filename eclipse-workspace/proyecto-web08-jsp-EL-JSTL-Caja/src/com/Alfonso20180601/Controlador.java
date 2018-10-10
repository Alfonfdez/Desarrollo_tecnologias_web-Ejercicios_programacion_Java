package com.Alfonso20180601;

import java.io.IOException;
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
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		String material = request.getParameter("material");
		String tamano = request.getParameter("tamano");
		String comentario = request.getParameter("comentario");
		
		Mensaje mensaje = new Mensaje(nombre, material, tamano, comentario);
		mensaje.setNombre(nombre);
		mensaje.setMaterial(material);
		mensaje.setTamano(tamano);
		mensaje.setComentario(comentario);
		
		
		//ponemos en el objeto 'request' los datos que vamos a enviar al .jsp
		request.setAttribute("mensaje", mensaje);
		
		//redireccionamos al archivo .jsp
		request.getRequestDispatcher("/salida.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
