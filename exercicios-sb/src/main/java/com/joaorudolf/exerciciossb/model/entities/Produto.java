package com.joaorudolf.exerciciossb.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idddd;

	private String nome;

//	@Min(value = 0)
	private double preco; // preço > 0

//	@Min(value = 0)
//	@Max(value = 1)
	private double desconto; // 0 e 1 (0 e 100%)

	public Produto() {
 
	}

	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

//	public Produto(String nome) {
//		super();
//		this.nome = nome;
//	}

	public int getId() {
		return idddd;
	}

	public void setId(int id) {
		this.idddd = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}