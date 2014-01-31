package br.edu.infnet.modelo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.edu.infnet.pojo.Usuario;
import br.edu.infnet.util.HibernateUtil;

public class UsuarioDAO {

	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	public void incluir(Usuario u) {
		try {
			session = HibernateUtil.getSession();
			session.beginTransaction();
			session.save(u);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	public void alterar(Usuario p) {
		try {
			session = HibernateUtil.getSession();
			session.beginTransaction();
			session.save(p);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	public void excluir(Usuario p) {
		try {
			session = HibernateUtil.getSession();
			session.beginTransaction();
			session.delete(p);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	public Usuario consultar(int codigo) {
		Usuario retorno = new Usuario();
		try {
			session = HibernateUtil.getSession();
			session.beginTransaction();
			retorno = (Usuario) session.load(Usuario.class, codigo);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return retorno;
	}

	@SuppressWarnings("unchecked")
	public List<Usuario> listar() {
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			session = HibernateUtil.getSession();
			session.beginTransaction();
			lista = (List<Usuario>) session.createCriteria(Usuario.class).list();
			session.getTransaction().commit();
		} catch (Exception e) {			
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return lista;
	}

	@SuppressWarnings("unchecked")
	public List<Usuario> listar(Usuario Usuario) {
		Criteria c = session.createCriteria(Usuario.class);
		if (Usuario.getNome().length() > 0) {
			c.add(Restrictions.like("nome", Usuario.getNome() + "%"));
		}
		c.addOrder(Order.asc("nome"));
		return (List<Usuario>) c.list();
	}
	public Usuario buscarPorLogin(String login){
		String hql = "select u from Usuario u where u.login = :login";
		Query consulta = this.session.createQuery(hql);
		consulta.setString("login" , login);
		return (Usuario) consulta.uniqueResult();
	}

	public void atualizar(Usuario u) {
		try {
			session = HibernateUtil.getSession();
			session.beginTransaction();
			session.update(u);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
}
