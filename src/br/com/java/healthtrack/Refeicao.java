package br.com.java.healthtrack;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Refeicao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5158802022437620174L;
	
	//Atributos
	private String codigoRefeicao;
	private Date dataHora;
	private RefeicaoTipo tipo;
	private ArrayList<RefeicaoItem> itens;
	private int totalCalorias;
	private Usuario usuario;
	
	//Métodos
	public Refeicao() {
		
	}
	
	public Refeicao(Date dataHora, RefeicaoTipo tipo, ArrayList<RefeicaoItem> itens, Usuario usuario) {
		this.dataHora = dataHora;
		this.tipo = tipo;
		this.itens = itens;
		this.usuario = usuario;
		this.codigoRefeicao = UUID.randomUUID().toString();
		
		for(int i = 0; i < itens.size(); i++) {
			this.totalCalorias += itens.get(i).getCaloriaConsumida();
		}
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public RefeicaoTipo getTipo() {
		return tipo;
	}

	public void setTipo(RefeicaoTipo tipo) {
		this.tipo = tipo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ArrayList<RefeicaoItem> getItens() {
		return itens;
	}

	public void setItens(ArrayList<RefeicaoItem> itens) {
		this.itens = itens;
		
		for(int i = 0; i < itens.size(); i++) {
			this.totalCalorias += itens.get(i).getCaloriaConsumida();
		}
	}
	
	public void addRefeicaoItem(RefeicaoItem novoItem) {
		this.itens.add(novoItem);
		
		for(int i = 0; i < this.itens.size(); i++) {
			this.totalCalorias += this.itens.get(i).getCaloriaConsumida();
		}
	}

	public String getCodigoRefeicao() {
		return codigoRefeicao;
	}

	public int getTotalCalorias() {
		return totalCalorias;
	}
	
	
}
