package br.com.padroes.builder.prova;

public class Desenvolvedor implements Colaborador{

	@Override
	public Double calcularBonificacao(Double salario) {
		return salario*3;
	}

}
