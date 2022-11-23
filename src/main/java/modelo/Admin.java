package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="admins")
public class Admin extends Usuario{
	
	@Column(name="n_colegiado")
	private String n_colegiado;
	
	public Admin(String dni,String nombre, String n_colegiado, String nUsuario, String contrasenia) {
		super(dni, nombre, nUsuario, contrasenia);
		// TODO Auto-generated constructor stub
		this.n_colegiado = n_colegiado;
	}
	

}
