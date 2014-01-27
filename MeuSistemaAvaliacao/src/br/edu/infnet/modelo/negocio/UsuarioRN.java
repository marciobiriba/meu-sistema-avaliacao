package br.edu.infnet.modelo.negocio;

import java.util.List;

import br.edu.infnet.excecao.RNException;
import br.edu.infnet.modelo.dao.DAOFactory;
import br.edu.infnet.modelo.dao.UsuarioDAO;
import br.edu.infnet.pojo.Usuario;

public class UsuarioRN {
	private UsuarioDAO usuarioDAO;
	public UsuarioRN(){
		this.usuarioDAO = DAOFactory.criarUSuarioDAO();
	}
	public Usuario carregar(Integer codigo){
		return this.usuarioDAO.consultar(codigo);
	}
	public void excluir(Usuario usuario) throws RNException{
		if(usuario.isAdministrador()){
			throw new RNException("Usuários adminstradores não podem ser excluidos.");
		}else{
			usuarioDAO.excluir(usuario);
		}
	}
	public void salvar(Usuario usuario) {
		Integer codigo = usuario.getCodigo();
		if(codigo == null || codigo == 0){
			this.usuarioDAO.incluir(usuario);
		}else{
			this.usuarioDAO.atualizar(usuario);
		}
	}
	public Usuario buscarPorLogin(String login){
		return this.usuarioDAO.buscarPorLogin(login);
	}
	public List<Usuario> listar(){
		return this.usuarioDAO.listar();
	}
}
