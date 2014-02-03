package br.edu.infnet.apresentacao;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.infnet.modelo.negocio.UsuarioRN;
import br.edu.infnet.pojo.Usuario;

@ManagedBean(name="usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario usuario = new Usuario();
	private String confirmarSenha;
	
	public String novo(){
		this.usuario = new Usuario();
		this.usuario.setAtivo(true);
		return "usuario";
	}

	public String salvar(){
		FacesContext context = FacesContext.getCurrentInstance();

		String senha = this.usuario.getSenha();
		if(!senha.equals(this.confirmarSenha)){
			FacesMessage facesMessage = new FacesMessage("A senha n�o foi confirmada corretamente");
			context.addMessage(null, facesMessage);
			return null;
		}
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(this.usuario);
		return "usuarioSucesso";
	}
	public String efetuarLogin() {
		FacesContext context = FacesContext.getCurrentInstance();
		
		UsuarioRN usuarioRN = new UsuarioRN();
		Usuario usuarioConsulta = usuarioRN.buscarPorLogin(this.usuario.getLogin());
		String senha = this.usuario.getSenha();
		if(!senha.equals(usuarioConsulta.getSenha())){
			context.addMessage(null,
					new FacesMessage("Login ou Senha inv�lidos!"));
			System.out.println("Login ou Senha inv�lidos!");
			return "login";
		}
		System.out.println("Deveria retornar avalia��o");
		return "avaliacao";
		
	}
	public Usuario getUsuario(){return usuario;}
	public void setUsuario(Usuario usuario){this.usuario =  usuario;}
	public String getConfirmarSenha(){return confirmarSenha;}
	public void setConfirmarSenha(String confirmarSenha){this.confirmarSenha = confirmarSenha;}
}
