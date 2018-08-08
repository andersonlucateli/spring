package br.edu.java.springbootweb.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.java.springbootweb.model.Endereco;
import br.edu.java.springbootweb.model.Empresa;
import br.edu.java.springbootweb.regras.EmpresaRegra;
import br.edu.java.springbootweb.repository.CidadeRepository;
import br.edu.java.springbootweb.repository.EnderecoRepository;

@Controller
@RequestMapping("/empresa")
public class PessoaController {

	@Autowired
	private EmpresaRegra empresaRegra;

	@Autowired
	private CidadeRepository cidaderepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@PostMapping("/salvar")
	public String salvar(@Valid Empresa empresa, BindingResult erros) {
		if (erros.hasErrors()) {
			return "empresa/novo";
		}

		enderecoRepository.save(empresa.getEndereco());
		empresaRegra.salvar(empresa);
		return "redirect:/empresa/listar";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid Empresa empresa, BindingResult erros) {
		if (erros.hasErrors()) {
			return "empresa/visualizar";
		}
		enderecoRepository.save(empresa.getEndereco());
		empresaRegra.salvar(empresa);
		return "redirect:/empresa/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("empresas", empresaRegra.dadosGrid());
		return "empresa/lista";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("cidades", cidaderepository.findAll());
		return "empresa/novo";
	}

	@GetMapping("/deletar/{codigo}/{cod_end}")
	public String deletar(@PathVariable("codigo") Long codigo, @PathVariable("cod_end") Long cod_end) {
		empresaRegra.deletar(new Empresa(codigo));
		enderecoRepository.delete(new Endereco(cod_end));
		return "redirect:/empresa/listar";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		Empresa p = empresaRegra.buscarPorCodigo(codigo);
		model.addAttribute("empresa", p);
		model.addAttribute("cidades", cidaderepository.findAll());
		return "empresa/visualizar";
	}

	@GetMapping("/empresa/cnpj/{cnpj}")
	@ResponseBody
	public List<Empresa> listarCnpj(@PathVariable("cnpj") String cnpj) {
		return empresaRegra.listarPorCNPJ(cnpj);
	}

	@GetMapping("/empresa/nome/{nome}")
	@ResponseBody
	public List<Empresa> listarNome(@PathVariable("nome") String nome) {
		return empresaRegra.listarPorNome(nome);
	}
}
