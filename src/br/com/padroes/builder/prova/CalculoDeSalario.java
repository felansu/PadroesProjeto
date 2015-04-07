package br.com.padroes.builder.prova;

public class CalculoDeSalario {
	private static final int ANALISTA = 1;

	public static Colaborador realizarCalculoSalario(Integer tipo) {
		if (tipo.equals(ANALISTA))
			return new AnalistaDeSistemas();
		else
			return new Desenvolvedor();
	}
}
