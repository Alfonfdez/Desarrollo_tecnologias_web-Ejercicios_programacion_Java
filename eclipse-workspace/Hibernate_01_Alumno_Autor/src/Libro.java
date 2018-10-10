import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Libro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Autor autor;

	String titulo;
	
	
	public Libro() {
		
	}
	
	
	public Libro(Autor autor, String titulo) {
		this.autor = autor;
		this.titulo = titulo;
	}
	
	
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


}
