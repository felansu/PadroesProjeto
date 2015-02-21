package padroes.builder.ex3GeradorArquivosFiscais;

public class Main {
	public static void main(String[] args) {
		
		ArquivoFiscal arquivoFiscal = new GeradorArquivoFiscal(
				new ArquivoFiscalTXTBuilder()).gerarArquivoFiscal();
		System.out.println(arquivoFiscal);
		
		arquivoFiscal = new GeradorArquivoFiscal(
				new ArquivoFiscalXMLBuilder()).gerarArquivoFiscal();
		System.out.println(arquivoFiscal);
		
		
	}
}
