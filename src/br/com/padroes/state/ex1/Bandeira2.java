package br.com.padroes.state.ex1;

public class Bandeira2 implements Bandeira {

	@Override
	public double calculaValorCorrida(Double km) {
		return km * 3;
	}

}
