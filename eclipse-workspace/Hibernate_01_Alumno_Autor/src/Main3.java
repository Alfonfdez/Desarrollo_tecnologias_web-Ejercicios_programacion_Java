import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main3 {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Autor autor = new Autor();
		List<Libro> libros = new ArrayList<Libro>();
		libros.add(new Libro(autor, "titulo1"));
		libros.add(new Libro(autor, "titulo2"));
		autor.setNombre("Pepe");
		autor.setLibros(libros);
		
		session.save(autor);
		transaction.commit();
		session.close();

	}

}
