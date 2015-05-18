package br.com.padroes.strategy.ex1;

import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {

	CalculaImposto calculaImposto = null;

	private List<Colaborador> colaborador = new ArrayList<Colaborador>();

	public FolhaPagamento(List<Colaborador> colaborador) {
		super();
		this.colaborador = colaborador;
	}

	protected String imprimirFolha() {
		StringBuilder folhaPagamento = new StringBuilder();

		double totalFolhaPagamento = 0;

		for (Colaborador colaborador : this.colaborador) {
			double imposto = 0;

			if (colaborador.getSalario() > 0 && colaborador.getSalario() < 2000) {
				calculaImposto = new CalculaImposto1();
				imposto = calculaImposto.calculaImposto(colaborador
						.getSalario());
			} else if (colaborador.getSalario() >= 2000
					&& colaborador.getSalario() < 4000) {
				calculaImposto = new CalculaImposto2();
				imposto = calculaImposto.calculaImposto(colaborador
						.getSalario());
			} else if (colaborador.getSalario() >= 4000
					&& colaborador.getSalario() < 10000) {
				calculaImposto = new CalculaImposto3();
				imposto = calculaImposto.calculaImposto(colaborador
						.getSalario());
			} else if (colaborador.getSalario() >= 10000) {
				calculaImposto = new CalculaImposto4();
				imposto = calculaImposto.calculaImposto(colaborador
						.getSalario());
			}
			totalFolhaPagamento += colaborador.getSalario();

			folhaPagamento.append("\n\nNome do colaborador: "
					+ colaborador.getNome());
			folhaPagamento.append("\nCargo: " + colaborador.getCargo());
			folhaPagamento.append("\nSalario bruto: " + colaborador.getSalario());
			folhaPagamento.append("\nImpostos: " + imposto);
			folhaPagamento.append("\nSal�rio l�quido: "
					+ (colaborador.getSalario() - imposto));

		}
		folhaPagamento.append("\n\nTotal da folha de pagamento: "
				+ totalFolhaPagamento);
		return folhaPagamento.toString();
	}
}
