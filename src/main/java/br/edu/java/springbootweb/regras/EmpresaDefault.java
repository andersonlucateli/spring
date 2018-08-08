package br.edu.java.springbootweb.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.java.springbootweb.model.Empresa;
import br.edu.java.springbootweb.repository.EmpresaRepository;

@Service
public class EmpresaDefault implements EmpresaRegra {

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public void salvar(Empresa empresa) {
		empresaRepository.save(empresa);
	}
	
	@Override
	public void deletar(Empresa empresa) {
		empresaRepository.delete(empresa);
	}

	@Override
	public List<Empresa> listar() {
		return empresaRepository.findAll();
	}
	
	@Override
	public List<Empresa> listarPorCNPJ(String cnpj){
		return empresaRepository.porCnpj(cnpj);
	}
	
	@Override
	public List<Empresa> listarPorNome(String nome){
		return empresaRepository.findByNomeLike("%" + nome + "%");
	}

	@Override
	public Empresa buscarPorCodigo(Long codigo) {
		return empresaRepository.findById(codigo).orElse(new Empresa());
	}
	
	@Override
	public List<Empresa> dadosGrid(){
		return empresaRepository.dadosGrid();
	}
}
