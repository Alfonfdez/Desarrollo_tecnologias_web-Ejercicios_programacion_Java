package com.Alfonso20180614;

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

	
		PacienteBO pacienteBO = new PacienteBO();
		
		String pagina ="";
		String action = request.getParameter("action");
		
		if(action.equals("ingreso")) {
			
			Paciente paciente = new Paciente();
			
			String nombre = request.getParameter("nombre");
			paciente.setNombre(nombre);
			
			String apellido = request.getParameter("apellido");
			paciente.setApellido(apellido);
			
			String fecha = request.getParameter("fecha");

			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			
			try {
				
				Date fecha2 = formatter.parse(fecha);
				paciente.setFecha(fecha2);
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			pacienteBO.ingreso(paciente);
			
		}
		
		else if(action.equals("consulta_modificacion")) {
			
			int id = Integer.parseInt(request.getParameter("id_paciente"));
			
			Paciente paciente = pacienteBO.getPaciente(id);
			
			request.setAttribute("paciente", paciente);
			
			pagina = "modificacion.jsp";
		}
		
		else if(action.equals("modificacion")) {
			
			Paciente paciente = new Paciente();
			
			String nombre = request.getParameter("nombre");
			paciente.setNombre(nombre);
			
			String apellido = request.getParameter("apellido");
			paciente.setApellido(apellido);
			
			int id = Integer.parseInt(request.getParameter("id_paciente"));
			paciente.setId(id);
			
			String fecha = request.getParameter("fecha");

			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			
			try {
				
				Date fecha2 = formatter.parse(fecha);
				paciente.setFecha(fecha2);
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			pacienteBO.modificacion(paciente);
			
			pagina = "modificacion.jsp";
		}
		
		else if(action.equals("consulta")) {
			ArrayList<Paciente> pacientes = pacienteBO.consulta();
			request.setAttribute("pacientes", pacientes);
			pagina="consulta.jsp";	
		}
		
		else if(action.equals("borrar")) {
			
			int id = Integer.parseInt(request.getParameter("id_paciente"));
			
			pacienteBO.baja(id);
			
			pagina = "modificacion.jsp";
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
