package modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Libros")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="ISBN")
	private String ISBN;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy="libro")
	Set<Recogida> recogidas;
	
	public Libro(String ISBN, String nombre){
		this.ISBN = ISBN;
		this.nombre = nombre;
		this.recogidas =  new HashSet<Recogida>();
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Recogida> getRecogidas() {
		return recogidas;
	}

	public void setRecogidas(Set<Recogida> recogidas) {
		this.recogidas = recogidas;
	}


	
	
}
