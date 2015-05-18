package br.com.padroes.strategy.ex1;

public class CalculaImposto3 implements CalculaImposto {

	@Override
	public double calculaImposto(double salario) {
		return salario * 0.14;
	}

}
