package com.Alfonso20180531;

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
		
		int numero1 = Integer.parseInt(request.getParameter("numero1"));
		int numero2 = Integer.parseInt(request.getParameter("numero2"));
		String operacion = request.getParameter("operacion");
		
		int resultado =0;
		
		if(operacion.equals("suma")) {
			resultado = numero1+numero2;
		} else if(operacion.equals("resta")) {
			resultado = numero1-numero2;
		} else if(operacion.equals("multiplicacion")) {
			resultado = numero1*numero2;
		} else if(operacion.equals("division")) {
			resultado = numero1/numero2;
		}
		

	
		//ponemos en el objeto 'request' los datos que vamos a enviar al .jsp
		request.setAttribute("resultado", resultado);
		
		//redireccionamos al archivo .jsp
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
