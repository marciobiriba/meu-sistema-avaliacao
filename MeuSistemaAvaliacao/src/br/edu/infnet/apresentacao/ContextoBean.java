package br.edu.infnet.apresentacao;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import br.edu.infnet.modelo.negocio.UsuarioRN;
import br.edu.infnet.pojo.Usuario;

@ManagedBean(name = "contextoBean")
@SessionScoped
public class ContextoBean {
	
	private Usuario usuarioLogado = null;
	
	public Usuario getUsuarioLogado(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext external = context.getExternalContext();
		String login = external.getRemoteUser();
		if(this.usuarioLogado == null || !login.equals(this.usuarioLogado.getLogin())){
			if(login!=null){
				UsuarioRN usuarioRN = new UsuarioRN();
				this.usuarioLogado = usuarioRN.buscarPorLogin(login);
			}
		}
		return usuarioLogado;
	}
	public void setUsuarioLogado(Usuario usuario){
		this.usuarioLogado = usuario;
	}
}
