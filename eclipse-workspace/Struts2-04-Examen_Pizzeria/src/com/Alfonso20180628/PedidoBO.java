package com.Alfonso20180628;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class PedidoBO {
	
	//ALTA
	public void alta(Pedido pedido) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(pedido);
		
		transaction.commit();
		session.close();	
	}

	//CONSULTA
	public List<Pedido> consulta(){	
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM Pedido");
		
		List<Pedido> pedidos  = query.list();
		
		session.close();
		return pedidos;	
	}
	
	//COGER 1 MALABAR
	public Pedido getPedido(Pedido pedido){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Pedido p = session.get(Pedido.class, pedido.getId());
		
		session.close();
		
		return p;
	}
	
	//MODIFICACIÓN
	public void  modifica(Pedido pedido){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.update(pedido);
		
		transaction.commit();
		session.close();
	}
	
	//BAJA
	public void  baja(Pedido pedido){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.remove(pedido);
		
		transaction.commit();
		session.close();	
	}
}
