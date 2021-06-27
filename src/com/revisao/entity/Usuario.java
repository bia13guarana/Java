package com.revisao.entity;

public class Usuario {
	
	private int id;
	private String nome;
	private boolean tpSexo;
	
	
	public Usuario(int id, String nome, boolean tpSexo) {
		this.id = id;
		this.nome = nome;
		this.tpSexo = tpSexo;
	}


	public int getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public boolean isTpSexo() {
		return tpSexo;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", tpSexo=" + tpSexo + "]";
	}


	
	
}
