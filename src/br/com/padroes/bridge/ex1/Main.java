package br.com.padroes.bridge.ex1;

public class Main {
	public static void main(String[] args) {
		Relatorio rel = new Relatorio(new GeradorDeArquivoHTML());
		rel.gerarArquivo();
		
		rel = new Relatorio(new GeradorDeArquivoTXT());
		rel.gerarArquivo();
		
		Recibo rec = new Recibo(new GeradorDeArquivoHTML());
		rec.gerarArquivo();
		
		rec = new Recibo(new GeradorDeArquivoTXT());
		rec.gerarArquivo();
		
		rec = new Recibo(new GeradorDeArquivoExcel());
		rec.gerarArquivo();
		
		rec = new Recibo(new GeradorDeArquivoPDF());
		rec.gerarArquivo();
		
		rec = new Recibo(new GeradorDeArquivoDOC());
		rec.gerarArquivo();
	}
}
