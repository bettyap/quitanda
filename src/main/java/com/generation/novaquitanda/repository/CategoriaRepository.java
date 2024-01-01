package com.generation.novaquitanda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.novaquitanda.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
	
}
