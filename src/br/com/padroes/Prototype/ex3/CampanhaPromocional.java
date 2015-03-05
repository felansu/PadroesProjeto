package br.com.padroes.Prototype.ex3;

public class CampanhaPromocional implements Prototype<CampanhaPromocional>{
	String empresa;
	String chamada;
	String produto;
	Double valor;

	public CampanhaPromocional() {
		this.empresa = "";
		this.chamada = "";
		this.produto = "";
		this.valor = 0.0;
	}

	public CampanhaPromocional(String empresa, String chamada, String produto,
			Double valor) {
		this.empresa = empresa;
		this.chamada = chamada;
		this.produto = produto;
		this.valor = valor;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getChamada() {
		return chamada;
	}

	public void setChamada(String chamada) {
		this.chamada = chamada;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "CampanhaPromocional [empresa=" + empresa + ", chamada="
				+ chamada + ", produto=" + produto + ", valor=" + valor + "]";
	}

	@Override
	public CampanhaPromocional clonar() {
		return new CampanhaPromocional(getEmpresa(), getChamada(), "", 0.0);
	}
}
