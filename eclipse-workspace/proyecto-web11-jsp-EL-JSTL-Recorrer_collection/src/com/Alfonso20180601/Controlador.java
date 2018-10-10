package com.Alfonso20180601;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


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
		String dni = request.getParameter("dni");
		String nombre = request.getParameter("nombre");
		String direccion = request.getParameter("direccion");
		
		Persona persona = new Persona();
		
		/*Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(persona);
		transaction.commit();*/
			
		persona.getDni();
		persona.getNombre();
		persona.getDireccion();
		
		/*Query hqlQuery = session.createQuery("FROM Persona");	
		List<Persona> personas = hqlQuery.list();
		session.close();*/
		
		/*Iterator<Persona> it = personas.iterator();
		while(it.hasNext()) {
			Persona persona = it.next();
			response.getWriter().append(l.getTitulo() + "" + l.getPrecio());
		}*/
		
		//ponemos en el objeto 'request' los datos que vamos a enviar al .jsp
		request.setAttribute("persona", persona);
		/*request.setAttribute("personas", personas);*/
		
		//redireccionamos al archivo .jsp
		request.getRequestDispatcher("salida.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
