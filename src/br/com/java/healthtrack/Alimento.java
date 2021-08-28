package br.com.java.healthtrack;

import java.io.Serializable;
import java.util.UUID;

public class Alimento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8129749031547895038L;
	
	//Atributos
	private String codigoAlimento;
	private String nome;
	private String descricao;
	private int caloriaPorGrama;
	
	//Métodos
	public Alimento() {
		
	}
	
	public Alimento(String nome, String descricao, int caloriaPorGrama) {
		this.nome = nome;
		this.descricao = descricao;
		this.caloriaPorGrama = caloriaPorGrama;
		this.codigoAlimento = UUID.randomUUID().toString();
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

	public int getCaloriaPorGrama() {
		return caloriaPorGrama;
	}

	public void setCaloriaPorGrama(int caloriaPorGrama) {
		this.caloriaPorGrama = caloriaPorGrama;
	}

	public String getCodigoAlimento() {
		return codigoAlimento;
	}
	
	

}
