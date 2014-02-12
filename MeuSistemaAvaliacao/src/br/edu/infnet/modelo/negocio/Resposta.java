package br.edu.infnet.modelo.negocio;

public enum Resposta {
	CT("Concordo Totalmente"), 
	C("Concordo"), 
	NCND("I"), 
	D("Discordo"),
	DT("Discordo Totalmente");
	 
	private String resposta;
 
	private Resposta(String s) {
		resposta = s;
	}
 
	public String getStatusCode() {
		return resposta;
	}
 
}
