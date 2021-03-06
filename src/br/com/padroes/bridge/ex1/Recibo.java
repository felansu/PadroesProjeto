package br.com.padroes.bridge.ex1;

public class Recibo implements Documento{

	private GeradorDeArquivo gerador;
	
	public Recibo(GeradorDeArquivo gerador) {
		this.gerador = gerador;
	}


	@Override
	public void gerarArquivo() {
		this.gerador.gera("Gerando recibo !");
	}


	public GeradorDeArquivo getGerador() {
		return gerador;
	}


	public void setGerador(GeradorDeArquivo gerador) {
		this.gerador = gerador;
	}
}