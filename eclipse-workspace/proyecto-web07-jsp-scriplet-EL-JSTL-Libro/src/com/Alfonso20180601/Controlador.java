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
		String isbn = request.getParameter("isbn");
		String titulo = request.getParameter("titulo");
		int precio = Integer.parseInt(request.getParameter("precio"));
		
		Libro libro = new Libro(isbn, titulo, precio);
		libro.setIsbn(isbn);
		libro.setTitulo(titulo);
		libro.setPrecio(precio);
		
		
		//ponemos en el objeto 'request' los datos que vamos a enviar al .jsp
		request.setAttribute("libro", libro);
		
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
