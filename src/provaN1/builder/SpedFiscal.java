package provaN1.builder;

public class SpedFiscal implements Sped {

	@Override
	public void gerarArquivo(String texto) {
		System.out.println("SpedFiscal: Gerando arquivo... "+texto);
	}

}
