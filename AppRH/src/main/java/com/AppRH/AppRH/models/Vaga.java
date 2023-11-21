package com.AppRH.AppRH.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//4 video
@Entity
public class Vaga {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//gerá id automático
	private long codigo;
	
	
	private String nome;
	
	private String descricao;
	
	private String data;
	
	private String salario;
	
	//Quando deletar uma vaga, também deleta um candidato
	@OneToMany(mappedBy = "vaga", cascade = CascadeType.REMOVE)
	private List<Candidato> candidatos;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
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

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	
	
	//fiquei aula06
	

}
