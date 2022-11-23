package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Libros")
public class Libro {
	@Id
	@Column(name="ISBN", length=64)
	private String ISBN;
	@Column(name = "nombre")
	private String nombre;
	
	public Libro(String ISBN, String nombre){
		this.ISBN = ISBN;
		this.nombre = nombre;
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
	
	
	
}
