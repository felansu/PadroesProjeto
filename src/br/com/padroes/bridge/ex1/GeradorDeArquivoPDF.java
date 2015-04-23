package br.com.padroes.bridge.ex1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class GeradorDeArquivoPDF implements GeradorDeArquivo{

	@Override
	public void gera(String conteudo) {
		try {
			PrintStream saida = new PrintStream("arquivoPDF.pdf ");
			saida.println("Gerando arquivo PDF");
			saida.println("Conteudo: " + conteudo);
			saida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
