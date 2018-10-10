package com.Alfonso20180619;

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
		
		MensajeBO mensajeBO = new MensajeBO();
		
		String action = request.getParameter("action");
		String pagina = "";
		
		HttpSession session = request.getSession();
		
		if(action.equals("alta")) {
			
			Usuario usuario = new Usuario();
			
			String nombre = request.getParameter("nombre_nuevo");
			usuario.setNombre(nombre);
			
			String pass = request.getParameter("pass_nuevo");
			usuario.setPass(pass);
			
			usuarioBO.alta(usuario);
			
			
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
		
		else if(action.equals("enviar")) {
			
			ArrayList<Usuario> usuarios = usuarioBO.consulta();
			request.setAttribute("usuarios", usuarios);
			pagina="enviar.jsp";	
			
		}
		
		else if(action.equals("mensaje_enviar")) {
			
			Mensaje mensaje = new Mensaje();
			
			String texto = request.getParameter("comentarios");
			mensaje.setTexto(texto);
			
			String[] usuarios = request.getParameterValues("usuarios[]");
			
			Usuario usuario = (Usuario) session.getAttribute("usserSession");
			
			mensajeBO.enviar_mensaje(usuario.getId(), texto, usuarios);
					
			pagina="pagina2.jsp";
			
			/*request.getParameterValues(arg0);*/
			
		}
		
		else if(action.equals("mensaje_consulta")) {
			
			Usuario usuario = (Usuario) session.getAttribute("usserSession");
			
			ArrayList<Mensaje> mensajes = mensajeBO.consulta_mensaje(usuario);
			request.setAttribute("mensajes", mensajes);
					
			pagina="mensajes.jsp";

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
