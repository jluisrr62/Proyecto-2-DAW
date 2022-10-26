package modelo;

public class Usuario {
	private String dni;
	private String nombre;
	private String contrasenia;
	private boolean admin;
	
	public Usuario(String n, boolean a) {
		this.nombre = n;
		this.admin = a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}	
}
