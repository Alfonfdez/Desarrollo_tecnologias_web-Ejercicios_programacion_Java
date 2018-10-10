package com.Alfonso20180529;

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
		
		String numero1 = request.getParameter("n1");
		
		String numero2 = request.getParameter("n2");
		
		String op = request.getParameter("op");
	
		
		int n1_int = Integer.parseInt(numero1);
		int n2_int = Integer.parseInt(numero2);
		
		int resultado=0;	
		
			if(op.equals("suma")) {
				resultado=n1_int+n2_int;
			} else if(op.equals("resta")) {
				resultado=n1_int-n2_int;
			} else if(op.equals("multiplicacion")) {
				resultado=n1_int*n2_int;
			} else if(op.equals("division")) {
				resultado=n1_int/n2_int;
			}
			
		
		response.getWriter().append(""+resultado);
		
		/*String cosita = request.getParameter("nombre");
		System.out.println(cosita);*/

		
		/*response.getWriter().append("cosita");*/
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
