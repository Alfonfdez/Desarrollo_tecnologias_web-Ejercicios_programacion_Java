package com.Alfonso20180604;

import java.io.IOException;

import javax.servlet.ServletContext;
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
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int suma1_request=0;

		suma1_request=num1+num2;
		
		
		
		//Accedo a la sesión
		HttpSession session = request.getSession();
		
		int suma2_sesion = 0;
		if(session.getAttribute("suma2_sesion")!=null) {
			suma2_sesion = (int) session.getAttribute("suma2_sesion");
		}
		
		suma2_sesion = suma2_sesion + suma1_request;
		
		
		
		//Accedo al contexto
		ServletContext ctx = request.getServletContext();
		
		int suma3_contexto = 0;
		if(ctx.getAttribute("suma3_contexto")!=null) {
			suma3_contexto = (int) ctx.getAttribute("suma3_contexto");
		}
		
		suma3_contexto = suma3_contexto + suma1_request;
		
		
		
		//ponemos en el objeto 'request' los datos que vamos a enviar al .jsp
		request.setAttribute("suma1_request", suma1_request);
		
		//sesion
		session.setAttribute("suma2_sesion", suma2_sesion);
		
		//contexto
		ctx.setAttribute("suma3_contexto", suma3_contexto);
		
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
