package com.Alfonso20180604;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		String palabra = request.getParameter("palabra");
		
		ArrayList<String> palabras = new ArrayList<String>();
		palabras.add(palabra);
		
		HttpSession session = request.getSession();
		
		/*ArrayList<String> valorRecuperadoDelFormulario = new ArrayList<String>();
		ArrayList al = (ArrayList) session.getAttribute("palabras");
		if(al==null){
			al = new ArrayList();
		}
		al.add(valorRecuperadoDelFormulario);*/
		
		//ponemos en el objeto 'request' los datos que vamos a enviar al .jsp
		request.setAttribute("palabra", palabras);
		
		//ponemos en el objeto 'request' los datos que vamos a enviar al .jsp
		/*session.setAttribute("valorRecuperadoDelFormulario", valorRecuperadoDelFormulario);*/
		
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
