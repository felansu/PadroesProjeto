package br.com.padroes.adapter;


public class MainPonto {
	public static void main(String[] args) {
		ControleDePonto cp = new ControleDePonto();
		Colaborador col = new Colaborador("Ferran","3454");
		cp.registrarEntrada(col);
		cp.registrarSaida(col);
		
		ControleDePontoAdapter cpn = new ControleDePontoAdapter();
		cpn.registrarEntrada(col);
		cpn.registrarSaida(col);
		
		new ControleDeAdaptador().obterAdaptador(1).registrarEntrada(col);
		new ControleDeAdaptador().obterAdaptador(1).registrarSaida(col);
		
		new ControleDeAdaptador().obterAdaptador(2).registrarEntrada(col);
		new ControleDeAdaptador().obterAdaptador(2).registrarSaida(col);
	}
}
