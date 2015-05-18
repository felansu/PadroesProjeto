package br.com.padroes.observer.ex1;

import java.util.ArrayList;

public class MainAcao {
	public static void main(String[] args) {
		Acao acaoPetro = new Acao("Petrobras", 100D, new ArrayList<>());
		AcaoObserver corretora1 = new Corretora("SANTANDER");
		AcaoObserver corretora2 = new Corretora("BRADESCO");

		AcaoObserver investidora1 = new Investidora("BRADESCO");
		AcaoObserver investidora2 = new Investidora("BRADESCO");
		acaoPetro.registraInteressados(corretora1);
		acaoPetro.registraInteressados(corretora2);
		
		acaoPetro.registraInteressados(investidora1);
		acaoPetro.registraInteressados(investidora2);
		
		acaoPetro.setValor(120D);
	}
}
