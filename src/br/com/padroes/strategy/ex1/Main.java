package br.com.padroes.strategy.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Colaborador> colaboradores = new ArrayList<Colaborador>();

		
		Colaborador colaborador = new Colaborador(1, "Aparecida", "123", "Tester", 800d);
		colaboradores.add(colaborador);
		
		colaborador = new Colaborador(2, "Ferran", "321", "Pessoal de limpeza", 300d);
		colaboradores.add(colaborador);
		
		
		FolhaPagamento folha = new FolhaPagamento(colaboradores);
		System.out.println(folha.imprimirFolha());
	}
}
