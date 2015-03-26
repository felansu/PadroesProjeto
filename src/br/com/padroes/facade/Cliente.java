package br.com.padroes.facade;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private Double limite;

	public Cliente(int id, String nome, String cpf, Double limite) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.limite = limite;
	}

	public Cliente() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public void validarLimiteCredito(int i) {
		System.out.println(i<limite?"está no limite correto":"opa, superou limite !");
	}

	
	
}