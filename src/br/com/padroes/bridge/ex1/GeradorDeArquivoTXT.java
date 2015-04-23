package br.com.padroes.bridge.ex1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class GeradorDeArquivoTXT implements GeradorDeArquivo {

	@Override
	public void gera(String conteudo) {
		try {
			PrintStream saida = new PrintStream("arquivoTXT.txt ");
			saida.println("Gerando arquivo TXT");
			saida.println("Conteudo: " + conteudo);
			saida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
