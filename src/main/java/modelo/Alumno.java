package modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno extends Usuario{
	public Alumno(String dni, String nombre, String nUsuario, String contrasenia) {
		super(dni, nombre, nUsuario, contrasenia);
		// TODO Auto-generated constructor stub
	}

}
