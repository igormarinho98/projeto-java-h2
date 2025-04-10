package com.javaent.dao;

 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.javaent.database.Database;
import com.javaent.model.Usuario;

public class UsuarioDAO {

	public void criarTabela() {
		try {
			Connection conn = Database.conectar();
			Statement stmt = conn.createStatement();

			String sql = "CREATE TABLE IF NOT EXISTS usuario (" +
		             "id INT AUTO_INCREMENT PRIMARY KEY, " +
		             "nome VARCHAR(100), " +
		             "email VARCHAR(100), " +
		             "profissao VARCHAR(100)" +
		             ");";
			stmt.execute(sql);

			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void inserirUsuario(Usuario usuario) {
		try {
			Connection conn = Database.conectar();

			String sql = "INSERT INTO usuario (nome, email, profissao) VALUES (?, ?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);

			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getProfissao());
			stmt.executeUpdate();

			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("Erro ao inserir usuário");
		}
	}

	public void listarUsuarios() {
		try {
			Connection conn = Database.conectar();
			Statement stmt = conn.createStatement();

			String sql = "SELECT * FROM usuario";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				String profissao = rs.getString("profissao");

				System.out.println(id + " | " + nome + " | " + email + " | " + profissao);
			}

			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
