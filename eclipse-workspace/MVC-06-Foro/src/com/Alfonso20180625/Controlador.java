package com.Alfonso20180625;

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

		
		UsuarioBO usuarioBO = new UsuarioBO();
		
		String pagina="";
		String action=request.getParameter("action");
		
		HttpSession session = request.getSession();
		
		if(action.equals("alta")) {
			
			Usuario usuario = new Usuario();
			
			String nombre = request.getParameter("nombre");
			usuario.setNombre(nombre);
			
			String pass = request.getParameter("pass");
			usuario.setPass(pass);
			
			usuarioBO.alta(usuario);
			
		}
		
		else if(action.equals("consulta")) {
			
			ArrayList<Usuario> usuarios = usuarioBO.consulta();
			request.setAttribute("usuarios", usuarios);
			pagina="consulta.jsp";

		}
		
		else if(action.equals("baja")) {
			
			int id = Integer.parseInt(request.getParameter("id_usuario"));
			
			usuarioBO.baja(id);
			
			ArrayList<Usuario> usuarios = usuarioBO.consulta();
			request.setAttribute("usuarios", usuarios);
			pagina="consulta.jsp";	
			
		}
		
		else if(action.equals("login")) {
			
			Usuario usuario = new Usuario();
			
			String nombre = request.getParameter("nombre");
			String pass = request.getParameter("pass");
			
			usuario = usuarioBO.login(nombre, pass);
			
			if(usuario!=null) {
				
				request.setAttribute("usuario_nombre", usuario.getNombre());
				request.setAttribute("usuario_id", usuario.getId());
				
				session.setAttribute("usserSession", usuario);
				
				pagina="pagina2.jsp";
				
			} else {
				
				pagina="error.jsp";
				
			}

			
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
