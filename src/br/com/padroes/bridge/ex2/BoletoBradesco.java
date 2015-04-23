package br.com.padroes.bridge.ex2;

public class BoletoBradesco implements Boleto{
	private GeradorBoleto gerador;

	public BoletoBradesco(GeradorBoleto gerador) {
		this.gerador = gerador;
	}

	@Override
	public void gerarBoleto() {
		this.gerador.geradorBoleto("Este é um boleto Bradesco");
	}

	public GeradorBoleto getGerador() {
		return gerador;
	}

	public void setGerador(GeradorBoleto gerador) {
		this.gerador = gerador;
	}
}