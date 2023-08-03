package com.example.medications.management.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

 
@Entity(name = "MEDICATION")
public class Medicament {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "REGISTRO")
	@JsonProperty(value = "REGISTRO")
	private String registro;
	
	@Column(name = "PRODUTO")
	@JsonProperty(value = "PRODUTO")
	private String produto;
	
	@Column(name = "PRINCIPIO_ATIVO")
	@JsonProperty(value= "PRINCIPIO_ATIVO")
	private String principioAtivo;

	@Column(name = "LABORATORIO")
	@JsonProperty(value = "LABORATORIO")
	private String laboratorio;
	
	@Column(name = "APRESENTACAO")
	@JsonProperty(value = "APRESENTACAO")
	private String apresentacao;
	
	@Column(name = "CLASSE_TERAPEUTICA")
	@JsonProperty(value = "CLASSE_TERAPEUTICA")
	private String classeTerapeutica;
	
	@Column(name = "COMERCIALIZACAO_2022")
	@JsonProperty(value = "COMERCIALIZACAO_2022")
	private String comercializacao;
	
	@Column(name = "TARJA")
	@JsonProperty(value = "TARJA") 
	private String tarja;

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getPrincipioAtivo() {
		return principioAtivo;
	}

	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getApresentacao() {
		return apresentacao;
	}

	public void setApresentacao(String apresentacao) {
		this.apresentacao = apresentacao;
	}

	public String getClasseTerapeutica() {
		return classeTerapeutica;
	}

	public void setClasseTerapeutica(String classeTerapeutica) {
		this.classeTerapeutica = classeTerapeutica;
	}

	public String getComercializacao() {
		return comercializacao;
	}

	public void setComercializacao(String comercializacao) {
		this.comercializacao = comercializacao;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
}
