package br.com.padroes.Singleton.ex2;

public class ConfiguracaoEmpresa {
	private String codigo;
	private String nome;
	private String moeda;
	private int qtdeCasasDecimais;
	
	public static ConfiguracaoEmpresa instance;

	public ConfiguracaoEmpresa() {
		this.codigo = "001";
		this.nome = "FerranSoft";
		this.moeda = "€";
		this.qtdeCasasDecimais = 2;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public int getQtdeCasasDecimais() {
		return qtdeCasasDecimais;
	}

	public void setQtdeCasasDecimais(int qtdeCasasDecimais) {
		this.qtdeCasasDecimais = qtdeCasasDecimais;
	}

	public ConfiguracaoEmpresa getInstance() {
		if (ConfiguracaoEmpresa.instance==null) {
			ConfiguracaoEmpresa.instance = new ConfiguracaoEmpresa();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "ConfiguracaoEmpresa [codigo=" + codigo + ", nome=" + nome
				+ ", moeda=" + moeda + ", qtdeCasasDecimais="
				+ qtdeCasasDecimais + "]";
	}

}
