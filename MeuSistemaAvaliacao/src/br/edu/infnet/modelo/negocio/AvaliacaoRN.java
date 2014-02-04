package br.edu.infnet.modelo.negocio;

import br.edu.infnet.excecao.RNException;
import br.edu.infnet.modelo.dao.AvaliacaoDAO;
import br.edu.infnet.modelo.dao.DAOFactory;
import br.edu.infnet.pojo.Avaliacao;

public class AvaliacaoRN {

	private AvaliacaoDAO avaliacaoDAO;
	public AvaliacaoRN(){
		this.avaliacaoDAO = DAOFactory.criarAvaliacaoDAO();
	}
	public Avaliacao carregar(Integer codigo){
		return this.avaliacaoDAO.consultar(codigo);
	}
	public void excluir(Avaliacao avaliacao) throws RNException{
		avaliacaoDAO.excluir(avaliacao);
		
	}
	public void salvar(Avaliacao avaliacao) {
		Integer codigo = avaliacao.getCodigo();
		if(codigo == null || codigo == 0){
			this.avaliacaoDAO.incluir(avaliacao);
		}else{
			this.avaliacaoDAO.atualizar(avaliacao);
		}
	}

}
