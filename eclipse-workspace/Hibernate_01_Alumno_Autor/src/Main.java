import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Alumno al = new Alumno();
		al.setNombre("Juan");
		al.setEdad(10);
				
		session.save(al);
		transaction.commit();
		session.close();
	}

}
