package padroes.builder.ex4GeradorImagens;

public class Main {
	public static void main(String[] args) {
		GeradorImagem gerador = new GeradorImagem(new ImagemJPGBuilder());
		System.out.println(gerador.gerarImagem());
		
		gerador = new GeradorImagem(new ImagemPNGBuilder());
		System.out.println(gerador.gerarImagem());
	}
}
