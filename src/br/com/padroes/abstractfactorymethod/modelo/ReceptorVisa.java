package br.com.padroes.abstractfactorymethod.modelo;

public class ReceptorVisa implements Receptor{
	@Override public void realizarRecepcao() {System.out.println("Recebendo VISA");}
}