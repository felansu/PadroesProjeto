package br.com.padroes.abstractfactorymethod.modelo;

public class ValidadorMasterCard implements Validador{

	@Override
	public void realizarValidacao() {
		System.out.println("Fazendo valida��o do MasterCard");
	}

}
