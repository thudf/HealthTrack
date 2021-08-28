package br.com.java.healthtrack;

import java.io.Serializable;
import java.util.UUID;
import java.util.Date;

public class Atividade implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1056674751738607592L;
	
	//Atributos
	private String codigoAtividade;
	private Date data;
	private int tempoAtividade;
	private Usuario usuario;
	private Categoria categoria;
	private int caloriaGasta;
	
	//Métodos
	public Atividade() {
		
	}
	
	public Atividade(Date data, int tempoAtividade, Usuario usuario, Categoria categoria) {
		this.data = data;
		this.tempoAtividade = tempoAtividade;
		this.usuario = usuario;
		this.categoria = categoria;
		this.caloriaGasta = tempoAtividade * categoria.getCaloriaHora();
		this.codigoAtividade = UUID.randomUUID().toString();
		
	}

	public String getCodigoAtividade() {
		return codigoAtividade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getTempoAtividade() {
		return tempoAtividade;
	}

	public void setTempoAtividade(int tempoAtividade) {
		this.tempoAtividade = tempoAtividade;
		this.caloriaGasta = tempoAtividade * this.categoria.getCaloriaHora();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
		this.caloriaGasta = this.tempoAtividade * categoria.getCaloriaHora();
	}

	public int getCaloriaGasta() {
		return caloriaGasta;
	}
	
	

}
