package br.edu.infnet.modelo.dao;

import br.edu.infnet.util.HibernateUtil;

public class DAOFactory {
	
	public static UsuarioDAO criarUSuarioDAO(){
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
	
}
