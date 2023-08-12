package com.example.medications.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.medications.management.models.Medicament;

@Repository 
public interface MedicamentsRepository extends JpaRepository<Medicament, String>{

	@Query(value = "SELECT * FROM MEDICATION WHERE PRODUTO OR PRINCIPIO_ATIVO LIKE UPPER(:name)", nativeQuery = true)
	public List<Medicament> findByPincipioAtivoORProduto(@Param("name") String name);
	
	
	@Query(value="SELECT COUNT(*) FROM MEDICATION WHERE REGISTRO = :registro LIMIT 1", nativeQuery = true)
	public boolean existsInDatabase(String registro);
	
	@Query(value="SELECT * FROM MEDICATION WHERE REGISTRO = :registro LIMIT 1", nativeQuery = true)
	public Medicament findbyRegistro(String registro);
	
	
	@Query(value=
			"UPDATE MEDICATION SET "
			+ "PRODUTO = :medicament.produto,"
			+ "PRINCIPIO_ATIVO = :medicament.principioAtivo,"
			+ "LABORATORIO = :medicament.laboratorio,"
			+ "CLASSE_TERAPEUTICA = :medicament.classeTerapeutica,"
			+ "APRESENTACAO = :medicament.apresentacao,"
			+ "TARJA = :medicament.tarja,"
			+ "COMERCIALIZACAO_2022 = :medicament.comercializacao"
			+ "WHERE REGISTRO = :medicament.registro LIMIT 1" 
	, nativeQuery = true)
	public Medicament update(Medicament medicament);
	
}
