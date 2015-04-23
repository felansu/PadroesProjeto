package br.com.padroes.bridge.ex1;

public class Relatorio implements Documento{

	private GeradorDeArquivo gerador;
	
	public Relatorio(GeradorDeArquivo gerador) {
		this.gerador = gerador;
	}

	@Override
	public void gerarArquivo() {
		this.gerador.gera("Eita, este é um relatório");
	}

	public GeradorDeArquivo getGerador() {
		return gerador;
	}

	public void setGerador(GeradorDeArquivo gerador) {
		this.gerador = gerador;
	}
}