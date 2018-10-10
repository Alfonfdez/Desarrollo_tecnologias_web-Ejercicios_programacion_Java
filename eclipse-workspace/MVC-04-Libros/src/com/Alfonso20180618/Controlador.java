package com.Alfonso20180618;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
		
		LibroBO libroBO = new LibroBO();
		
		String action = request.getParameter("action");
		String pagina = "";
		
		if(action.equals("alta")) {
			
			Libro libro = new Libro();
			
			String titulo = request.getParameter("titulo");
			libro.setTitulo(titulo);
			
			float precio = Float.parseFloat(request.getParameter("precio"));
			libro.setPrecio(precio);
			
			libroBO.alta(libro);
		}
		
		else if(action.equals("consulta")) {
			
			ArrayList<Libro> libros = libroBO.consulta();
			request.setAttribute("libros", libros);
			pagina="consulta.jsp";	
			
		}
		
		else if(action.equals("alta2")) {
			
			Libro libro = new Libro();
			
			String titulo = request.getParameter("titulo2");
			libro.setTitulo(titulo);
			
			float precio = Float.parseFloat(request.getParameter("precio2"));
			libro.setPrecio(precio);
			
			libroBO.alta(libro);

			ArrayList<Libro> libros = libroBO.consulta();
			request.setAttribute("libros", libros);
			pagina="consulta.jsp";	
		}
		
		else if(action.equals("baja")) {
			
			int id = Integer.parseInt(request.getParameter("id"));
			
			libroBO.baja(id);
			
			ArrayList<Libro> libros = libroBO.consulta();
			request.setAttribute("libros", libros);
			pagina="consulta.jsp";	
		}
		
		else if(action.equals("modificar")) {
			
			int id = Integer.parseInt(request.getParameter("id"));
			String titulo = request.getParameter("titulo_modificado");
			float precio = Float.parseFloat(request.getParameter("precio_modificado"));
			
			libroBO.modificacion(id, titulo, precio);
			
			ArrayList<Libro> libros = libroBO.consulta();
			request.setAttribute("libros", libros);
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
