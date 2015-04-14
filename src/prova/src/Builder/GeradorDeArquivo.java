package Builder;

public class GeradorDeArquivo {
	private static final int SPED_FISCAL = 1;

	public static void gerarArquivoSped(String Texto, Integer tipo) {
		if (tipo.equals(SPED_FISCAL))
			new SpedFiscal().gerarArquivo(Texto);
		else
			new SpedContabil().gerarArquivo(Texto);
	}
}
