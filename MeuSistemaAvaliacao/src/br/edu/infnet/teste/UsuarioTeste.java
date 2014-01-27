package br.edu.infnet.teste;

import br.edu.infnet.modelo.dao.UsuarioDAO;
import br.edu.infnet.pojo.Usuario;


public class UsuarioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UsuarioTeste().incluirUsuario();
	}

	public void incluirUsuario() {
		System.out.println( this.getClass() + "Inicio");

		try {
			UsuarioDAO dao = new UsuarioDAO();
			Usuario usuario = new Usuario("francisco","1234","Francisco Junior");
			dao.incluir(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println( this.getClass() + "Fim");
	}
}
