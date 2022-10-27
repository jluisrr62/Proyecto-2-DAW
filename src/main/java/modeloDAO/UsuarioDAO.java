package modeloDAO;

import java.util.ArrayList;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.Usuario;
import utils.HibernateUtil;

public class UsuarioDAO{
	public void insertarUsuarioHibernate(Usuario a) {
		Transaction tr = null;
		Session sesion = null;

		try {

			sesion = HibernateUtil.getSessionFactory().openSession();
			tr = sesion.beginTransaction();
			sesion.persist(a);
			tr.commit();

		} catch (PersistenceException e) {
			tr.rollback();

		} finally {
			sesion.close();
		}
	}
	
	public void modificarUsuarioHibernate(Usuario a) {
		Transaction tr = null;
		Session sesion = null;
		
		try {

			sesion = HibernateUtil.getSessionFactory().openSession();
			tr = sesion.beginTransaction();
			sesion.merge(a);
			tr.commit();

		} catch (PersistenceException e) {
			tr.rollback();

		} finally {
			sesion.close();
		}
	}
	
	public void deleteUsuarioHibernate(Usuario a) {
		Transaction tr = null;
		Session sesion = null;
		
		try {

			sesion = HibernateUtil.getSessionFactory().openSession();
			tr = sesion.beginTransaction();
			sesion.remove(a);
			tr.commit();

		} catch (PersistenceException e) {
			tr.rollback();

		} finally {
			sesion.close();
		}
	}
	
	public ArrayList<Usuario> listarUsuariosHibernate() {
		ArrayList<Usuario> resultado = null;
		
		Transaction tr = null;
		Session sesion = null;
		
		try {

			sesion = HibernateUtil.getSessionFactory().openSession();
			tr = sesion.beginTransaction();
			resultado = (ArrayList<Usuario> ) sesion.createQuery("from Usuario").getResultList();
			tr.commit();
			
			return resultado;

		} catch (PersistenceException e) {
			tr.rollback();

		} finally {
			sesion.close();
		}
		
		return null;
	}
	
	public Usuario buscarPorIdHibernate(int i) {
		
		Transaction tr = null;
		Session sesion = null;
		
		try {

			sesion = HibernateUtil.getSessionFactory().openSession();
			tr = sesion.beginTransaction();
			Usuario miUsuario = (Usuario) sesion.find(Usuario.class, i);
			System.out.println("El Usuario buscado se llama " + miUsuario.getNombre());
			tr.commit();
			return miUsuario;

		} catch (PersistenceException e) {
			tr.rollback();

		} finally {
			sesion.close();
		}
		
		return null;
	}
}
