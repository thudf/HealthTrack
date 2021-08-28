package br.com.java.healthtrack;

import java.io.Serializable;
import java.util.UUID;

public class RefeicaoTipo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5728122106113197541L;
	
	//Atributos
	private String codigoRefeicaoTipo;
	private String nome;
	private String descricao;
	
	//Métodos
	public RefeicaoTipo() {
		
	}
	
	public RefeicaoTipo(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.codigoRefeicaoTipo = UUID.randomUUID().toString();
	}

	public String getCodigoRefeicaoTipo() {
		return codigoRefeicaoTipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
