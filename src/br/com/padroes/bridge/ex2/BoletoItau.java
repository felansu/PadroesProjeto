package br.com.padroes.bridge.ex2;

public class BoletoItau implements Boleto {
	private GeradorBoleto gerador;

	public BoletoItau(GeradorBoleto gerador) {
		this.gerador = gerador;
	}

	@Override
	public void gerarBoleto() {
		this.gerador.geradorBoleto("Este é um boleto itau");
	}

	public GeradorBoleto getGerador() {
		return gerador;
	}

	public void setGerador(GeradorBoleto gerador) {
		this.gerador = gerador;
	}
}