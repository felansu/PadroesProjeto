package br.com.padroes.Prototype.ex2;

public class Carro implements Prototype<Carro> {

	private String nome;
	private String fabricante;
	private String chassi;

	public Carro() {
		this.nome = "";
		this.fabricante = "";
		this.chassi = "";
	}

	public Carro(String nome, String fabricante, String chassi) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.chassi = chassi;
	}

	@Override
	public Carro clonarObjeto() {
		return new Carro(getNome(), getFabricante(), "");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", fabricante=" + fabricante
				+ ", chassi=" + chassi + "]";
	}
}
