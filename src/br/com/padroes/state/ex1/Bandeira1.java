package br.com.padroes.state.ex1;

public class Bandeira1 implements Bandeira {

	@Override
	public double calculaValorCorrida(Double km) {
		return km * 2;
	}

}
