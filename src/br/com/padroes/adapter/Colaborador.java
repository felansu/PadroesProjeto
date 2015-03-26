package br.com.padroes.adapter;

public class Colaborador {

	private String nome;
	private String matricula;

	public Colaborador(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public Colaborador() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}