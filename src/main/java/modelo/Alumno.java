package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno extends Usuario{
	
	@Column(name="curso")
	private String curso;
	
	public Alumno(String dni, String nombre, String curso) {
		super(dni, nombre);
		// TODO Auto-generated constructor stub
		this.curso = curso;
	}

}
