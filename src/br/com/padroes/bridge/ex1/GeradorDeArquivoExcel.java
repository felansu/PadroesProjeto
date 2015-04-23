package br.com.padroes.bridge.ex1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class GeradorDeArquivoExcel implements GeradorDeArquivo{

	@Override
	public void gera(String conteudo) {
		try {
			PrintStream saida = new PrintStream("arquivoExcel.xls ");
			saida.println("Gerando arquivo EXCEL");
			saida.println("Conteudo: " + conteudo);
			saida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
