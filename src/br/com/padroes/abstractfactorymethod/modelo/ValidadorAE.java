package br.com.padroes.abstractfactorymethod.modelo;

public class ValidadorAE implements Validador{

	@Override
	public void realizarValidacao() {
		System.out.println("Fazendo validação do AE");
	}

}
