package main;

import modelo.Alumno;
import modelo.Usuario;
import modeloDAO.AlumnoDAO;
import modeloDAO.UsuarioDAO;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario a1 = new Alumno("Jaime", "2bachiller");
		AlumnoDAO aDAO = new AlumnoDAO();
		
		aDAO.insertarAlumnoHibernate(a1);
	}

}
