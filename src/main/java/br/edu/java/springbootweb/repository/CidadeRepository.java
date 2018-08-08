package br.edu.java.springbootweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.java.springbootweb.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	
}
