package br.edu.java.springbootweb.regras;

import java.util.List;

import br.edu.java.springbootweb.model.Empresa;

public interface EmpresaRegra {

	void salvar(Empresa empresa);

	void deletar(Empresa empresa);

	List<Empresa> listar();

	List<Empresa> listarPorNome(String nome);

	List<Empresa> listarPorCNPJ(String cnpj);
	
	Empresa buscarPorCodigo(Long codigo);
	
	List<Empresa> dadosGrid();
}
