package br.edu.java.springbootweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.edu.java.springbootweb.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	
	List<Empresa> findByNomeLike(String nome);
	
	@Query("select e from Empresa e where e.cnpj = :cnpj")
	List<Empresa> porCnpj(@Param("cnpj") String cnpj);
	
	@Query("select e from Empresa e left join fetch e.cidade")
	List<Empresa> dadosGrid();
}
