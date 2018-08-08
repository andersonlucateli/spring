package br.edu.java.springbootweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.br.CNPJ;

@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column(length = 150, nullable = false)
	@NotEmpty(message = "Nome deve ser preenchido")
	private String nome;

	@Column(length = 20)
	@CNPJ
	private String cnpj;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cod_cidade")
	private Cidade cidade;

	@OneToOne
	@JoinColumn(name = "cod_endereco")
	private Endereco endereco;

	public Empresa() {

	}

	public Empresa(Long codigo) {
		this.codigo = codigo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
