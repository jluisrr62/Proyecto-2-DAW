package main;

import modelo.Admin;
import modelo.Alumno;
import modelo.Asignatura;
import modelo.Libro;
import modelo.Recogida;
import modelo.Usuario;
import modeloDAO.GenericDAO;


public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno javi = new Alumno("734265B","Javier", "javierito", "123javier");
		Admin jorjito = new Admin("717255C","Jorge", "47891494", "jorjito67", "123456");
		
		Libro mates = new Libro("owghuiorwghb", "matematicas");
		Libro lengua = new Libro("weibikr","lengua");
		
		Recogida recogida1 = new Recogida();
		
		Asignatura mates2 = new Asignatura("Mates","2Bachiller");
		Asignatura lengua1 = new Asignatura("Lengua","2Bachiller");
		
		GenericDAO<Usuario> aDAO = new GenericDAO<Usuario>(Usuario.class);
		GenericDAO<Libro> bDAO = new GenericDAO<Libro>(Libro.class);
		GenericDAO<Recogida> cDAO = new GenericDAO<Recogida>(Recogida.class);
		GenericDAO<Asignatura> dDao = new GenericDAO<Asignatura>(Asignatura.class);
		
		mates2.getLibros().add(mates);
		mates.setAsignatura(mates2);
		
		lengua1.getLibros().add(lengua);
		lengua.setAsignatura(lengua1);
		
		recogida1.setFecha(recogida1.parseFecha("2022-06-17"));
		recogida1.setHora(recogida1.parseHora("10:30"));
		
		javi.getRecogidas().add(recogida1);
		recogida1.setAlumno(javi);
		
		mates.getRecogidas().add(recogida1);
		recogida1.setLibro(mates);
		
		lengua.getAdmins().add(jorjito);
		jorjito.getLibros().add(lengua);
	
		dDao.insertarRegistroHibernate(mates2);
		dDao.insertarRegistroHibernate(lengua1);
		bDAO.insertarRegistroHibernate(mates);
		bDAO.insertarRegistroHibernate(lengua);
		aDAO.insertarRegistroHibernate(javi);
		aDAO.insertarRegistroHibernate(jorjito);
		cDAO.insertarRegistroHibernate(recogida1);
	}

}
