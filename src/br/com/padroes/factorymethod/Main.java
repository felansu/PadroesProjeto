package br.com.padroes.factorymethod;

public class Main {
	public static void main(String[] args) {
		EmissorCreator creator = new EmissorCreator();
		
		Emissor emisor1 =  creator.create(EmissorCreator.EMAIL);
		emisor1.enviar("Envia");
	}
}
