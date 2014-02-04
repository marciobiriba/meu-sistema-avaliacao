package br.edu.infnet.modelo.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.edu.infnet.pojo.Avaliacao;
import br.edu.infnet.pojo.Usuario;
import br.edu.infnet.util.HibernateUtil;

public class AvaliacaoDAO {
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	public Avaliacao consultar(Integer codigo) {
		Avaliacao retorno = new Avaliacao();
		try {
			session = HibernateUtil.getSession();
			session.beginTransaction();
			retorno = (Avaliacao) session.load(Avaliacao.class, codigo);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return retorno;
	}

	public void excluir(Avaliacao avaliacao) {
		try {
			session = HibernateUtil.getSession();
			session.beginTransaction();
			session.delete(avaliacao);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}		
	}

	public void incluir(Avaliacao avaliacao) {
		try {
			session = HibernateUtil.getSession();
			session.beginTransaction();
			session.save(avaliacao);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}

	public void atualizar(Avaliacao avaliacao) {
		try {
			session = HibernateUtil.getSession();
			session.beginTransaction();
			session.save(avaliacao);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	public Avaliacao buscar(Usuario u) {
		Criteria c = session.createCriteria(Avaliacao.class);
		c.add(Restrictions.eq("usuario" , u));
		return (Avaliacao) c.uniqueResult();
	}

}
