package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
public class Usuario {
	@Id
	@Column(name="dni")
	private String dni;
	@Column(name = "nombre")
	private String nombre;
	@Column(name="contrasenia")
	private String contrasenia;

	public Usuario(String n) {
		this.nombre = n;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
