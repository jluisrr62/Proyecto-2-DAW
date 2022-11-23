package main;

import modelo.Admin;
import modelo.Alumno;
import modelo.Usuario;
import modeloDAO.GenericDAO;


public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario a1 = new Alumno("734265B","Javier");
		Usuario b1 = new Admin("717255C","Jorge", "47891494");
		GenericDAO<Usuario> aDAO = new GenericDAO<Usuario>(Usuario.class);
		
		aDAO.insertarRegistroHibernate(a1);
		aDAO.insertarRegistroHibernate(b1);
	}

}
