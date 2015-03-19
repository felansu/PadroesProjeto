package br.com.padroes.abstractfactorymethod.modelo;

public class ValidadorVisa implements Validador{

	@Override
	public void realizarValidacao() {
		System.out.println("Fazendo validação do Visa");
	}

}
