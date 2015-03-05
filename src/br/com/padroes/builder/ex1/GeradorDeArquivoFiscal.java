package br.com.padroes.builder.ex1;

public class GeradorDeArquivoFiscal implements IArquivoFiscal{

	@Override
	public void gerarArquivo(String texto) {
		System.out.println(texto);
	}
	
}
