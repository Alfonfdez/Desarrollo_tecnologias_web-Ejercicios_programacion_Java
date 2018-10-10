import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Para generar números autoincrementados
	private int id;
	private String nombre;
	private int edad;

	//Tener en cuenta que si definimos un constructor, este debe ser público
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}