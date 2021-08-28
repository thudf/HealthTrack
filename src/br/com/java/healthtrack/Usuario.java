package br.com.java.healthtrack;

import java.io.Serializable;
import java.util.UUID;

public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3699283210320308031L;
	
	//Atributos
	private String codigoUsuario;
	private String nome;
	private String dataNascimento;
	private String cpf;
	private String rg;
	private String email;
	private String senha;
	private String avatar;
	private boolean ativo;
	
	//Métodos
	public Usuario() {
		
	}
	
	public Usuario(String nome, String dataNascimento, String cpf, String rg, String email, String senha, String avatar) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
		this.senha = senha;
		this.avatar = avatar;
		this.ativo = true;
		this.codigoUsuario = UUID.randomUUID().toString();
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public String getStatus() {
		if(this.ativo == true) {
			return "Ativo";
		} else {
			return "Inativo";
		}
	}

}
