package br.com.padroes.bridge.ex1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class GeradorDeArquivoHTML implements GeradorDeArquivo {

	@Override
	public void gera(String conteudo) {
		try {
			PrintStream saida = new PrintStream("arquivoHTML.html");
			saida.println("<html>");
			saida.println("<h1>"+conteudo+"</h1>");
			saida.println("</html>");
			saida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
