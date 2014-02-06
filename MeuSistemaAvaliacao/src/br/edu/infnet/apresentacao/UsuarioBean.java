package br.edu.infnet.apresentacao;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.infnet.excecao.RNException;
import br.edu.infnet.modelo.negocio.UsuarioRN;
import br.edu.infnet.pojo.Usuario;

@ManagedBean(name="usuarioBean")
@RequestScoped
public class UsuarioBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario usuario = new Usuario();
	private List<Usuario> lista;
	private String confirmarSenha;
	private String destinoSalvar;
	
	public String novo(){
		this.destinoSalvar = "usuarioSucesso";
		this.usuario = new Usuario();
		this.usuario.setAtivo(true);
		return "usuario";
	}
	
	public String editar(){
		this.confirmarSenha = this.usuario.getSenha();
		return "/publico/usuario";
	}
	
	public String salvar(){
		FacesContext context = FacesContext.getCurrentInstance();

		String senha = this.usuario.getSenha();
		if(!senha.equals(this.confirmarSenha)){
			FacesMessage facesMessage = new FacesMessage("A senha não foi confirmada corretamente");
			context.addMessage(null, facesMessage);
			return null;
		}
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(this.usuario);
		return this.destinoSalvar;
	}
	public String efetuarLogin() {
		FacesContext context = FacesContext.getCurrentInstance();
		
		UsuarioRN usuarioRN = new UsuarioRN();
		Usuario usuarioConsulta = usuarioRN.buscarPorLogin(this.usuario.getLogin());
		String senha = this.usuario.getSenha();
		if(!senha.equals(usuarioConsulta.getSenha())){
			context.addMessage(null,
					new FacesMessage("Login ou Senha inválidos!"));
			System.out.println("Login ou Senha inválidos!");
			return "login";
		}
		System.out.println("Deveria retornar avaliação");
		return "avaliacao";
		
	}
	public String excluir() throws RNException{
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.excluir(this.usuario);
		this.lista = null;
		return null;
	}
	public String ativar(){
		if(this.usuario.isAtivo())
			this.usuario.setAtivo(false);
		else
			this.usuario.setAtivo(true);
		
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(this.usuario);
		return null;
	}
	public Usuario getUsuario(){return usuario;}
	public void setUsuario(Usuario usuario){this.usuario =  usuario;}
	public String getConfirmarSenha(){return confirmarSenha;}
	public void setConfirmarSenha(String confirmarSenha){this.confirmarSenha = confirmarSenha;}

	public String getDestinoSalvar() {
		return destinoSalvar;
	}

	public void setDestinoSalvar(String destinoSalvar) {
		this.destinoSalvar = destinoSalvar;
	}
	public List<Usuario> getLista() {
		if(this.lista == null){
			UsuarioRN usuarioRN = new UsuarioRN();
			this.lista = usuarioRN.listar();
		}
		return this.lista;
	}
}
