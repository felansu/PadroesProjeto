package br.com.padroes.bridge.ex2;

public class BoletoSantander implements Boleto{
	private GeradorBoleto gerador;

	public BoletoSantander(GeradorBoleto gerador) {
		this.gerador = gerador;
	}

	@Override
	public void gerarBoleto() {
		this.gerador.geradorBoleto("Este é um boleto Santander");
	}

	public GeradorBoleto getGerador() {
		return gerador;
	}

	public void setGerador(GeradorBoleto gerador) {
		this.gerador = gerador;
	}
}