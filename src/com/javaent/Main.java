package com.javaent;

import com.javaent.dao.UsuarioDAO;
import com.javaent.model.Usuario;

public class Main {
	
	public static void main(String[] args) {

		System.out.println("Configuração inicial de ambiente");
		
		 UsuarioDAO dao = new UsuarioDAO();

	        dao.criarTabela();

	        Usuario u = new Usuario(0, "Igor Marinho", "igor@email.com", "PedreiroDigital");
	        dao.inserirUsuario(u);

	        dao.listarUsuarios();
	}
}
