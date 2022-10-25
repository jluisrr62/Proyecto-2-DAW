package modelo;

public class Alumno {
	private int id;
	private String nombre;
	
	public Alumno(String n) {
		this.nombre = n;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
}
