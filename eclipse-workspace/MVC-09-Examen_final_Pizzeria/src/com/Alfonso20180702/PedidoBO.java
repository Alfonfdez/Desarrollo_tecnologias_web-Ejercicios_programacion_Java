package com.Alfonso20180702;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class PedidoBO {
	
	ArrayList<Pedido> pedidos = new ArrayList();
	
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
	
	//COGER 1 pedido
	public Pedido getPedido(int id) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Pedido> hqlQuery = session.createQuery("FROM Pedido WHERE id=(:condicion)");
		hqlQuery.setParameter("condicion", id);
		
		Pedido pedido = hqlQuery.uniqueResult();
		
		session.close();
		
		return pedido;
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
	public void baja(int id) {
		
		Pedido pedido = new Pedido();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();	
		
		Query hqlQuery = session.createQuery("DELETE FROM Pedido WHERE id=(:condicion)");
		hqlQuery.setParameter("condicion", id);
		
		hqlQuery.executeUpdate();	
		
		transaction.commit();
		session.close();

	}
	
}
