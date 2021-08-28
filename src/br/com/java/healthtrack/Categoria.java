package br.com.java.healthtrack;

import java.io.Serializable;
import java.util.UUID;

public class Categoria implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9176391864893477631L;
	
	//Atributos
	private String codigoCategoria;
	private String nome;
	private String descricao;
	private int caloriaHora;
	
	
	//Métodos
	public Categoria() {
		
	}
	
	public Categoria(String nome, String descricao, int caloriaHora) {
		this.nome = nome;
		this.descricao = descricao;
		this.caloriaHora = caloriaHora;
		this.codigoCategoria = UUID.randomUUID().toString();
	}

	public String getCodigoCategoria() {
		return codigoCategoria;
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

	public int getCaloriaHora() {
		return caloriaHora;
	}

	public void setCaloriaHora(int caloriaHora) {
		this.caloriaHora = caloriaHora;
	}
	
	
	

}
