package br.edu.java.springbootweb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.java.springbootweb.model.Cidade;
import br.edu.java.springbootweb.repository.CidadeRepository;

@Controller
@RequestMapping("/cidade")
public class CidadeController {
	
	@Autowired
	CidadeRepository cidadeRepository;

	@GetMapping("/lista")
	public String listar(Model model) {
		 model.addAttribute("cidades", cidadeRepository.findAll());
		return "cidade/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(@Valid Cidade cidade, BindingResult erros) {
		if (erros.hasErrors()) {
			return "cidade/novo";
		}
		cidadeRepository.save(cidade);
		return "redirect:/cidade/lista";
	}
	
	@GetMapping("/novo")
	public String novo(Model model) {
		return "cidade/novo";
	}
}
