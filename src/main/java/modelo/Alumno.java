package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno extends Usuario{
	
	@Column(name="curso")
	private String curso;
	
	public Alumno(String n, String c) {
		super(n);
		// TODO Auto-generated constructor stub
		this.curso = c;
	}

}
