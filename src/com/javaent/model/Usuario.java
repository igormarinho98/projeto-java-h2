package com.javaent.model;

public class Usuario {
	private int id;
	private String nome;
	private String email;
	private String profissao;
	
	
	
	public Usuario(int id, String nome, String email, String profissao) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.profissao = profissao;
	}
	
	
	

	public int getId() { return id; }
	    public void setId(int id) { this.id = id; }

	    public String getNome() { 
	    	
	    	return nome; 
	    	
	    }
	    public void setNome(String nome) { 
	    	
	    	this.nome = nome; 
	    	
	    }

	    public String getEmail() { 
	    	
	    	return email;
	    	
	    }
	    public void setEmail(String email) { 
	    	
	    	this.email = email; 
	    	} 
	
	
	    public String getProfissao() {		
	    	
	    	return profissao; 
	    	
	    }


		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}

}