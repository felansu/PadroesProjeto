package br.com.padroes.Singleton.ex1;

public class Main {
	public static void main(String[] args) {
		Configuracao config = Configuracao.getInstance();
		System.out.println(config.getPropiedade("nome"));
		System.out.println(config.getPropiedade("idade"));
	}
}
