package br.com.padroes.abstractfactorymethod.modelo;

public class ReceptorMasterCard implements Receptor{
	@Override public void realizarRecepcao() { System.out.println("Recebendo MasterCard");}
}