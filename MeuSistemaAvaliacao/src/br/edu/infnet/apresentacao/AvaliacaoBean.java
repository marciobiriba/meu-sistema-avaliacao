package br.edu.infnet.apresentacao;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RateEvent;

import br.edu.infnet.modelo.negocio.AvaliacaoRN;
import br.edu.infnet.modelo.negocio.UsuarioRN;
import br.edu.infnet.pojo.Avaliacao;

@ManagedBean(name="ratingController")
@SessionScoped
public class AvaliacaoBean implements Serializable{  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer rating1;
	private Integer rating2;
	private Integer rating3;
	private Integer rating4;
	private Integer rating5;
	private Integer rating6;
	private Integer rating7;
	private Integer rating8;
	private Integer rating9;
	private Integer rating10;
	private Integer rating11;
	private Integer rating12;
	private Integer rating13;
	private Integer rating14;
	private Integer rating15;
	private Integer rating16;
	private Integer rating17;
	private String cometario;
	private Avaliacao avaliacao = new Avaliacao();
    public void onrate(RateEvent rateEvent) {  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sistema Avaliação", "Você avaliou como:" + ((Integer) rateEvent.getRating()).intValue());  
  
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }  
      
    public void oncancel() {  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sistema Avaliação", "Melhor não opinar");  
  
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }  
      
    public Integer getRating1() {  
        return rating1;  
    }  
  
    public void setRating1(Integer rating1) {  
        this.rating1 = rating1;  
    }  
  
    public Integer getRating2() {  
        return rating2;  
    }  
  
    public void setRating2(Integer rating2) {  
        this.rating2 = rating2;  
    }  
  
    public Integer getRating3() {  
        return rating3;  
    }  
  
    public void setRating3(Integer rating3) {  
        this.rating3 = rating3;  
    }  
  
    public Integer getRating4() {  
        return rating4;  
    }  
  
    public void setRating4(Integer rating4) {  
        this.rating4 = rating4;  
    }

	public Integer getRating5() {
		return rating5;
	}

	public void setRating5(Integer rating5) {
		this.rating5 = rating5;
	}

	public Integer getRating6() {
		return rating6;
	}

	public void setRating6(Integer rating6) {
		this.rating6 = rating6;
	}

	public Integer getRating7() {
		return rating7;
	}

	public void setRating7(Integer rating7) {
		this.rating7 = rating7;
	}

	public Integer getRating8() {
		return rating8;
	}

	public void setRating8(Integer rating8) {
		this.rating8 = rating8;
	}

	public Integer getRating9() {
		return rating9;
	}

	public void setRating9(Integer rating9) {
		this.rating9 = rating9;
	}

	public Integer getRating10() {
		return rating10;
	}

	public void setRating10(Integer rating10) {
		this.rating10 = rating10;
	}

	public Integer getRating11() {
		return rating11;
	}

	public void setRating11(Integer rating11) {
		this.rating11 = rating11;
	}

	public Integer getRating12() {
		return rating12;
	}

	public void setRating12(Integer rating12) {
		this.rating12 = rating12;
	}

	public Integer getRating13() {
		return rating13;
	}

	public void setRating13(Integer rating13) {
		this.rating13 = rating13;
	}

	public Integer getRating14() {
		return rating14;
	}

	public void setRating14(Integer rating14) {
		this.rating14 = rating14;
	}

	public Integer getRating15() {
		return rating15;
	}

	public void setRating15(Integer rating15) {
		this.rating15 = rating15;
	}

	public Integer getRating16() {
		return rating16;
	}

	public void setRating16(Integer rating16) {
		this.rating16 = rating16;
	}

	public Integer getRating17() {
		return rating17;
	}

	public void setRating17(Integer rating17) {
		this.rating17 = rating17;
	}

	public String getCometario() {
		return cometario;
	}

	public void setCometario(String cometario) {
		this.cometario = cometario;
	}
	public String salvar(){
		
		AvaliacaoRN avaliacaoRN = new AvaliacaoRN();
		avaliacaoRN.salvar(this.avaliacao);
		return "avaliacaoSucesso";
	}
}
