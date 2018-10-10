package com.Alfonso20180619;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class MensajeBO {

	ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>();
	
	/*public void nuevo_mensaje(Mensaje mensaje) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(mensaje);
		
		transaction.commit();
		session.close();
		
	} */
	
	
	public ArrayList<Mensaje> consulta_mensaje(Usuario usuario){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Usuario> hqlQuery = session.createQuery("FROM Mensaje m WHERE m.destinatarios.id=(:condition) OR m.remitente.id=(:condition)");
		hqlQuery.setParameter("condition", usuario.getId());
		ArrayList<Mensaje> mensajes =(ArrayList) hqlQuery.list();
		
		session.close();		
		
		return mensajes;
		
	}
	
	public void enviar_mensaje(int id, String texto, String[] usuarios){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Usuario remitente = new Usuario();
		remitente.setId(id);
		
		/*ArrayList<Usuario> usuarios = new ArrayList<Usuario>();*/
		
		for(int i=0; i<usuarios.length; i++) {
			
			Mensaje mensaje = new Mensaje();
			Usuario destinatario = new Usuario();
			
			destinatario.setId(Integer.parseInt(usuarios[i]));
			
			mensaje.setDestinatarios(destinatario);
			mensaje.setTexto(texto);
			mensaje.setRemitente(remitente);
			
			session.save(mensaje);
		}
		
		transaction.commit();
		session.close();	
		
	}
	
	
}
