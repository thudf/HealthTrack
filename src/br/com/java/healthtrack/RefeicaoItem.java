package br.com.java.healthtrack;

import java.io.Serializable;
import java.util.UUID;

public class RefeicaoItem implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9088823913792016261L;
	
	//Atributos
	private String codigoRefeicaoItem;
	private Alimento alimento;
	private int quantidadeConsumida;
	private int caloriaConsumida;
	
	//Métodos
	public RefeicaoItem() {
		
	}
	
	public RefeicaoItem(Alimento alimento, int quantidadeConsumida) {
		this.alimento = alimento;
		this.quantidadeConsumida = quantidadeConsumida;
		this.caloriaConsumida = alimento.getCaloriaPorGrama() * quantidadeConsumida;
		this.codigoRefeicaoItem = UUID.randomUUID().toString();
	}

	public Alimento getAlimento() {
		return alimento;
	}

	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
		this.caloriaConsumida = this.quantidadeConsumida * alimento.getCaloriaPorGrama();
	}

	public int getQuantidadeConsumida() {
		return quantidadeConsumida;
	}

	public void setQuantidadeConsumida(int quantidadeConsumida) {
		this.quantidadeConsumida = quantidadeConsumida;
		this.caloriaConsumida = this.alimento.getCaloriaPorGrama() * quantidadeConsumida;
	}

	public String getCodigoRefeicaoItem() {
		return codigoRefeicaoItem;
	}

	public int getCaloriaConsumida() {
		return caloriaConsumida;
	}

}
