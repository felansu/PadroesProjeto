package br.com.padroes.abstractfactorymethod.modelo;

public class EmissorMasterCard implements Emissor {
	@Override public void realizarEmissao() {System.out.println("Emissao MasterCard");}
}