import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main2 {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Autor autor = new Autor();
		autor.setNombre("Juan");
				
		session.save(autor);
		transaction.commit();
		session.close();

	}

}
