package br.edu.java.springbootweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.java.springbootweb.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	
	
}
