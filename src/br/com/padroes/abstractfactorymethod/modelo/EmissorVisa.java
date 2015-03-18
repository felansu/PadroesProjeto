package br.com.padroes.abstractfactorymethod.modelo;

public class EmissorVisa implements Emissor {
	@Override public void realizarEmissao() {System.out.println("Emissao VISA");}
}