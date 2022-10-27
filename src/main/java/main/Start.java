package main;

import modelo.Admin;
import modelo.Alumno;
import modelo.Usuario;
import modeloDAO.UsuarioDAO;


public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario b1 = new Admin("717255C","Jorge", "47891494");
		UsuarioDAO aDAO = new UsuarioDAO();
		
		aDAO.insertarUsuarioHibernate(b1);
	}

}
