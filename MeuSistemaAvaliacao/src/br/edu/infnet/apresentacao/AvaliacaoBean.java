package br.edu.infnet.apresentacao;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RateEvent;

import br.edu.infnet.modelo.negocio.AvaliacaoRN;
import br.edu.infnet.pojo.Avaliacao;

@ManagedBean(name="ratingController")
@RequestScoped
public class AvaliacaoBean implements Serializable{  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Avaliacao avaliacao = new Avaliacao();

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public void onrate(RateEvent rateEvent) {  
		String mensagem = new String();
		switch (((Integer) rateEvent.getRating()).intValue()) {
        case 0:
        	mensagem = "Prefiro não opinar";
            break;
                
        case 1:
            mensagem = "Discordo totalmente";
            break;
        
        case 2:
        	mensagem = "Discordo";
            break;
        case 3:
        	mensagem = "Nem discordo nem concordo";
            break;
        case 4:
        	mensagem = "Concordo";
            break;
        case 5:
        	mensagem = "Concordo Totalmente";
            break;
    }
		  
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sistema Avaliação", mensagem);
		FacesContext.getCurrentInstance().addMessage(null, message);  
	}  

	public void oncancel() {  
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sistema Avaliação", "Prefiro não opinar");  
		FacesContext.getCurrentInstance().addMessage(null, message);  
	}  
	public String salvar(){

		AvaliacaoRN avaliacaoRN = new AvaliacaoRN();
		avaliacaoRN.salvar(this.avaliacao);
		return "avaliacaoSucesso";
	}
}
