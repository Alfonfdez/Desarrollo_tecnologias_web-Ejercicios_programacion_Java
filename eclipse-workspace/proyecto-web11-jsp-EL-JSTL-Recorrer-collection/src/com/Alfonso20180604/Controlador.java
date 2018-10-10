package com.Alfonso20180604;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

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
		
		String dni="12345678A";
		String nombre="AAA";
		String direccion="ZZZ";
		
		Persona persona = new Persona();
			
		persona.setDni(dni);
		persona.setNombre(nombre);
		persona.setDireccion(direccion);
		
		String dni2="12345678B";
		String nombre2="BBB";
		String direccion2="YYY";
		
		Persona persona2 = new Persona();
			
		persona2.setDni(dni2);
		persona2.setNombre(nombre2);
		persona2.setDireccion(direccion2);
		
		String dni3="12345678C";
		String nombre3="CCC";
		String direccion3="XXX";
		
		Persona persona3 = new Persona();
			
		persona3.setDni(dni3);
		persona3.setNombre(nombre3);
		persona3.setDireccion(direccion3);
		
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(persona);
		personas.add(persona2);
		personas.add(persona3);
		
		//ponemos en el objeto 'request' los datos que vamos a enviar al .jsp
		request.setAttribute("personas", personas);
		
		//redireccionamos al archivo .jsp
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
