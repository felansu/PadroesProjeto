package br.com.padroes.builder.ex1;

public class MainGeradorArquivoFiscal {
	
	public static void main(String[] args) {
		GeradorDeArquivoFiscal gerador = new GeradorDeArquivoFiscal();
		gerador.gerarArquivo("Opa");
		
	}
}
