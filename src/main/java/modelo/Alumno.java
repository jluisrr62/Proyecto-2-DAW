package modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno extends Usuario{
	

	
	public Alumno(String dni, String nombre) {
		super(dni, nombre);
		// TODO Auto-generated constructor stub
	}

}
