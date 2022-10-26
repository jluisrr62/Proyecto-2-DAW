package modelo;

public class Usuario {
	private String dni;
	private String nombre;
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
