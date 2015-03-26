package br.com.padroes.adapter;

public class ControleDeAdaptador {
	private static final int CONTROLE_DE_PONTO_ANTIGO = 1;
	private static final int CONTROLE_DE_PONTO_NOVO = 2;
	
	public ControleDePonto obterAdaptador(int tipo){
		if(tipo == CONTROLE_DE_PONTO_ANTIGO)
			return new ControleDePonto();
		else if(tipo == CONTROLE_DE_PONTO_NOVO)
			return new ControleDePontoAdapter();
		return null;
	}
}
