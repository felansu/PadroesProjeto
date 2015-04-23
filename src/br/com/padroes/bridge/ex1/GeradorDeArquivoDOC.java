package br.com.padroes.bridge.ex1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class GeradorDeArquivoDOC implements GeradorDeArquivo{

	@Override
	public void gera(String conteudo) {
		try {
			PrintStream saida = new PrintStream("arquivoDOC.doc");
			saida.println("Gerando arquivo DOC");
			saida.println("Conteudo: " + conteudo);
			saida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
