package com.Alfonso20180619;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class UsuarioBO {
	
	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	

	public void alta(Usuario usuario) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(usuario);
		
		transaction.commit();
		session.close();
		
	}
	
	public void baja(int id) {
		
		Usuario usuario = new Usuario();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		
		Query hqlQuery = session.createQuery("DELETE FROM Usuario WHERE id=(:condicion)");
		hqlQuery.setParameter("condicion", id);
		
		hqlQuery.executeUpdate();	
		transaction.commit();
		session.close();
		
	}
	
	public Usuario login(String nombre, String pass) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		
		Query<Usuario> hqlQuery = session.createQuery("FROM Usuario WHERE nombre=(:condicion) AND pass=(:condicion2)");
		hqlQuery.setParameter("condicion", nombre);
		hqlQuery.setParameter("condicion2", pass);
		
		Usuario usuario = hqlQuery.uniqueResult();
		
		session.close();
		return usuario;
	
	}
	
	public ArrayList<Usuario> consulta(){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Usuario> hqlQuery = session.createQuery("FROM Usuario");
		
		ArrayList<Usuario> usuarios =(ArrayList) hqlQuery.list();
		
		session.close();		
		
		return usuarios;
		
	}
	

	
	
	
	
	
	
}
