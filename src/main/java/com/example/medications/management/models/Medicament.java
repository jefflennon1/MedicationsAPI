package com.example.medications.management.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "MEDICATION")
public class Medicament {
	
	

	public Medicament() {
		super();
	}

	@Id
	@Column(name = "REGISTRO")
	private Long REGISTRO;
	
	@Column(name = "PRODUTO")
	private String PRODUTO;
	
	@Column(name = "PRINCIPIO_ATIVO")
	private String PRINCIPIO_ATIVO;

	@Column(name = "LABORATORIO")
	private String LABORATORIO;
	
	@Column(name = "APRESENTACAO")
	private String APRESENTACAO;
	
	@Column(name = "CLASSE_TERAPEUTICA")
	private String CLASSE_TERAPEUTICA;
	
	@Column(name = "COMERCIALIZACAO_2022")
	private String COMERCIALIZACAO;
	
	@Column(name = "TARJA")
	private String TARJA;

	
	
	
	public Long getREGISTRO() {
		return REGISTRO;
	}

	public void setREGISTRO(Long rEGISTRO) {
		REGISTRO = rEGISTRO;
	}

	public String getPRODUTO() {
		return PRODUTO;
	}

	public void setPRODUTO(String pRODUTO) {
		PRODUTO = pRODUTO;
	}

	public String getPRINCIPIO_ATIVO() {
		return PRINCIPIO_ATIVO;
	}

	public void setPRINCIPIO_ATIVO(String pRINCIPIO_ATIVO) {
		PRINCIPIO_ATIVO = pRINCIPIO_ATIVO;
	}

	public String getLABORATORIO() {
		return LABORATORIO;
	}

	public void setLABORATORIO(String lABORATORIO) {
		LABORATORIO = lABORATORIO;
	}

	public String getAPRESENTACAO() {
		return APRESENTACAO;
	}

	public void setAPRESENTACAO(String aPRESENTACAO) {
		APRESENTACAO = aPRESENTACAO;
	}

	public String getCLASSE_TERAPEUTICA() {
		return CLASSE_TERAPEUTICA;
	}

	public void setCLASSE_TERAPEUTICA(String cLASSE_TERAPEUTICA) {
		CLASSE_TERAPEUTICA = cLASSE_TERAPEUTICA;
	}

	public String getCOMERCIALIZACAO() {
		return COMERCIALIZACAO;
	}

	public void setCOMERCIALIZACAO(String cOMERCIALIZACAO) {
		COMERCIALIZACAO = cOMERCIALIZACAO;
	}

	public String getTARJA() {
		return TARJA;
	}

	public void setTARJA(String tARJA) {
		TARJA = tARJA;
	}

	
}
